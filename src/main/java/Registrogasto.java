public class Registrogasto extends Gastos {
    // Constructor
    public Registrogasto(int id, String descripcion, String fecha, double monto, String categoria) {
        super(id, descripcion, monto, categoria, fecha); // Agrega 'fecha' aquí
    }

    // Método get
    public String getFecha() {
        return super.getFecha(); // Llama al método getFecha de la clase base
    }

    // Método set
    public void setFecha(String fecha) {
        super.setFecha(fecha); // Establece la fecha en la clase base
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles(); // Imprime los detalles de Gastos
    }
}

