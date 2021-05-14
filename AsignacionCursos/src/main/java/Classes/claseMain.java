package Classes;

import Estructuras.ArbolAVLCatedraticos;
import Estructuras.HashTable;
import Estructuras.ListaCircular;
import GUI.Login;
import GUI.mainFrame;
import Objects.Catedratico;
import Objects.Estudiante;
import Objects.Usuario;

/**
 *
 * @author Jeffrey
 */
public class claseMain {

    public static ListaCircular listaUsuarios = new ListaCircular();
    public static ListaCircular listaEdificios = new ListaCircular();
    public static ListaCircular listaCursos = new ListaCircular();
    public static HashTable listaEstudiantes = new HashTable();
    public static ArbolAVLCatedraticos listaCatedraticos = new ArbolAVLCatedraticos();
    public static Usuario usuarioActual;
    public static int cantidadColaboradores = 0;

    public static void main(String[] args) {
        //Lllamada del form principal
        System.out.println("Inicio del programa");
        listaUsuarios.add(new Usuario(123, "admin", "123", "Estudiante"));

        
        

        Login login = new Login();

    }
}
