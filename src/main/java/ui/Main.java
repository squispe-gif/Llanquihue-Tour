package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal del sistema de gestión de tours de Llanquihue Tour.
 * Muestra todos los tours, luego filtra por tipo y por precio.
 *
 * @author Satcha
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours();

        // ─── CATÁLOGO COMPLETO ───
        System.out.println(" =====    CATÁLOGO COMPLETO - LLANQUIHUE TOUR    ===== ");
        System.out.println();

        for (Tour tour : tours) {
            System.out.println("      Nombre : " + tour.getNombre());
            System.out.println("      Tipo   : " + tour.getTipo());
            System.out.println("      Precio : $" + tour.getPrecio());
            System.out.println("  ─────────────────────────────────────────");
        }

        // ─── FILTRADO: tours gastronómicos ───
        System.out.println();
        System.out.println(" =====    TOURS GASTRONÓMICOS    ===== ");
        System.out.println();

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronomico")) {
                System.out.println("      Nombre : " + tour.getNombre());
                System.out.println("      Precio : $" + tour.getPrecio());
                System.out.println("  ─────────────────────────────────────────");
            }
        }

        // ─── FILTRADO: precio mayor a $20.000 ───
        System.out.println();
        System.out.println(" =====    TOURS CON PRECIO MAYOR A $20.000    ===== ");
        System.out.println();

        for (Tour tour : tours) {
            if (tour.getPrecio() > 20000) {
                System.out.println("      Nombre : " + tour.getNombre());
                System.out.println("      Tipo   : " + tour.getTipo());
                System.out.println("      Precio : $" + tour.getPrecio());
                System.out.println("  ─────────────────────────────────────────");
            }
        }
    }
    }
