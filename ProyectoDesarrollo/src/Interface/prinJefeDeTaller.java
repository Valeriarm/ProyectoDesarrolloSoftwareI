/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.DBConnection;
import Model.OrdenTrabajo;
import Model.Inventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Marthox
 * 
 */
public class prinJefeDeTaller extends javax.swing.JFrame {
    
    //la variable botonAceptar indica el uso que se le da al botón de la izquierda para cada boton principal
    //1:Agregar, 2:Modificar, 3:Consultar, 4:Anular 0 Eliminar, 0:nada
    private int botonAceptar = 0;  
    private DBConnection bD;
    private final String idJefe;
    private String consulta;
    private String consultaInv;
    ArrayList<String> referencias;
    ArrayList<Integer> cantidades;
    
    public prinJefeDeTaller(DBConnection baseDatos, String idJefe) {
        initComponents();
        this.bD = baseDatos;
        this.idJefe = idJefe;
        
        this.referencias = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        
        desactivarCampos();
        bAceptar.setVisible(false);
        
        
       }

    class hora implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
        
        Date fechaHora = new Date();
        String pmAm = "hh:mm:ss a";
        SimpleDateFormat format = new SimpleDateFormat(pmAm);
        Calendar hoy = Calendar.getInstance();
        hora.setText(String.format(format.format(fechaHora), hoy));
      
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        fechaYhora = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bModf = new javax.swing.JButton();
        bConsul = new javax.swing.JButton();
        bAnular = new javax.swing.JButton();
        anularInv = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modInv = new javax.swing.JButton();
        consulInv = new javax.swing.JButton();
        addInv = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labCantidad = new javax.swing.JLabel();
        labEspecificaciones = new javax.swing.JLabel();
        tEspecificaciones = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        tCantidad = new javax.swing.JTextField();
        labNombreProducto = new javax.swing.JLabel();
        tNombreProducto = new javax.swing.JTextField();
        labValorUnitario = new javax.swing.JLabel();
        tValorUnitario = new javax.swing.JTextField();
        labDescripcion = new javax.swing.JLabel();
        tDescripcion = new javax.swing.JTextField();
        labRefProductoCB = new javax.swing.JLabel();
        cbRefProducto = new javax.swing.JComboBox<>();
        labEstadoOrden = new javax.swing.JLabel();
        cbEstadoOrden = new javax.swing.JComboBox<>();
        labIdOrden = new javax.swing.JLabel();
        cbIdOrden = new javax.swing.JComboBox<>();
        bConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fecha.setText("dd-mm-yyyy");

        fechaYhora.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fechaYhora.setText("Fecha  y hora:");

