/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.VideoJuego;
import apiCliente.VideojuegoClient;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

import vista.VistaAñadirVideojuego;
/**
 *
 * @author USER
 */
public class VistaListaDeJuegos extends javax.swing.JFrame {

    private VideojuegoClient controladorVideojuegos = new VideojuegoClient();
    private List<VideoJuego> videojuegos;


    /**
     * Creates new form VistaListaDeJuegos
     */
    public VistaListaDeJuegos() {
    	
        initComponents();
        //this.controladorVideojuegos = new VideojuegoClient();
        llenarTabla();
        setLocationRelativeTo(this);
    }
    
    private boolean validarCampos() {
        if (txtId.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    public void vaciarCampos (){
        txtId.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVideojuegos = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btnListaUsuarios8 = new javax.swing.JButton();
        btnJuegos8 = new javax.swing.JButton();
        btnRentas8 = new javax.swing.JButton();
        btnInventario8 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        btnMenu8 = new javax.swing.JButton();
        btnConsolas7 = new javax.swing.JButton();
        logo5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a la gestión");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("de videojuegos!");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 204));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnBuscarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 204));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnEliminarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 204));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tablaVideojuegos.setBackground(new java.awt.Color(51, 51, 51));
        tablaVideojuegos.setForeground(new java.awt.Color(255, 255, 255));
        tablaVideojuegos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVideojuegos.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tablaVideojuegos);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnBuscar))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar)
                                    .addComponent(btnGuardar))))
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardar))
                .addGap(358, 358, 358))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(51, 0, 51));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Contenido");

        btnListaUsuarios8.setBackground(new java.awt.Color(0, 0, 204));
        btnListaUsuarios8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListaUsuarios8.setForeground(new java.awt.Color(255, 255, 255));
        btnListaUsuarios8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono User.png"))); // NOI18N
        btnListaUsuarios8.setText("Lista de usuarios");
        btnListaUsuarios8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnListaUsuarios8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListaUsuarios8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListaUsuarios8.setIconTextGap(20);
        btnListaUsuarios8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUsuarios8ActionPerformed(evt);
            }
        });

        btnJuegos8.setBackground(new java.awt.Color(0, 0, 204));
        btnJuegos8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJuegos8.setForeground(new java.awt.Color(255, 255, 255));
        btnJuegos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Control (1).png"))); // NOI18N
        btnJuegos8.setText("Juegos");
        btnJuegos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnJuegos8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJuegos8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnJuegos8.setIconTextGap(20);
        btnJuegos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegos8ActionPerformed(evt);
            }
        });

        btnRentas8.setBackground(new java.awt.Color(0, 0, 204));
        btnRentas8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRentas8.setForeground(new java.awt.Color(255, 255, 255));
        btnRentas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Reloj.png"))); // NOI18N
        btnRentas8.setText("Reservas");
        btnRentas8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRentas8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRentas8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRentas8.setIconTextGap(20);
        btnRentas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentas8ActionPerformed(evt);
            }
        });

        btnInventario8.setBackground(new java.awt.Color(0, 0, 204));
        btnInventario8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInventario8.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Inventario.png"))); // NOI18N
        btnInventario8.setText("Inventario");
        btnInventario8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnInventario8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInventario8.setIconTextGap(20);
        btnInventario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventario8ActionPerformed(evt);
            }
        });

        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel36.setName(""); // NOI18N

        btnMenu8.setBackground(new java.awt.Color(0, 0, 204));
        btnMenu8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu8.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono home (1).png"))); // NOI18N
        btnMenu8.setText("Menu");
        btnMenu8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnMenu8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMenu8.setIconTextGap(20);
        btnMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu8ActionPerformed(evt);
            }
        });

        btnConsolas7.setBackground(new java.awt.Color(0, 0, 204));
        btnConsolas7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsolas7.setForeground(new java.awt.Color(255, 255, 255));
        btnConsolas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoConsola.png"))); // NOI18N
        btnConsolas7.setText("Consolas");
        btnConsolas7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnConsolas7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsolas7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsolas7.setIconTextGap(20);
        btnConsolas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolas7ActionPerformed(evt);
            }
        });

        logo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono qz.png"))); // NOI18N
        logo5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo5.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(logo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel35)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListaUsuarios8, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(btnJuegos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRentas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInventario8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenu8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsolas7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(57, 57, 57)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsolas7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJuegos8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRentas8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaUsuarios8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    	VistaAñadirVideojuego vj = new VistaAñadirVideojuego();
		vj.setVisible(true);
		this.setVisible(false);
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnEliminarActionPerformed
    	int filaSeleccionada = tablaVideojuegos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String idVideojuego = (String) tablaVideojuegos.getValueAt(filaSeleccionada, 0);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar al cliente con ID " + idVideojuego + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                this.controladorVideojuegos.eliminarVideojuego(idVideojuego);
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
                // Recargar la tabla

                llenarTabla();
            }
        } else {
            // Mostrar mensaje si no hay fila seleccionada
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un cliente de la tabla para poderlo eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    	int filaSeleccionada = tablaVideojuegos.getSelectedRow();
        if (filaSeleccionada != -1) {
            String idVideojuego = (String) tablaVideojuegos.getValueAt(filaSeleccionada, 0);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas editar al cliente con ID " + idVideojuego + "?", "Confirmar editar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                VistaEditarVideojuego vs = new VistaEditarVideojuego(idVideojuego);
                vs.setVisible(true);
                this.dispose();
                llenarTabla();
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un cliente de la tabla para poderlo eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        if(!(txtId.getText().isEmpty())){
            String nombre = txtId.getText();
            VideoJuego videojuego = controladorVideojuegos.buscarVideojuegoPorId(nombre);

            if (videojuego != null){
            	DefaultTableModel modelo = (DefaultTableModel) tablaVideojuegos.getModel();
				modelo.setRowCount(0);
				Object[] row = new Object[6];
                                row[0] = videojuego.getId();
				row[1] = videojuego.getNombre();
				row[2] = videojuego.getFechaDePubliacion();
				row[3] = videojuego.getDescripcion();
				row[4] = videojuego.getPublico();
				row[5] = videojuego.getTipo();
				modelo.addRow(row);
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el videojuego");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Debe colocar el id del juego");
        }                                       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListaUsuarios8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUsuarios8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaUsuarios8ActionPerformed

    private void btnJuegos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegos8ActionPerformed
        VistaGestionDeVideojuegos vj = new VistaGestionDeVideojuegos();
        vj.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnJuegos8ActionPerformed

    private void btnRentas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentas8ActionPerformed
        // TODO add your handling code here:
        VistaGestionDeReservas vl = new VistaGestionDeReservas();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRentas8ActionPerformed

    private void btnInventario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventario8ActionPerformed
        // TODO add your handling code here:
        VistaInventario vl = new VistaInventario();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventario8ActionPerformed

    private void btnMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu8ActionPerformed
        // TODO add your handling code here:
        VistaMenu vl = new VistaMenu();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenu8ActionPerformed

    private void btnConsolas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolas7ActionPerformed
        // TODO add your handling code here:
        VistaGestionDeConsolas vl = new VistaGestionDeConsolas();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsolas7ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    /**
     * @param args the command line arguments
     */
    private void llenarTabla (){
        DefaultTableModel model = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{"Id","Nombre", "Fecha", "Descripción", "Clasificación", "Tipo"});

        List<VideoJuego> juegosAux = controladorVideojuegos.listarVideojuego();
        for (VideoJuego juego : juegosAux){

            model.addRow(new Object[]{
                    juego.getId(),
                    juego.getNombre(),
                    juego.getFechaDePubliacion(),
                    juego.getDescripcion(),
                    juego.getPublico(),
                    juego.getTipo(),
            });
        }
        tablaVideojuegos.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsolas7;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInventario8;
    private javax.swing.JButton btnJuegos8;
    private javax.swing.JButton btnListaUsuarios8;
    private javax.swing.JButton btnMenu8;
    private javax.swing.JButton btnRentas8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo5;
    private javax.swing.JTable tablaVideojuegos;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
