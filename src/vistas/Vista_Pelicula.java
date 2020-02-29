/*
*Fraga Chavez Edson jair
*Ocampo Giles Karen Lizeth
*Vazquez Ernesto
*7B Informática
*Recursa:POO
*Evidencia: EI
 */
package vistas;


import Controlador.Conexion;
import Controlador.ExcepCine;
import Controlador.PeliculaController;
import Modelo.Pelicula;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arqui
 */
public class Vista_Pelicula extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Pelicula
     */
    public Vista_Pelicula() {
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        mostrarPeliculas();
        
        this.setLocationRelativeTo(null);
    }

   public   void mostrarPeliculas() {
        Conexion con=new Conexion();
	DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("idPelicula ");
        modelo.addColumn("Nombre ");
        modelo.addColumn("Descripcion ");
        modelo.addColumn("Año ");
	modelo.addColumn("Genero");
	tabla_pelicula.setModel(modelo);
	String sql="SELECT *FROM Peliculas";

	Object datos[]=new Object[5];
	Statement sentencia;
        try {
            sentencia = con.crearConexion().createStatement();
            ResultSet resultado=sentencia.executeQuery(sql);
        
            while(resultado.next()){
                datos[0]=resultado.getInt(1);
                datos[1]=resultado.getString(2);
                datos[2]=resultado.getString(3);
                datos[3]=resultado.getString(4);
                datos[4]=resultado.getString(5);
                modelo.addRow(datos);
	}
            
	tabla_pelicula.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Vista_ventaBoletos.class.getName()).log(Level.SEVERE, null, ex);
        }


}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscarNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_pelicula = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        spn_anio = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre_pelicula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_descripsion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spn_genero = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("GESTIÓN DE PÉLICULAS");

        btn_modificar.setBackground(new java.awt.Color(51, 51, 255));
        btn_modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Pélicula:");

        tabla_pelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPelicula ", "Nombre", "Descripsión", "Año", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_pelicula.setRowSelectionAllowed(false);
        tabla_pelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_peliculaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_pelicula);
        if (tabla_pelicula.getColumnModel().getColumnCount() > 0) {
            tabla_pelicula.getColumnModel().getColumn(0).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(1).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(2).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(3).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(4).setResizable(false);
        }

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setForeground(new java.awt.Color(204, 204, 255));

        spn_anio.setModel(new javax.swing.SpinnerNumberModel(2019, 1995, 2020, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Año:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Description:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Genero:");

        spn_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Terror", "Comedia", "Drama", "Ciencia Ficcion", "Suspenso", "SyFy", "" }));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_descripsion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spn_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spn_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spn_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_descripsion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(spn_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 102));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(jLabel3)
                            .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pelicula obj=new Pelicula();
        PeliculaController pe=new PeliculaController();
        
        obj.setNombre(txt_nombre_pelicula.getText());
        obj.setDescripcion(txt_descripsion.getText());
        obj.setAnio(spn_anio.getValue().toString());
        obj.setGenero(spn_genero.getSelectedItem().toString());
       

        try {
            if(pe.guardar(obj)){
        JOptionPane.showMessageDialog(this, "Registro Exitoso");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo realizar la insercción");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepCine ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
           // System.err.println(ex.getMessage());
        }
      
       
        mostrarPeliculas();
        

        txt_nombre_pelicula.setText("");
        txt_descripsion.setText("");
        spn_genero.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        
        String nombre=txt_buscarNombre.getText(); // se obtiene el nombre del campo
        PeliculaController ac= new PeliculaController();
        
        DefaultTableModel modelo =(DefaultTableModel)tabla_pelicula.getModel();
         modelo.setRowCount(0);
       
        try {
            List<Pelicula> al=ac.buscarPorNombre(nombre);
             Iterator<Pelicula> it=al.iterator();
            System.out.println(ac.buscarPorNombre(nombre));
             while (it.hasNext()) {
               Object fila[]=new Object[5];
               Pelicula obj=it.next();
               fila[0]=obj.getId();
               fila[1]=obj.getNombre();
               fila[2]=obj.getDescripcion();
               fila[3]=obj.getAnio();
               fila[4]=obj.getGenero();
              
                  
                  modelo.addRow(fila);
            }
             tabla_pelicula.setModel(modelo);
             
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        
        PeliculaController ac=new PeliculaController();
        
        
        //int row,colm;
        int row=tabla_pelicula.getSelectedRow();
        int colm=0;
        
        System.out.println(tabla_pelicula.getValueAt(row, colm));
        
        if(JOptionPane.showConfirmDialog(this,"¿Seguro de Eliminar?")==0){
            try {
                
                ac.eliminar((int)tabla_pelicula.getValueAt(row, colm));
                JOptionPane.showMessageDialog(this, "Pelicula eliminada");
                mostrarPeliculas();
            } catch (SQLException ex) {
               // Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println(ex.getMessage());
            }
        }
 
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tabla_peliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_peliculaMouseClicked
        
        int seleccion = tabla_pelicula.getSelectedRow();// se selecciona la posicion con el click
        txt_nombre_pelicula.setText(String.valueOf( tabla_pelicula.getValueAt(seleccion,1)  ));
        txt_descripsion.setText(String.valueOf( tabla_pelicula.getValueAt(seleccion,2)  ));
        String anio =String.valueOf( tabla_pelicula.getValueAt(seleccion,3));
        int an=Integer.valueOf(anio);
        spn_anio.setValue(an);
        spn_genero.setSelectedItem(String.valueOf( tabla_pelicula.getValueAt(seleccion,4)) );

        jButton1.setEnabled(false);
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
    }//GEN-LAST:event_tabla_peliculaMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        txt_nombre_pelicula.setText("");
        txt_descripsion.setText("");
        
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        jButton1.setEnabled(true);
        btn_cancelar.setEnabled(false);
        mostrarPeliculas();
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        
       PeliculaController modi=new PeliculaController();
       Pelicula nuevoRegistro=new Pelicula();
       
        
       DefaultTableModel model = (DefaultTableModel)tabla_pelicula.getModel();
        int fila = tabla_pelicula.getSelectedRow();
        if(fila>=0){//si se selecciona una fila
      
      nuevoRegistro.setId((int) tabla_pelicula.getValueAt(fila, 0));
            //System.out.println(nuevoRegistro.getId());
      nuevoRegistro.setNombre(txt_nombre_pelicula.getText());
      nuevoRegistro.setDescripcion(txt_descripsion.getText());
      nuevoRegistro.setAnio(spn_anio.getValue().toString());
      nuevoRegistro.setGenero(spn_genero.getSelectedItem().toString());
      
        try {
            modi.modificar(nuevoRegistro);
           mostrarPeliculas();
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
            //System.err.println(ex.getMessage());
        }  catch (ExcepCine ex) {
              JOptionPane.showMessageDialog(this, ex.getMessage());
           }
        }else{
            JOptionPane.showMessageDialog(this, "Pelicula no seleccionada");
        }

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
      
        Inicio_Menu regresa=new Inicio_Menu();
        regresa.setVisible(true);
        
        this.setVisible(false);
      
        
    }//GEN-LAST:event_btn_regresarActionPerformed


    
 
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
            java.util.logging.Logger.getLogger(Vista_Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Pelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private javax.swing.JSpinner spn_anio;
    private javax.swing.JComboBox<String> spn_genero;
    public javax.swing.JTable tabla_pelicula;
    private javax.swing.JTextField txt_buscarNombre;
    private javax.swing.JTextField txt_descripsion;
    private javax.swing.JTextField txt_nombre_pelicula;
    // End of variables declaration//GEN-END:variables
}
