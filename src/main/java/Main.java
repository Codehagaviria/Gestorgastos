public class Main {
    public static void main(String[] args) {
        // Crear y usar objetos de Usuario
        Usuario usuario = new Usuario(1, "Gasto personal", 250000, "Entretenimiento", "2024-10-24", "Juan Pérez", "juan@example.com", "password123");
        usuario.imprimirDetalles();

        // Crear y usar objetos de RegistroGasto
        Registrogasto registroGasto = new Registrogasto(2, "Compra de libros", "2024-10-24", 35000, "Educación");
        registroGasto.imprimirDetalles();

        // Crear y usar objetos de Categoria
        Categoria categoria = new Categoria(3, "Compra de alimentos", "2024-10-24", 400000, "Hogar", "Mensual");
        categoria.imprimirDetalles();

        // Seleccionar una categoría de las disponibles
        categoria.seleccionarCategoria(2);  // Selecciona "Transporte"
        System.out.println("Categoría seleccionada: " + categoria.getCategoria());
    }
}