        hora.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        hora.setText("hh:mm:ss");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(fechaYhora)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(fecha)
                    .addContainerGap(58, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(hora)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fechaYhora))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(hora)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bAgregar.setForeground(new java.awt.Color(51, 51, 51));
        bAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO ordersadd.png"))); // NOI18N
        bAgregar.setToolTipText("Para activar los campos presionar de nuevo el boton");
        bAgregar.setBorderPainted(false);
        bAgregar.setContentAreaFilled(false);
        bAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bAgregarMouseReleased(evt);
            }
        });

        bModf.setForeground(new java.awt.Color(51, 51, 51));
        bModf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO ordersedit.png"))); // NOI18N
        bModf.setToolTipText("Para activar los campos presionar de nuevo el boton");
        bModf.setBorderPainted(false);
        bModf.setContentAreaFilled(false);
        bModf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bModfMouseReleased(evt);
            }
        });

        bConsul.setForeground(new java.awt.Color(51, 51, 51));
        bConsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO orderssearch.png"))); // NOI18N
        bConsul.setToolTipText("Para activar los campos presionar de nuevo el boton");
        bConsul.setBorderPainted(false);
        bConsul.setContentAreaFilled(false);
        bConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bConsulMouseReleased(evt);
            }
        });

        bAnular.setForeground(new java.awt.Color(51, 51, 51));
        bAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO ordersabort.png"))); // NOI18N
        bAnular.setToolTipText("Para activar los campos presionar de nuevo el boton");
        bAnular.setBorderPainted(false);
        bAnular.setContentAreaFilled(false);
        bAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bAnularMouseReleased(evt);
            }
        });

        anularInv.setForeground(new java.awt.Color(51, 51, 51));
        anularInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO Invdelete.png"))); // NOI18N
        anularInv.setToolTipText("Para activar los campos presionar de nuevo el boton");
        anularInv.setBorderPainted(false);
        anularInv.setContentAreaFilled(false);
        anularInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                anularInvMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel1.setText("---------- Agregar ----------");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel2.setText("---------- Modificar ----------");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel3.setText("---------- Consultar ----------");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel4.setText("----------- Anular ------------");

        modInv.setForeground(new java.awt.Color(51, 51, 51));
        modInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO Invedit.png"))); // NOI18N
        modInv.setToolTipText("Para activar los campos presionar de nuevo el boton");
        modInv.setBorderPainted(false);
        modInv.setContentAreaFilled(false);
        modInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                modInvMouseReleased(evt);
            }
        });

        consulInv.setForeground(new java.awt.Color(51, 51, 51));
        consulInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO Invsearch.png"))); // NOI18N
        consulInv.setToolTipText("Para activar los campos presionar de nuevo el boton");
        consulInv.setBorderPainted(false);
        consulInv.setContentAreaFilled(false);
        consulInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                consulInvMouseReleased(evt);
            }
        });

        addInv.setForeground(new java.awt.Color(51, 51, 51));
        addInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO Invadd.png"))); // NOI18N
        addInv.setToolTipText("Para activar los campos presionar de nuevo el boton");
        addInv.setBorderPainted(false);
        addInv.setContentAreaFilled(false);
        addInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addInvMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(anularInv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(addInv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bModf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(modInv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(consulInv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAgregar)
                    .addComponent(addInv))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bModf)
                    .addComponent(modInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bConsul)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addComponent(consulInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bAnular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(anularInv)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        labCantidad.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labCantidad.setText("Cantidad:");

        labEspecificaciones.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labEspecificaciones.setForeground(new java.awt.Color(255, 255, 255));
        labEspecificaciones.setText("Especificaciones:");

        tEspecificaciones.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tEspecificaciones.setToolTipText("");

        bAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        bAceptar.setText("Agregar");
        bAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAceptarMouseClicked(evt);
            }
        });

        tCantidad.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tCantidad.setToolTipText("");
        tCantidad.setPreferredSize(new java.awt.Dimension(152, 24));
        tCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCantidadActionPerformed(evt);
            }
        });

        labNombreProducto.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        labNombreProducto.setText("Nombre Producto:");

        tNombreProducto.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tNombreProducto.setToolTipText("");
        tNombreProducto.setPreferredSize(new java.awt.Dimension(152, 24));
        tNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreProductoActionPerformed(evt);
            }
        });

        labValorUnitario.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labValorUnitario.setForeground(new java.awt.Color(255, 255, 255));
        labValorUnitario.setText("Valor Unitario:");

        tValorUnitario.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tValorUnitario.setToolTipText("");
        tValorUnitario.setPreferredSize(new java.awt.Dimension(152, 24));
        tValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorUnitarioActionPerformed(evt);
            }
        });

        labDescripcion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labDescripcion.setText("Descripcion:");

        tDescripcion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tDescripcion.setToolTipText("");
        tDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDescripcionActionPerformed(evt);
            }
        });

        labRefProductoCB.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labRefProductoCB.setForeground(new java.awt.Color(255, 255, 255));
        labRefProductoCB.setText("Ref Producto:");

        cbRefProducto.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbRefProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una referencia" }));
        cbRefProducto.setPreferredSize(new java.awt.Dimension(152, 20));

        labEstadoOrden.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labEstadoOrden.setForeground(new java.awt.Color(255, 255, 255));
        labEstadoOrden.setText("Estado:");

        cbEstadoOrden.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbEstadoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado", "En proceso", "Terminada" }));
        cbEstadoOrden.setPreferredSize(new java.awt.Dimension(152, 20));
        cbEstadoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoOrdenActionPerformed(evt);
            }
        });

        labIdOrden.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        labIdOrden.setForeground(new java.awt.Color(255, 255, 255));
        labIdOrden.setText("Id Orden de Trabajo:");

        cbIdOrden.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbIdOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una  orden" }));
        cbIdOrden.setPreferredSize(new java.awt.Dimension(152, 20));
        cbIdOrden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdOrdenItemStateChanged(evt);
            }
        });
        cbIdOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdOrdenActionPerformed(evt);
            }
        });

        bConfirmar.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labEspecificaciones)
                    .addComponent(labCantidad)
                    .addComponent(labNombreProducto)
                    .addComponent(labDescripcion)
                    .addComponent(labValorUnitario)
                    .addComponent(labRefProductoCB)
                    .addComponent(labEstadoOrden)
                    .addComponent(labIdOrden))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tEspecificaciones)
                    .addComponent(tNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tDescripcion)
                    .addComponent(tValorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEstadoOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRefProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConfirmar)
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCantidad)
                    .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEspecificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labEspecificaciones))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNombreProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labValorUnitario))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDescripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRefProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labRefProductoCB))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labEstadoOrden))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIdOrden))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bConfirmar)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel5.setText("Jefe De Taller");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAgregarMouseReleased
       //muestra las opciones (Ordenes de trabajo o Items de inventario)
              
            this.referencias = new ArrayList<>();
            this.cantidades = new ArrayList<>();
            consultaInv="disponible";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenAgregar(true);
            llenarComboboxInventario();
        
            botonAceptar = 1;
            bAceptar.setText("Agregar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
        
        
    }//GEN-LAST:event_bAgregarMouseReleased

    private void bModfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bModfMouseReleased
        
            this.referencias = new ArrayList<>();
            this.cantidades = new ArrayList<>();
            consultaInv = "disponible";
            consulta  = "modificar";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenModificar(true);
            llenarComboboxOrden();
            this.cbRefProducto.removeAllItems();
            llenarComboboxInventarioOrden();
        
            botonAceptar = 2;
            bAceptar.setText("Modificar");
            bAceptar.setVisible(true);              
            bAceptar.setEnabled(true);
        
    }//GEN-LAST:event_bModfMouseReleased

    private void bConsulMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bConsulMouseReleased
   
            consulta="consultar";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenConsultar(true);
            llenarComboboxOrden();
        
            botonAceptar = 3;
            bAceptar.setText("Consultar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
        
    }//GEN-LAST:event_bConsulMouseReleased

    private void bAnularMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAnularMouseReleased

            consulta="modificar";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenAnular(true);
            llenarComboboxOrden();

            botonAceptar = 4;
            bAceptar.setText("Anular");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);

    }//GEN-LAST:event_bAnularMouseReleased

    private void bAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAceptarMouseClicked

            //Agregar
            
            if(botonAceptar == 1){
                agregarUnaOrdenDeTrabajo();
            }
            else if(botonAceptar == 5){
                 agregarReferencia();
            //Modificar
            }else if(botonAceptar == 2){
                modificarOrdenDeTrabajo();
            }
            else if(botonAceptar == 6){
                modificarItemDeInventario();
             //Concultar
            }else if(botonAceptar == 3){
                consultarOrdenDeTrabajo();
            }
            else if(botonAceptar == 7){
                consultarItemDeInventario();
             //Despedir
            }else if(botonAceptar == 4){
                anularOrdenDeTrabajo();
            }
            else if(botonAceptar == 8){
                eliminarItemDeInventario();

            }
            
    }//GEN-LAST:event_bAceptarMouseClicked

    private void tCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCantidadActionPerformed

    private void tNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreProductoActionPerformed

    private void tValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorUnitarioActionPerformed

    private void tDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDescripcionActionPerformed

    private void cbEstadoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoOrdenActionPerformed

    private void cbIdOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdOrdenActionPerformed

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
  
        if(botonAceptar == 1){
                agregarOrdenDeTrabajo();
            }
            else if(botonAceptar == 5){
                 modificarOrdenDeTrabajo();
          
            }
          
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void cbIdOrdenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdOrdenItemStateChanged
        // TODO add your handling code here:
        consultaInv = "disponible";
        this.cbRefProducto.removeAllItems();
        llenarComboboxInventarioOrden();
    }//GEN-LAST:event_cbIdOrdenItemStateChanged

    private void modInvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modInvMouseReleased
        
            consultaInv = "disponible";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenModificar(true);
            llenarComboboxInventario();
        
            botonAceptar = 6;
            bAceptar.setText("Modificar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
                
    }//GEN-LAST:event_modInvMouseReleased

    private void consulInvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulInvMouseReleased
        
            consultaInv = "disponible";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposInventarioConsultar(true);
            llenarComboboxInventario();
            
            botonAceptar = 7;
            bAceptar.setText("Consultar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
         
    }//GEN-LAST:event_consulInvMouseReleased

    private void addInvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInvMouseReleased
       
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposInventarioAgregar(true);
        
            botonAceptar = 5;
            bAceptar.setText("Agregar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
        
        
    }//GEN-LAST:event_addInvMouseReleased

    private void anularInvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anularInvMouseReleased
        
            consultaInv="disponible";
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposInventarioEliminar(true);
            llenarComboboxInventario();

            botonAceptar = 8;
            bAceptar.setText("Eliminar");
            bAceptar.setVisible(true);
            bAceptar.setEnabled(true);
        
    }//GEN-LAST:event_anularInvMouseReleased
    
    public void llenarComboboxOrden(){
        String [] ordenes = bD.listarOrden(this.idJefe, consulta).split("\\$");
        for(int i=0; i<ordenes.length; i++){
            cbIdOrden.addItem(ordenes[i]);
        }
    }
    
    public void llenarComboboxInventario(){
        String [] inventario = bD.listarInventario(consultaInv).split("\\$");
        for(int i=0; i<inventario.length; i++){
            cbRefProducto.addItem(inventario[i]);
        }
    }
    
    public void llenarComboboxInventarioOrden(){
        String [] inventario = bD.listarInventarioOrden(String.valueOf(cbIdOrden.getSelectedItem())).split("\\$");
        for(int i=0; i<inventario.length; i++){
            cbRefProducto.addItem(inventario[i]);
        }
    }
    
    public void desactivarCampos(){
        labCantidad.setVisible(false);
        tCantidad.setVisible(false);
        tCantidad.setEnabled(false);
        labEspecificaciones.setVisible(false);
        tEspecificaciones.setVisible(false);
        tEspecificaciones.setEnabled(false);
        labNombreProducto.setVisible(false);
        tNombreProducto.setVisible(false);
        tNombreProducto.setEnabled(false);
        labValorUnitario.setVisible(false);
        tValorUnitario.setVisible(false);
        tValorUnitario.setEnabled(false);
        labDescripcion.setVisible(false);
        tDescripcion.setVisible(false);
        tDescripcion.setEnabled(false);
        labRefProductoCB.setVisible(false);
        cbRefProducto.setVisible(false);
        cbRefProducto.setEnabled(false);
        labEstadoOrden.setVisible(false);
        cbEstadoOrden.setVisible(false);
        cbEstadoOrden.setEnabled(false);
        labIdOrden.setVisible(false);
        cbIdOrden.setVisible(false);
        cbIdOrden.setEnabled(false);
        bConfirmar.setVisible(false);
        bConfirmar.setEnabled(false);
    }
    
    public void cambiarVisibilidadCamposOrdenAgregar(boolean varControl){
        labRefProductoCB.setVisible(varControl);
        cbRefProducto.setVisible(varControl);
        cbRefProducto.setEnabled(varControl);
        labEspecificaciones.setVisible(varControl);
        tEspecificaciones.setVisible(varControl);
        tEspecificaciones.setEnabled(varControl);
        labCantidad.setVisible(varControl);
        tCantidad.setVisible(varControl);
        tCantidad.setEnabled(varControl);
        bConfirmar.setVisible(varControl);
        bConfirmar.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposOrdenModificar(boolean varControl){
        labIdOrden.setVisible(varControl);
        cbIdOrden.setVisible(varControl);
        cbIdOrden.setEnabled(varControl);
        labRefProductoCB.setVisible(varControl);
        cbRefProducto.setVisible(varControl);
        cbRefProducto.setEnabled(varControl);
        labEstadoOrden.setVisible(varControl);
        cbEstadoOrden.setVisible(varControl);
        cbEstadoOrden.setEnabled(varControl);
        labEspecificaciones.setVisible(varControl);
        tEspecificaciones.setVisible(varControl);
        tEspecificaciones.setEnabled(varControl);
        labCantidad.setVisible(varControl);
        tCantidad.setVisible(varControl);
        tCantidad.setEnabled(varControl);
        bConfirmar.setVisible(varControl);
        bConfirmar.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposOrdenConsultar(boolean varControl){
        labIdOrden.setVisible(varControl);
        cbIdOrden.setVisible(varControl);
        cbIdOrden.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposOrdenAnular(boolean varControl){
        labIdOrden.setVisible(varControl);
        cbIdOrden.setVisible(varControl);
        cbIdOrden.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposInventarioAgregar(boolean varControl){
        labNombreProducto.setVisible(varControl);
        tNombreProducto.setVisible(varControl);
        tNombreProducto.setEnabled(varControl);      
        labValorUnitario.setVisible(varControl);
        tValorUnitario.setVisible(varControl);
        tValorUnitario.setEnabled(varControl);
        labDescripcion.setVisible(varControl);
        tDescripcion.setVisible(varControl);
        tDescripcion.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposInventarioModf(boolean varControl){
        labRefProductoCB.setVisible(varControl);
        cbRefProducto.setVisible(varControl);
        cbRefProducto.setEnabled(varControl);
        labNombreProducto.setVisible(varControl);
        tNombreProducto.setVisible(varControl);
        tNombreProducto.setEnabled(varControl);
        labValorUnitario.setVisible(varControl);
        tValorUnitario.setVisible(varControl);
        tValorUnitario.setEnabled(varControl);
        labDescripcion.setVisible(varControl);
        tDescripcion.setVisible(varControl);
        tDescripcion.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposInventarioConsultar(boolean varControl){
        labRefProductoCB.setVisible(varControl);
        cbRefProducto.setVisible(varControl);
        cbRefProducto.setEnabled(varControl);
    }
    
    public void cambiarVisibilidadCamposInventarioEliminar(boolean varControl){
        labRefProductoCB.setVisible(varControl);
        cbRefProducto.setVisible(varControl);
        cbRefProducto.setEnabled(varControl);
    }
    
    private boolean validarCamposAgregarOrdenDeTrabajo(){
        if(cbRefProducto.getSelectedItem().equals("Seleccione una referencia")){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione una referencia");
            return false;
        }
        try{
            Integer.valueOf(tCantidad.getText());
        }catch(NumberFormatException nan){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese una cantidad valida");
            return false;
        }
        if(String.valueOf(tEspecificaciones.getText()).replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese las especificaciones");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposModificarOrdenDeTrabajo(){
        try{
            Integer.valueOf(tCantidad.getText());
        }catch(NumberFormatException nan){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese una cantidad valida");
            return false;
        }
        if(cbIdOrden.getSelectedItem().equals("Seleccione una orden")){
            JOptionPane.showMessageDialog(this,
                    "Por favor selecciona una orden");
            return false;
        }
        if(cbRefProducto.getSelectedItem().equals("Seleccione una referencia")){
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una referencia");
            return false;
        }
        if(tEspecificaciones.getText().replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese las especificaciones");
            return false;
        }
        if(cbEstadoOrden.getSelectedItem().equals("Seleccione un estado")){
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione un estado");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposConsultarOrdenDeTrabajo(){
        if(cbIdOrden.getSelectedItem()=="Seleccione una orden"){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione una orden");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposAnularOrdenDeTrabajo(){
        if(cbIdOrden.getSelectedItem().equals("Seleccione una orden")){
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una orden");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposAgregarInventario(){
        if(tNombreProducto.getText().replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese el nombre del producto");
            return false;
        }
        try {
            Float.valueOf(tValorUnitario.getText());
        }catch(NumberFormatException nan){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese un valor unitario valido");
            return false;
        }
        if(tDescripcion.getText().replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese la descripcion del producto");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposModificarInventario(){
        if(cbRefProducto.getSelectedItem().equals("Seleccione una referencia")){
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una referencia");
            return false;
        }
        if(tNombreProducto.getText().replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese el nombre del producto");
            return false;
        }
        try{
            Float.valueOf(tValorUnitario.getText());
        }catch(NumberFormatException nan){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese un valor unitario valido");
            return false;
        }
        if(tDescripcion.getText().replace(" ", "").length()==0){
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese la descripcion del producto");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposConsultarInventario(){
        if(cbRefProducto.getSelectedItem().equals("Seleccione una referencia")){
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una referencia de producto");
            return false;
        }
        return true;
    }
    
    private boolean validarCamposEliminarInventario(){
        if(cbRefProducto.getSelectedItem().equals("Seleccione una referencia")){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione una referencia");
            return false;
        }
        return true;
    }
    
    private void limpiarCampos(){
        tCantidad.setText("");
        tEspecificaciones.setText("");
        tNombreProducto.setText("");
        tValorUnitario.setText("");
        tDescripcion.setText("");
        cbIdOrden.removeAllItems();
        cbRefProducto.removeAllItems();
    }
    
    private boolean agregarUnaOrdenDeTrabajo(){
        if(!validarCamposAgregarOrdenDeTrabajo()){
            return false;
        }
        if(referencias.contains(cbRefProducto.getSelectedItem().toString())){
            referencias.set(this.cbRefProducto.getSelectedIndex(), 
                    String.valueOf(this.cbRefProducto.getSelectedItem()));
            cantidades.set(this.cbRefProducto.getSelectedIndex(), 
                    Integer.valueOf(tCantidad.getText()));
        }else{
            referencias.add(cbRefProducto.getSelectedItem().toString());
            cantidades.add(Integer.valueOf(tCantidad.getText()));
        }
        JOptionPane.showMessageDialog(this, "Producto "+cbRefProducto.getSelectedItem().toString()+" Agregado");
        return true;
    }
    
    private boolean agregarOrdenDeTrabajo(){
        if(!validarCamposAgregarOrdenDeTrabajo()){
            return false;
        }
        /*id_orden se genera automaticamente*/
        int[] cant = new int[cantidades.size()];
        String[] refs = new String[referencias.size()];
        for (int i=0; i<cant.length;i++){
            cant[i]=cantidades.get(i);
            refs[i]=referencias.get(i).split(",")[0];
        }
        String especificaciones = tEspecificaciones.getText();
        String estado = "En Proceso";
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        String fecha_creacion = String.valueOf(anio)+"-"+String.valueOf(mes)
                +"-"+String.valueOf(dia);
        
        String respuesta = bD.crearOrden(especificaciones, estado, fecha_creacion ,idJefe, refs, cant);
        JOptionPane.showMessageDialog(this, respuesta);
        this.referencias = new ArrayList<>();
            this.cantidades = new ArrayList<>();
            limpiarCampos();
            desactivarCampos();
            cambiarVisibilidadCamposOrdenAgregar(true);
            llenarComboboxInventario();
        return true;
    }
    
    private boolean agregarReferencia(){
        if(!validarCamposAgregarInventario()){
            return false;
        }
        /*id_producto se genera automaticamente*/
        String nombreProducto = tNombreProducto.getText();
        float valorUnitario = Float.parseFloat(tValorUnitario.getText());
        String descripcion = tDescripcion.getText();
        
        String respuesta = bD.crearInventario(nombreProducto, valorUnitario, 
            descripcion, idJefe);
        JOptionPane.showMessageDialog(this, respuesta);
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposInventarioAgregar(true);
        return true;
    }
    
    private boolean modificarOrdenDeTrabajo(){
        if(!validarCamposModificarOrdenDeTrabajo()){
            return false;
        }
        int[] cant = new int[cantidades.size()];
        String[] refs = new String[referencias.size()];
        for (int i=0; i<cant.length;i++){
            cant[i]=cantidades.get(i);
            refs[i]=referencias.get(i).split(",")[0];
        }
        String idOrdenDeTrabajo = String.valueOf(cbIdOrden.getSelectedItem());
        String descripcion = tEspecificaciones.getText();
        String estado = String.valueOf(cbEstadoOrden.getItemAt(cbEstadoOrden.getSelectedIndex()));
        String respuesta = bD.actualizarOrden(idOrdenDeTrabajo, descripcion, estado,
                cant,refs, idJefe);
        JOptionPane.showMessageDialog(this, respuesta);
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposOrdenModificar(true);
        llenarComboboxOrden();
        this.cbRefProducto.removeAllItems();
        llenarComboboxInventarioOrden();
        return true;
    }
    
    private boolean agregarReferenciaOrden(){
        if(!validarCamposModificarOrdenDeTrabajo()){
            return false;
        }
        if(referencias.contains(cbRefProducto.getSelectedItem().toString())){
            referencias.set(this.cbRefProducto.getSelectedIndex(), 
                    String.valueOf(this.cbRefProducto.getSelectedItem()));
            cantidades.set(this.cbRefProducto.getSelectedIndex(), 
                    Integer.valueOf(tCantidad.getText()));
        }else{
            referencias.add(cbRefProducto.getSelectedItem().toString());
            cantidades.add(Integer.valueOf(tCantidad.getText()));
        }
        JOptionPane.showMessageDialog(this ,  "Producto "+cbRefProducto.getSelectedItem().toString()+" Agregado");
        return true;  
    };
    
    private boolean modificarItemDeInventario(){
        if(!validarCamposModificarInventario()){
            return false;
        }
        String id = String.valueOf(cbRefProducto.getSelectedItem()).split(",")[0];
        String nombreProducto = String.valueOf(tNombreProducto.getText());
        float valorUnitario = Float.parseFloat(tValorUnitario.getText());
        String descripcion = String.valueOf(tDescripcion.getText());
        System.out.println(descripcion);
        
        String respuesta = bD.actualizarInventario(id, nombreProducto, valorUnitario, 
            descripcion);
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposInventarioModf(true);
        JOptionPane.showMessageDialog(this, "El producto ha sido modificado");
        llenarComboboxInventario();
        return true;
    }
    
    private boolean consultarOrdenDeTrabajo(){
        if(!validarCamposConsultarOrdenDeTrabajo()){
            return false;
        }
        String idOrden = String.valueOf(cbIdOrden.getSelectedItem());

        Object[] nuevo = bD.leerOrdenPorId(idOrden);
        OrdenTrabajo orden = (OrdenTrabajo) nuevo[0];
        String refs = (String) nuevo[1];
        System.out.println("HOLA "+refs);
        String[] splitedrefs = refs.split("\\$");
        
        String mensaje = "ID Orden de trabajo: "+orden.getIdOrden()+"\n"
                + "Especificaciones: "+orden.getEspecficaciones()+"\n"
                +"Estado de la orden: "+orden.getEstadoOrden()+"\n"
                +"Fecha de creacion: "+orden.getFechaCreacion()+"\n"
                +"Fecha de entrega: "+orden.getFechaEntrega()+"\n"
                +"ID Jefe de taller: "+ orden.getIdJefe()+ "\n";
        for (int i=0; i<splitedrefs.length;i++){
            mensaje=mensaje+splitedrefs[i]+"\n";
        }
        JOptionPane.showMessageDialog(this, mensaje);      
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposOrdenConsultar(true);
        llenarComboboxOrden();
        return true;
    }
    
    private boolean consultarItemDeInventario(){
        if(!validarCamposConsultarInventario()){
            return false;            
        }
        String idInventario = String.valueOf(cbRefProducto.getSelectedItem()).split(",")[0];
        //System.out.println(idInventario);
        Inventario inventario = bD.leerInventarioPorId(idInventario);
        String mensaje = "ID producto: "+inventario.getIdProducto()+"\n"
                +"Nombre producto: "+inventario.getNombreProducto()+"\n"
                +"Valor unitario: "+inventario.getValorUnitario()+"\n"
                +"Descripcion: "+inventario.getDescripcion()+"\n"
                +"Cantidad: "+ inventario.getCantidad()+"\n"
                +"ID Jefe de taller: "+ inventario.getIdJefe()+"\n";
        JOptionPane.showMessageDialog(this, mensaje);   
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposInventarioConsultar(true);
        llenarComboboxInventario();
        return true;
    }
    
    private boolean anularOrdenDeTrabajo(){
        if(!validarCamposAnularOrdenDeTrabajo()){
            return false;
        }
        String idOrden = String.valueOf(cbIdOrden.getSelectedItem());
        Object[] nuevo = bD.leerOrdenPorId(idOrden);
        OrdenTrabajo orden = (OrdenTrabajo) nuevo[0];
        String mensaje = "ID Orden de trabajo: "+orden.getIdOrden()+"\n"
                + "Especificaciones: "+orden.getEspecficaciones()+"\n"
                +"Estado de la orden: "+orden.getEstadoOrden()+"\n"
                +"Fecha de creacion: "+orden.getFechaCreacion()+"\n"
                +"Fecha de entrega: "+orden.getFechaEntrega()+"\n"
                +"ID Jefe de taller: "+ orden.getIdJefe()+ "\n";        
            int opcion = JOptionPane.showConfirmDialog(this, mensaje, "", 0);
            if(opcion == 0){
                String respuesta = bD.eliminarOrden(idOrden);
                JOptionPane.showMessageDialog(this, respuesta);
            }
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposOrdenAnular(true);
        llenarComboboxOrden();
        return true;
    }
    
    private boolean eliminarItemDeInventario(){
        if(!validarCamposEliminarInventario()){
            return false;
        }
        String idInventario = String.valueOf(cbRefProducto.getSelectedItem()).split(",")[0];
        System.out.println(idInventario);
        Inventario inventario = bD.leerInventarioPorId(idInventario);
        String mensaje = "ID producto: "+inventario.getIdProducto()+"\n"
                +"Nombre producto: "+inventario.getNombreProducto()+"\n"
                +"Valor unitario: "+inventario.getValorUnitario()+"\n"
                +"Descripcion: "+inventario.getDescripcion()+"\n"
                +"Cantidad lote: "+ inventario.getCantidad()+"\n"
                +"ID Jefe de taller: "+ inventario.getIdJefe()+"\n";
            int opcion = JOptionPane.showConfirmDialog(this, mensaje, "", 0);
            if(opcion == 0){
                String respuesta = bD.eliminarInventario(idInventario);
                JOptionPane.showMessageDialog(this, respuesta);
            }
        limpiarCampos();
        desactivarCampos();
        cambiarVisibilidadCamposInventarioEliminar(true);
        llenarComboboxInventario();
        return true;
    }
    
    public static void main(String args[]) {            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new prinJefeDeTaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInv;
    private javax.swing.JToggleButton anularInv;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bAnular;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JButton bConsul;
    private javax.swing.JButton bModf;
    private javax.swing.JComboBox<String> cbEstadoOrden;
    private javax.swing.JComboBox<String> cbIdOrden;
    private javax.swing.JComboBox<String> cbRefProducto;
    private javax.swing.JButton consulInv;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fechaYhora;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labCantidad;
    private javax.swing.JLabel labDescripcion;
    private javax.swing.JLabel labEspecificaciones;
    private javax.swing.JLabel labEstadoOrden;
    private javax.swing.JLabel labIdOrden;
    private javax.swing.JLabel labNombreProducto;
    private javax.swing.JLabel labRefProductoCB;
    private javax.swing.JLabel labValorUnitario;
    private javax.swing.JButton modInv;
    private javax.swing.JTextField tCantidad;
    private javax.swing.JTextField tDescripcion;
    private javax.swing.JTextField tEspecificaciones;
    private javax.swing.JTextField tNombreProducto;
    private javax.swing.JTextField tValorUnitario;
    // End of variables declaration//GEN-END:variables
}
