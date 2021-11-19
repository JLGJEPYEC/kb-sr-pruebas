/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a09_JefeAreaContable;

/*
QUINTO CASO DE USO IMPORTANTE DEL SISTEMA - 
PROCESO DE NEGOCIO: MANTENER USUARIOS / GESTION DE PAGOS DE RRHH
*/

import static a09_JefeAreaContable.PrincipalJefeContable.panelPrincipal;
import b_metodos_conexion.extraccion_tablas;
import b_modelos.requerimiento;
import b_modelos.user;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author juan-jolo
 */
public class PanelGestionRRHH extends javax.swing.JPanel {

    private ArrayList<user> lista_usuarios = new ArrayList<user>();
    extraccion_tablas et = new extraccion_tablas();
    public static JPanel pn = null;
    /**
     * Creates new form PanelGestionRRHH
     */
    public PanelGestionRRHH() {
        lista_usuarios = et.usuarios_lista();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        BotonAgregarU = new javax.swing.JButton();
        BotonModificarU = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BotonAgregarU.setText("Agregar personal");
        BotonAgregarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarUActionPerformed(evt);
            }
        });

        BotonModificarU.setText("Modificar personal");
        BotonModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarUActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar personal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id personal", "1er nom", "2dos nombres", "ApPat", "ApMat", "Email", "Area de trabajo", "Sueldo", "tipo de contrato"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonAgregarU)
                        .addGap(18, 18, 18)
                        .addComponent(BotonModificarU)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonModificarU)
                    .addComponent(jButton3)
                    .addComponent(BotonAgregarU))
                .addGap(49, 49, 49))
        );

        jScrollPane1.setViewportView(panelPrincipal);

        jLabel1.setText("Gestion de pagos de RRHH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarUActionPerformed
        pn = new PanelAgregarRRHH();
        pn.setSize(panelPrincipal.getWidth(),panelPrincipal.getHeight());
        pn.setLocation(0,0);
        panelPrincipal.removeAll();
        panelPrincipal.add(pn,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarUActionPerformed

    private void BotonModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarUActionPerformed
        
        extraccion_tablas et = new extraccion_tablas();
       //este metodo extrae el id de la fila seleccionada en la tabla mostrada aqui
        int fs = jTable1.getSelectedRow();
        if (fs<0){
            System.out.println("no se ha seleccionado nada para modificar");
        }else{
            String valorCelda = String.valueOf(jTable1.getValueAt(fs, 0));
            System.out.println(valorCelda);
            user requerido = et.UsuarioDeseado(Integer.parseInt(valorCelda));
            pn = new PanelModificarRRHH(requerido);
            pn.setSize(panelPrincipal.getWidth(),panelPrincipal.getHeight());
            pn.setLocation(0,0);;
            panelPrincipal.removeAll();
            panelPrincipal.add(pn,BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarUActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        int n= lista_usuarios.size();
        String [][] arreglo = new String [n][9];
        for (int i = 0; i < n; i++) {
            arreglo[i][0]=String.valueOf(lista_usuarios.get(i).getId_user());
            arreglo[i][1]=lista_usuarios.get(i).getNombre1();
            arreglo[i][2]=lista_usuarios.get(i).getNombre2();
            arreglo[i][3]=lista_usuarios.get(i).getAp_p();
            arreglo[i][4]=lista_usuarios.get(i).getAp_m();
            arreglo[i][5]=lista_usuarios.get(i).getEmail();
            arreglo[i][6]=lista_usuarios.get(i).getTipo_usuario();
            arreglo[i][7]=String.valueOf(lista_usuarios.get(i).getSueldo());
            arreglo[i][8]=lista_usuarios.get(i).getTipo_contrato();
           // arre
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            arreglo,
            new String [] {
        "Id personal", "1er nom", "2dos nombres", "ApPat", "ApMat", "Email", "Area de trabajo", "Sueldo", "tipo de contrato"
    }
        ));
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        extraccion_tablas et = new extraccion_tablas();
       //este metodo extrae el id de la fila seleccionada en la tabla mostrada aqui
        int fs = jTable1.getSelectedRow();
        if (fs<0){
            System.out.println("no se ha seleccionado nada para eliminar");
        }else{
            String valorCelda = String.valueOf(jTable1.getValueAt(fs, 0));
            System.out.println(valorCelda);
            user requerido = et.UsuarioDeseado(Integer.parseInt(valorCelda));
            requerido.eliminarBBDD();
            System.out.println("usuario eliminado");
            PanelGestionRRHH.panelPrincipal.removeAll();
            PanelGestionRRHH.panelPrincipal.revalidate();
            PanelGestionRRHH.panelPrincipal.repaint();
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarU;
    private javax.swing.JButton BotonModificarU;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}