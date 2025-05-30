/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.List;

import javax.swing.JOptionPane;

import apiCliente.ConsolaClient;
import apiCliente.PuestoApiClient;
import modelo.Consola;
import modelo.Puesto;

/**
 *
 * @author CARLOS
 */
public class VistaEditarPuesto extends javax.swing.JFrame {
	private Integer idPuesto;
	private final PuestoApiClient puestoApiClient;
	private final ConsolaClient consolas;
	private String token;
    /**
     * Creates new form VistaEditarPuesto
     */
    public VistaEditarPuesto(Integer idPuesto2, String token) {
        setLocationRelativeTo(this);
        initComponents();
        this.token = token;
        this.idPuesto = idPuesto2;
        this.puestoApiClient = new PuestoApiClient();
        this.consolas = new ConsolaClient();
        llenarConsolas();
        llenarDatos(idPuesto2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnListaUsuarios = new javax.swing.JButton();
        btnJuegos = new javax.swing.JButton();
        btnRentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnConsolas = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNumeroPuesto = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        boxControles = new javax.swing.JComboBox<>();
        boxSillas = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        lblTelefono1 = new javax.swing.JLabel();
        boxConsola = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contenido");

        btnListaUsuarios.setBackground(new java.awt.Color(0, 0, 204));
        btnListaUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono User.png"))); // NOI18N
        btnListaUsuarios.setText("Lista de usuarios");
        btnListaUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnListaUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListaUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListaUsuarios.setIconTextGap(20);
        btnListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUsuariosActionPerformed(evt);
            }
        });

        btnJuegos.setBackground(new java.awt.Color(0, 0, 204));
        btnJuegos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJuegos.setForeground(new java.awt.Color(255, 255, 255));
        btnJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Control (1).png"))); // NOI18N
        btnJuegos.setText("Juegos");
        btnJuegos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnJuegos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJuegos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnJuegos.setIconTextGap(20);
        btnJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosActionPerformed(evt);
            }
        });

        btnRentas.setBackground(new java.awt.Color(0, 0, 204));
        btnRentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRentas.setForeground(new java.awt.Color(255, 255, 255));
        btnRentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Reloj.png"))); // NOI18N
        btnRentas.setText("Reservas");
        btnRentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRentas.setIconTextGap(20);
        btnRentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentasActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(0, 0, 204));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Inventario.png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInventario.setIconTextGap(20);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setName(""); // NOI18N

        btnMenu.setBackground(new java.awt.Color(0, 0, 204));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono home (1).png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMenu.setIconTextGap(20);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnConsolas.setBackground(new java.awt.Color(0, 0, 204));
        btnConsolas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsolas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsolas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoConsola.png"))); // NOI18N
        btnConsolas.setText("Consolas");
        btnConsolas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnConsolas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsolas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsolas.setIconTextGap(20);
        btnConsolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolasActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnRentas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConsolas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRentas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAñadir.setBackground(new java.awt.Color(0, 0, 204));
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Guardar");
        btnAñadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblNombre.setText("Numero de puesto");

        txtNumeroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPuestoActionPerformed(evt);
            }
        });

        lblCedula.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblCedula.setText("Cantidad de sillas:");

        lblTelefono.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTelefono.setText("Cantidad de controles:");

        boxControles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "controles", "1", "2", "3", "4" }));
        boxControles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxControlesActionPerformed(evt);
            }
        });

        boxSillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sillas", "1", "2", "3", "4" }));

        btnVolver.setBackground(new java.awt.Color(0, 0, 204));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTelefono1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTelefono1.setText("Cantidad de controles:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxControles, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblTelefono1)
                                .addGap(18, 18, 18)
                                .addComponent(boxConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNumeroPuesto))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(lblCedula)
                                    .addGap(18, 18, 18)
                                    .addComponent(boxSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNumeroPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(boxSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(boxControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono1)
                    .addComponent(boxConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Puestos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUsuariosActionPerformed
        VistaGestionClientes vgc = new VistaGestionClientes(token);
        vgc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaUsuariosActionPerformed

    private void btnJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosActionPerformed
        VistaGestionDeVideojuegos vj = new VistaGestionDeVideojuegos(token);
        vj.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnJuegosActionPerformed

    private void btnRentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentasActionPerformed
        VistaGestionDeReservas vg = new VistaGestionDeReservas(token);
        vg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        VistaInventario vgi = new VistaInventario(token);
        vgi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        VistaMenu vl = new VistaMenu(token);
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConsolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolasActionPerformed
        VistaGestionDeConsolas va = new VistaGestionDeConsolas(token);
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsolasActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        try {
            String numeroPuesto = txtNumeroPuesto.getText();

            // Validación básica antes de parsear
            if (numeroPuesto.isEmpty() ||
                boxControles.getSelectedIndex() == 0 ||
                boxSillas.getSelectedIndex() == 0 ||
                boxConsola.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int controles = Integer.parseInt(boxControles.getSelectedItem().toString());
            int sillas = Integer.parseInt(boxSillas.getSelectedItem().toString());

            Consola consolaSeleccionada = (Consola) boxConsola.getSelectedItem(); // ✅ casteo correcto
            int idConsola = consolaSeleccionada.getId(); // ✅ obtenemos el id real

            Puesto puesto = new Puesto(numeroPuesto, idConsola, sillas, controles);
            puestoApiClient.actualizarPuesto(idPuesto, puesto, token);

            JOptionPane.showMessageDialog(this, "Puesto guardado correctamente");
            llenarDatos(idPuesto);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al añadir el puesto", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAñadirActionPerformed
    public void llenarDatos(Integer id) {
    	try {
    		Puesto puesto = puestoApiClient.buscarPuestoPorId(id, token);
			txtNumeroPuesto.setText(puesto.getNumeroDePuesto());
			boxSillas.setSelectedItem(String.valueOf(puesto.getCantidadDeSillas()));
			boxControles.setSelectedItem(String.valueOf(puesto.getCanditadDeControles()+1));
			boxConsola.setSelectedItem(puesto.getConsola());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error al cargar los datos del puesto", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    }
    public void llenarConsolas() {
        boxConsola.removeAllItems();
        List<Consola> consolas = ConsolaClient.listarConsola(token);
        for (Consola c : consolas) {
            boxConsola.addItem(c);
        }
    }
    private void txtNumeroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPuestoActionPerformed

    private void boxControlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxControlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxControlesActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaAgregarPuesto vl = new VistaAgregarPuesto(token);
        vl.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEditarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEditarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEditarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEditarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEditarPuesto(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Consola> boxConsola;
    private javax.swing.JComboBox<String> boxControles;
    private javax.swing.JComboBox<String> boxSillas;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnConsolas;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnJuegos;
    private javax.swing.JButton btnListaUsuarios;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRentas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtNumeroPuesto;
    // End of variables declaration//GEN-END:variables
}
