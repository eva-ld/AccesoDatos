import java.io.File;
import java.io.File;
import java.io.IOException;

public class Ej3_5 {
    public static void main(String[] args) {

        // Crear directorio copias en la carpeta de proyecto
        File directorioCopias = new File("copias");

        if (directorioCopias.mkdir()) {
            System.out.println("Directorio \"copias\" creado correctamente");
        } else if (directorioCopias.exists()) {
            System.out.println("El directorio \"copias\" ya existe");
        } else {
            System.out.println("No se ha podido crear el directorio \"copias\"");
        }

        // Crear fichero "config.txt" dentro del directorio "copias"
        File ficheroConfig = new File(directorioCopias, "config.txt");

        try {
            if (ficheroConfig.createNewFile()) {
                System.out.println("Fichero 'config.txt' creado correctamente.");
            } else {
                System.out.println("El fichero 'config.txt' ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error de E/S al intentar crear el fichero: " + e.getMessage());
        }

        // Mostrar el contenido del directorio "copias"

        System.out.println("=== CONTENIDO DENTRO DE COPIAS ===");
        File[] elementos = directorioCopias.listFiles();

    }

}

        // 3. Mostrar el contenido del directorio "copias"
        System.out.println("\n--- Contenido del directorio 'copias' ---");
        File[] elementos = directorioCopias.listFiles();

        if (elementos != null && elementos.length > 0) {
            for (File elemento : elementos) {
                if (elemento.isDirectory()) {
                    System.out.println("[Directorio] " + elemento.getName());
                } else if (elemento.isFile()) {
                    System.out.println("[Fichero] " + elemento.getName());
                }
            }
        } else {
            System.out.println("El directorio está vacío.");
        }

        // 4. Modificación: Eliminar config.txt y comprobar qué ocurre al eliminar "copias"
        System.out.println("\n--- Eliminación de elementos ---");

        // Eliminación del fichero config.txt
        if (ficheroConfig.delete()) {
            System.out.println("Fichero 'config.txt' eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el fichero 'config.txt' (o no existía).");
        }

        // Intento de eliminación del directorio copias
        if (directorioCopias.delete()) {
            System.out.println("Directorio 'copias' eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el directorio 'copias'.");
        }
    }
}