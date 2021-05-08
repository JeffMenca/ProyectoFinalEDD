
package Classes;

import Estructuras.ListaCircular;
import GUI.Login;
import GUI.mainFrame;
import Objects.Usuario;

/**
 *
 * @author Jeffrey
 */
public class claseMain {
    
    public static ListaCircular listaUsuarios=new ListaCircular();
    public static Usuario usuarioActual;
    public static int cantidadColaboradores=0;

    public static void main(String[] args) {
        //Lllamada del form principal
        System.out.println("Inicio del programa");
        listaUsuarios.add(new Usuario(123, "jeff", "123", "Estudiante"));
        Login login= new Login();
    }
}
