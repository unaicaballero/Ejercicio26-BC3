import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuardarLibros {
    public void guardarLibros(String nombreArchivo, ArrayList<Libro> listaLibros) {
        System.out.println("--- Guardando datos en archivo... ---");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(listaLibros);
            System.out.println("Libros guardados correctamente en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}