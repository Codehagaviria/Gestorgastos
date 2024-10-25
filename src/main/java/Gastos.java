public class Gastos {
    private int id;
    private String descripcion;
    private String fecha; // Nuevo campo
    private double monto;
    private String categoria;


    // Constructor
    public Gastos(int id, String descripcion, double monto, String categoria, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.categoria = categoria;
        this.fecha = fecha; // Inicialización del nuevo campo
    }


    // Métodos get
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFecha() {
        return fecha; // Nuevo método get para fecha
    }

    // Métodos set
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha; // Nuevo método set para fecha
    }

    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Monto: " + monto);
        System.out.println("Categoría: " + categoria);
        System.out.println("Fecha: " + fecha); // Añadir fecha a la salida
    }
}
