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
import Controlador.ventaBoletosController;
import Modelo.Pelicula;
import Modelo.ventaBoletos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Vista_ventaBoletos extends javax.swing.JFrame {

    /**
     * Creates new form Vista_ventaBoletos
     */
    public Vista_ventaBoletos()  {
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_cancelar.setEnabled(false);  
        mostrarPeliculas();
        mostrarBoletos();
        
        this.setLocationRelativeTo(null);
    }

   
void mostrarPeliculas() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pelicula = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_sala = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datosBoletos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_buscarNombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        spn_Cant_boletos = new javax.swing.JSpinner();
        txt_hora = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GESTIÓN DE BOLETOS");

        tabla_pelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de pelicula", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_pelicula);
        if (tabla_pelicula.getColumnModel().getColumnCount() > 0) {
            tabla_pelicula.getColumnModel().getColumn(0).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(1).setResizable(false);
            tabla_pelicula.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona tu pelicula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Hora:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad de boletos:");

        cmb_sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sala:");

        btn_registrar.setBackground(new java.awt.Color(102, 255, 102));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(51, 102, 255));
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

        tabla_datosBoletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre de peicula", "Genero", "Hora ", "Cantidad de boletos", "Sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_datosBoletos.setFocusable(false);
        tabla_datosBoletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_datosBoletosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_datosBoletos);
        if (tabla_datosBoletos.getColumnModel().getColumnCount() > 0) {
            tabla_datosBoletos.getColumnModel().getColumn(0).setResizable(false);
            tabla_datosBoletos.getColumnModel().getColumn(1).setResizable(false);
            tabla_datosBoletos.getColumnModel().getColumn(2).setResizable(false);
            tabla_datosBoletos.getColumnModel().getColumn(3).setResizable(false);
            tabla_datosBoletos.getColumnModel().getColumn(4).setResizable(false);
            tabla_datosBoletos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Datos de boletos registrados!");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar por nombre de pelicula un boleto registrado..");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nombre:");

        btn_buscar.setBackground(new java.awt.Color(153, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 153, 51));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        spn_Cant_boletos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        txt_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        txt_hora.setText("11:33:39 PM");
        txt_hora.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spn_Cant_boletos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel6)
                                .addGap(393, 393, 393))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btn_buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(cmb_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spn_Cant_boletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btn_registrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       
        Inicio_Menu regresar=new Inicio_Menu();
        regresar.setVisible(true);
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
        ventaBoletos obj=new ventaBoletos();
        ventaBoletosController nuevaVentaB=new ventaBoletosController();
        
       DefaultTableModel model = (DefaultTableModel)tabla_pelicula.getModel();
        int fila = tabla_pelicula.getSelectedRow();
        if(fila>=0){//si se selecciona una fila
       
      obj.setId((int)tabla_pelicula.getValueAt(fila, 0));
      
      obj.setNombre(tabla_pelicula.getValueAt(fila, 1).toString());
      obj.setDescripcion(tabla_pelicula.getValueAt(fila, 2).toString());
      obj.setAnio(tabla_pelicula.getValueAt(fila, 3).toString());
      obj.setGenero(tabla_pelicula.getValueAt(fila,4).toString());
           
      
        
        }else{
            JOptionPane.showMessageDialog(this, "Pelicula no seleccionada");
        }
        
        
        obj.setCant_Boletos((int)spn_Cant_boletos.getValue());
        obj.setSala(cmb_sala.getSelectedItem().toString().charAt(0));
        obj.setHora(txt_hora.getText());
       

        try {
            if(nuevaVentaB.guardar(obj)){
                JOptionPane.showMessageDialog(this, "Registro Exitoso");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo realizar la insercción");
            }
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(Vista_ventaBoletos.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        } catch (ExcepCine ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
      
//        txt_hora.setText(" ");
//        cmb_sala.setSelectedIndex(0);
          
        mostrarBoletos();


    }//GEN-LAST:event_btn_registrarActionPerformed

    private void tabla_datosBoletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosBoletosMouseClicked
        // TODO add your handling code here:
        int seleccion = tabla_datosBoletos.getSelectedRow();// se selecciona la posicion con el click
           
           System.out.println(tabla_datosBoletos.getValueAt(seleccion,3 ).toString());
           
           String boleto =String.valueOf( tabla_datosBoletos.getValueAt(seleccion,3));
           
           int bol =Integer.valueOf( boleto);
           spn_Cant_boletos.setValue(bol);
           
           cmb_sala.setSelectedItem(tabla_datosBoletos.getValueAt(seleccion,4 ));
           txt_hora.setText(tabla_datosBoletos.getValueAt(seleccion,2 ).toString());

        btn_registrar.setEnabled(false);
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        
    }//GEN-LAST:event_tabla_datosBoletosMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        ventaBoletosController bc = new ventaBoletosController();
        int row=tabla_datosBoletos.getSelectedRow();
        int colm=0;
        
        if(JOptionPane.showConfirmDialog(this,"¿Seguro de Eliminar?")==0){
            try {
                
                bc.eliminar((int)tabla_datosBoletos.getValueAt(row, colm));
                JOptionPane.showMessageDialog(this, "Pelicula eliminada");
                mostrarBoletos();
            } catch (SQLException ex) {
               // Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String nombre=txt_buscarNombre.getText(); // se obtiene el nombre del campo
        ventaBoletosController ac= new ventaBoletosController();
        
        DefaultTableModel modelo =(DefaultTableModel)tabla_datosBoletos.getModel();
         modelo.setRowCount(0);
         
         try {
            List<ventaBoletos> al=ac.buscarPorNombre(nombre);
             Iterator<ventaBoletos> it=al.iterator();
            System.out.println(ac.buscarPorNombre(nombre));
             while (it.hasNext()) {
               Object fila[]=new Object[5];
               ventaBoletos obj=it.next();
               fila[0]=obj.getId();
               fila[1]=obj.getNombre();
               fila[2]=obj.getHora();
               fila[3]=obj.getCant_Boletos();
               fila[4]=obj.getSala();
              
                  
                  modelo.addRow(fila);
            }
             tabla_datosBoletos.setModel(modelo);
             
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        
        
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_registrar.setEnabled(true);
        btn_cancelar.setEnabled(false);
        mostrarPeliculas();
        mostrarBoletos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        ventaBoletosController modi=new ventaBoletosController();
        ventaBoletos nuevoRegistro=new ventaBoletos();
        
        DefaultTableModel model = (DefaultTableModel)tabla_datosBoletos.getModel();
        int fila = tabla_datosBoletos.getSelectedRow();
        if(fila>=0){//si se selecciona una fila
            
        nuevoRegistro.setId((int) tabla_datosBoletos.getValueAt(fila, 0));
            //System.out.println(nuevoRegistro.getId());
            
      nuevoRegistro.setNombre(tabla_datosBoletos.getValueAt(fila, 1).toString());
      nuevoRegistro.setHora(txt_hora.getText());
      

      
      nuevoRegistro.setCant_Boletos((int)spn_Cant_boletos.getValue());
     
            
      System.out.println(tabla_datosBoletos.getValueAt(fila, 4).toString());
      nuevoRegistro.setSala(cmb_sala.getSelectedItem().toString().charAt(0));
      
            System.out.println("sala: "+tabla_datosBoletos.getValueAt(fila, 4).toString().charAt(0));    
       try {
           
            //System.out.println(nuevoRegistro);
            modi.modificar(nuevoRegistro);
            mostrarBoletos();
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista_Pelicula.class.getName()).log(Level.SEVERE, null, ex);
            //System.err.println(ex.getMessage());
            System.err.println(ex.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(this, "Boletos no seleccionada");
            
        }

      
        
    }//GEN-LAST:event_btn_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_ventaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_ventaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_ventaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_ventaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_ventaBoletos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cmb_sala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spn_Cant_boletos;
    private javax.swing.JTable tabla_datosBoletos;
    private javax.swing.JTable tabla_pelicula;
    private javax.swing.JTextField txt_buscarNombre;
    private javax.swing.JFormattedTextField txt_hora;
    // End of variables declaration//GEN-END:variables

    private void mostrarBoletos() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Conexion con=new Conexion();
	DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("idVenta ");
        modelo.addColumn("Nombre ");
        
        modelo.addColumn("Hora ");
        modelo.addColumn("Num Boletos ");
	modelo.addColumn("Sala");
	tabla_datosBoletos.setModel(modelo);
	String sql="SELECT *FROM ventaboletos"; 
        
        Object datos[]=new Object[5];
	Statement sentencia;
        try {
            sentencia = con.crearConexion().createStatement();
            ResultSet resultado=sentencia.executeQuery(sql);
        
            while(resultado.next()){
                datos[0]=resultado.getInt(1);
                
                datos[1]=resultado.getString(2);
                
                datos[2]=resultado.getString(4);
                datos[3]=resultado.getString(5);
                datos[4]=resultado.getString(6);
                modelo.addRow(datos);
	}
            
	tabla_datosBoletos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Vista_ventaBoletos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
