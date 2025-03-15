package Menu;

public class Producto {
    private String nombre;
    private double precioConDecimales;
    private int precioSinDecimales;

    // Constructor
    public Producto(String nombre, double precioConDecimales, int precioSinDecimales) {
        this.nombre = nombre;
        this.precioConDecimales = precioConDecimales;
        this.precioSinDecimales = precioSinDecimales;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioConDecimales() {
        return precioConDecimales;
    }

    public int getPrecioSinDecimales() {
        return precioSinDecimales;
    }
}