package model;

/**
 * Clase que representa un tour ofrecido por Llanquihue Tour.
 *
 * @author Satcha
 * @version 1.0
 */
public class Tour {

    /** Nombre del tour */
    private String nombre;

    /** Tipo de tour (ej: gastronómico, cultural, lacustre) */
    private String tipo;

    /** Precio del tour en pesos chilenos */
    private int precio;

    /**
     * Constructor que inicializa un tour con sus datos principales.
     *
     * @param nombre Nombre del tour
     * @param tipo   Tipo de tour
     * @param precio Precio del tour
     */
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del tour.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del tour.
     *
     * @param nombre nuevo nombre del tour
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo del tour.
     *
     * @return tipo del tour
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del tour.
     *
     * @param tipo nuevo tipo del tour
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return precio del tour
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del tour.
     *
     * @param precio nuevo precio del tour
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Retorna una representación en texto del tour.
     *
     * @return cadena con los datos del tour
     */
    @Override
    public String toString() {
        return "Tour{nombre='" + nombre + "', tipo='" + tipo + "', precio=" + precio + "}";
    }
}
