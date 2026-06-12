package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase encargada de leer el archivo de datos y crear objetos Tour.
 *
 * @author Satcha Belen Quispe Parada
 * @version 1.0
 */
public class GestorDatos {

    /**
     * Lee el archivo tours.txt y retorna una lista de objetos Tour.
     *
     * @return ArrayList con los tours leidos desde el archivo.
     */
    public ArrayList<Tour> cargarTours() {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new InputStreamReader(
                GestorDatos.class.getClassLoader().getResourceAsStream("tours.txt")))) {

            String linea;

            // Leer el archivo linea por linea
            while ((linea = lector.readLine()) != null) {

                // Separar los datos usando punto y coma como delimitador
                String[] datos = linea.split(";");

                // Crear objeto Tour con los datos separados
                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);

                // Agregar el objeto al ArrayList
                listaTours.add(tour);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}