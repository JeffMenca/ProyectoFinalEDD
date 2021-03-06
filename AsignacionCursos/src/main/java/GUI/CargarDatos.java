/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Analyzers.Lexico;
import Analyzers.Parser;
import Classes.claseMain;
import Objects.*;
import btree.LlaveEntero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jeffrey
 */
public class CargarDatos extends javax.swing.JFrame {

    public String texto = "";
    public ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public ArrayList<Usuario> usuarios = new ArrayList<>();
    public ArrayList<Edificio> edificios = new ArrayList<>();
    public ArrayList<Salon> salones = new ArrayList<>();
    public ArrayList<Catedratico> catedraticos = new ArrayList<>();
    public ArrayList<Curso> cursos = new ArrayList<>();
    public ArrayList<Horario> horarios = new ArrayList<>();
    public ArrayList<Asignar> asignaciones = new ArrayList<>();

    /**
     * Creates new form CargarDatos
     */
    public CargarDatos() {
        initComponents();
        this.setVisible(true);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 143, 157));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 143, 157));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar datos");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione su archivo");

        jButton2.setBackground(new java.awt.Color(44, 85, 178));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cargar archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cargar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton8)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mainFrame main = new mainFrame();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String aux = "";
        texto = "";
        try {
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt files", "txt");
            JFileChooser file = new JFileChooser("C:\\Users\\Jeffrey\\Desktop");
            file.setFileFilter(filter);
            file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            file.showOpenDialog(this);
            File archivoSeleccionado = file.getSelectedFile();
            if (archivoSeleccionado != null) {
                FileReader archivos = new FileReader(archivoSeleccionado);
                try (BufferedReader lector = new BufferedReader(archivos)) {
                    while ((aux = lector.readLine()) != null) {
                        texto += aux + "\n";
                    }
                }
            }
            jLabel3.setText("Selecciono el archivo: " + file.getName(file.getSelectedFile()));
            jTextArea2.setText("Se cargo el archivo correctamente, presione generar");
        } catch (IOException ex) {
            jTextArea2.setText("No se logro cargar el archivo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StringReader reader = new StringReader(texto);
        Lexico lexico = new Lexico(reader);
        Parser parser = new Parser(lexico);
        try {
            parser.parse();
            estudiantes = parser.getEstudiantesList();
            usuarios = parser.getUsuarioList();
            edificios = parser.getEdificiosList();
            salones = parser.getSalonesList();
            catedraticos = parser.getCatedraticosList();
            cursos = parser.getCursosList();
            horarios = parser.getHorariosList();
            asignaciones = parser.getAsignacionesList();

            //Estudiantes
            for (int i = 0; i < estudiantes.size(); i++) {
                Estudiante estudianteCD = estudiantes.get(i);
                try {
                    Estudiante nuevoEstudiante = new Estudiante(estudianteCD.getCarnet(), estudianteCD.getNombre(), estudianteCD.getDireccion());
                    if (claseMain.listaEstudiantes.add(nuevoEstudiante)) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe un estudiante con ese carnet");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            }

            //Usuarios
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuarioCD = usuarios.get(i);
                if (usuarioCD.getTipo().equals("Estudiante")) {
                    try {

                        if (claseMain.listaUsuarios.buscarID(usuarioCD.getId()) != null) {
                            JOptionPane.showMessageDialog(null, "El id ya existe (carnet)");
                        } else {
                            Estudiante nuevo = claseMain.listaEstudiantes.get(usuarioCD.getId());
                            if (nuevo != null) {
                                Usuario nuevoUser = new Usuario(usuarioCD.getId(), usuarioCD.getNombre(), usuarioCD.getPassword(), "Estudiante");
                                claseMain.listaUsuarios.add(nuevoUser);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontro un estudiante con ese carnet");
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error o no se encontro el estudiante");
                    }
                } else {
                    try {
                        claseMain.cantidadColaboradores++;
                        Usuario nuevoUser = new Usuario(claseMain.cantidadColaboradores, usuarioCD.getNombre(), usuarioCD.getPassword(), "Colaborador");
                        claseMain.listaUsuarios.add(nuevoUser);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }

                }
            }

            //Edificios
            for (int i = 0; i < edificios.size(); i++) {
                Edificio edificioCD = edificios.get(i);
                try {
                    if (claseMain.listaEdificios.buscarDato(edificioCD.getNombre()) != null) {
                        JOptionPane.showMessageDialog(null, "El edificio ya existe");
                    } else {
                        Edificio nuevoEdificio = new Edificio(edificioCD.getNombre());
                        claseMain.listaEdificios.add(nuevoEdificio);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            }

            //Salones
            for (int i = 0; i < salones.size(); i++) {
                Salon salonCD = salones.get(i);
                try {
                    Edificio edificio = (Edificio) claseMain.listaEdificios.buscarDato(salonCD.getEdificio()).getData();
                    if (edificio != null) {

                        Salon salon = new Salon(salonCD.getNumero(), salonCD.getCapacidad());
                        if (edificio.salones.add(salon)) {
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el salon ingresado");
                    }
                } catch (Exception e) {
                    
                    JOptionPane.showMessageDialog(null, "no ingreso el edificio o no se encontro");
                }
            }

            //Catedraticos
            for (int i = 0; i < catedraticos.size(); i++) {
                Catedratico catedraticoCD = catedraticos.get(i);
                try {
                    Catedratico nuevoCatedratico = new Catedratico(catedraticoCD.getId(), catedraticoCD.getNombre(), catedraticoCD.getDireccion());
                    claseMain.listaCatedraticos.insertar(nuevoCatedratico);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            }

            //Curso
            for (int i = 0; i < cursos.size(); i++) {
                Curso cursoCD = cursos.get(i);
                try {
                    if (claseMain.listaCursos.buscarID(cursoCD.getCodigo()) != null) {
                        JOptionPane.showMessageDialog(null, "El codigo ya existe (id)");
                    } else {
                        Curso nuevoCurso = new Curso(cursoCD.getCodigo(), cursoCD.getNombre(), cursoCD.getSemestre(), cursoCD.getCreditos());
                        claseMain.listaCursos.add(nuevoCurso);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            }

            //Horario
            for (int i = 0; i < horarios.size(); i++) {
                Horario horarioCD = horarios.get(i);
                Object edificioObject = claseMain.listaEdificios.buscarDato(horarioCD.getEdificioCD()).getData();
                if (edificioObject != null) {
                    Edificio edificio = (Edificio) edificioObject;
                    Object salonObject = edificio.salones.getData(String.valueOf(horarioCD.getSalonCD()));

                    if (salonObject != null) {
                        Salon salon = (Salon) salonObject;
                        Object cursoObject = claseMain.listaCursos.buscarID(horarioCD.getCursoCD()).getData();

                        if (cursoObject != null) {
                            Curso curso = (Curso) cursoObject;
                            Catedratico catedratico = (Catedratico)claseMain.listaCatedraticos.buscar(horarioCD.getCatedraticoCD()).getInfo();
                            if (catedratico != null) {
                                Horario repetido = (Horario) claseMain.listaHorarios.search(new LlaveEntero(horarioCD.getCodigo()));
                                if (repetido == null) {
                                    Horario horario = new Horario(horarioCD.getCodigo(), horarioCD.getPeriodo(), horarioCD.getDia(), curso, salon, edificio, catedratico);
                                    claseMain.listaHorarios.insert(new LlaveEntero(horarioCD.getCodigo()), horario);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ya existe un horario con ese codigo");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "No existe el catedratico ingresado");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el salon ingresado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe el edificio ingresado");
                }

            }

            //Asignaciones
            for (int i = 0; i < asignaciones.size(); i++) {
                Asignar asignacionCD = asignaciones.get(i);
                try {
                    Estudiante nuevo = claseMain.listaEstudiantes.get(asignacionCD.getCarnet());
                    if (nuevo != null) {
                        claseMain.cantidadAsignaciones++;
                        Horario horario =(Horario) claseMain.listaHorarios.search(new LlaveEntero(asignacionCD.getHorarioCargaDatos()));
                        if (claseMain.listaAsignaciones.obtenerAsignacionesSalon(horario.getSalon().getNumero(), horario.getEdificio().getNombre()) < horario.getSalon().getCapacidad()) {
                            
                            Asignar asignacion = new Asignar(claseMain.cantidadAsignaciones, asignacionCD.getCarnet(), horario, asignacionCD.getZona(), asignacionCD.getExamenFinal());
                            claseMain.listaAsignaciones.add(asignacion);
                        } else {
                            JOptionPane.showMessageDialog(null, "Ya se alcanzo la capacidad maxima en ese salon");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro un estudiante con ese carnet");
                    }

                } catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e.getMessage());
                    JOptionPane.showMessageDialog(null, "Ocurrio un error o no se encontro el estudiante");
                }
            }

            jTextArea2.setText("Se cargaron los datos correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            jTextArea2.setText("Error al cargar los datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
