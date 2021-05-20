package Classes;

import Estructuras.ArbolAVLCatedraticos;
import Estructuras.HashTable;
import Estructuras.ListaCircular;
import GUI.Login;
import GUI.mainFrame;
import Objects.Catedratico;
import Objects.Estudiante;
import Objects.Horario;
import Objects.Usuario;
import btree.ArbolB;
import btree.LlaveEntero;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class claseMain {

    public static ListaCircular listaUsuarios = new ListaCircular();
    public static ListaCircular listaEdificios = new ListaCircular();
    public static ListaCircular listaCursos = new ListaCircular();
    public static ListaCircular listaAsignaciones = new ListaCircular();
    public static HashTable listaEstudiantes = new HashTable();
    public static ArbolAVLCatedraticos listaCatedraticos = new ArbolAVLCatedraticos();
    public static ArbolB listaHorarios = new ArbolB();
    public static Usuario usuarioActual;
    public static int cantidadColaboradores = 0;
    public static int cantidadAsignaciones=0;

    public static void main(String[] args) {
        //Lllamada del form principal
        System.out.println("Inicio del programa");
        listaUsuarios.add(new Usuario(123, "admin", "123", "Colaborador"));
        
        
        Login login = new Login();

    }
    
    public static void guardarImagen(String texto, String absolutePath) {
        //Writer para leer el archivo 
        FileWriter writer = null;
        try {
            //Crea el archivo en la absolute path
            writer = new FileWriter(absolutePath, true);
            try (BufferedWriter out = new BufferedWriter(writer)) {
                out.write("");
                out.write(texto);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la imagen");
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen");
            }
        }
    }
}
