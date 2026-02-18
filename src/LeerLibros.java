import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerLibros {

    public ArrayList<Libro> leerLibros(String nombreArchivo) {
        System.out.println("--- Leyendo datos del archivo... ---");
        ArrayList<Libro> listaLeida = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {

            listaLeida = (ArrayList<Libro>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo (quizás no existe): " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encuentra la clase Libro: " + e.getMessage());
        }

        return listaLeida;
    }
}
