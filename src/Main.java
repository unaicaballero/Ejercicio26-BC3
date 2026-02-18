import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String archivo = "libros.ser";

        ArrayList<Libro> misLibros = new ArrayList<>();
        misLibros.add(new Libro("El Quijote", "Miguel de Cervantes", 1605));
        misLibros.add(new Libro("1984", "George Orwell", 1949));
        misLibros.add(new Libro("Cien años de soledad", "G. García Márquez", 1967));

        GuardarLibros escritor = new GuardarLibros();
        escritor.guardarLibros(archivo, misLibros);

        System.out.println();

        LeerLibros lector = new LeerLibros();
        ArrayList<Libro> librosRecuperados = lector.leerLibros(archivo);

        if (librosRecuperados.isEmpty()) {
            System.out.println("No se han podido cargar libros.");
        } else {
            for (Libro l : librosRecuperados) {
                System.out.println(l);
            }
        }
    }
}