package btree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

    public Main() {

    }

    public static void main(String[] args) throws IOException {

        System.out.println("prueba");

        String tempFolder = System.getProperty("java.io.tmpdir");

        ArbolB tree = new ArbolB(2);
        ArbolB treeS = new ArbolB(2);

        int[] values = { 6,11,5,4,8,9,12,21,1,2,3,4,5,6,7,8 };

        String[] valores =
        { "hola", "mundo", "rudy", "piedra", "algo", "nada" };

        for (int i = 0; i < values.length; i++) {
            tree.insert(new LlaveEntero(1), "Si");
            tree.insert(new LlaveEntero(2), "Si");
        }

        for (int i = 0; i < valores.length; i++) {
            treeS.insert(new LlaveCadena(valores[i]), "Dummy " + i);
        }

        
      
        
           
            File imagenSalida = new File("./imagenYArbolGenerado.dot");
            if (!imagenSalida.exists()) {
                imagenSalida.createNewFile();
            } else {
                imagenSalida.delete();
                imagenSalida.createNewFile();
            }
            guardarImagen(tree.toDot(), imagenSalida.getAbsolutePath());
            String command = "dot -Tpng imagenYArbolGenerado.dot -o imagenYArbolGenerado.png";
            Runtime.getRuntime().exec(command);
        
           
    
        
        try {

            FileWriter f = new FileWriter( "grafo1.txt");
            System.out.println(tree.toDot());
            f.write(tree.toDot());

            f.close();

            f = new FileWriter( "grafo2.txt");

            f.write(treeS.toDot());

            f.close();

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
                
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        
       
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        
        

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
    
    static void doDot( String pInput, String pOutput ) {
        try {

            String dotPath =
                "C:\\Program Files (x86)\\Graphviz2.26.3\\bin\\dot.exe";

            String fileInputPath = pInput;
            String fileOutputPath = pOutput;

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
        
        
        try {
            
            
            String[] cmd = new String[4];
            cmd[0] = "cmd";
            cmd[1] = "/C";
            cmd[2] = "start";
            cmd[3] = pOutput;
            
            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);
            
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }        

    }

}
