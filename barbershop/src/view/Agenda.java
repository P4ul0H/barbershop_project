/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author T-Gamer
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btnagendar = new javax.swing.JButton();
        txtservico = new javax.swing.JComboBox<>();
        txtcliente = new javax.swing.JComboBox<>();
        txtvalor = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(dataTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 557, 1060, 320));

        txtobs.setColumns(20);
        txtobs.setRows(5);
        jScrollPane3.setViewportView(txtobs);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 580, 290));

        jLabel10.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agenda");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        btnagendar.setBackground(new java.awt.Color(0, 255, 51));
        btnagendar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnagendar.setForeground(new java.awt.Color(255, 255, 255));
        btnagendar.setText("Agendar");
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 580, 50));

        txtservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtservicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtservico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 290, 40));

        getContentPane().add(txtcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 290, 40));

        txtvalor.setText("0");
        getContentPane().add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 290, 40));
        getContentPane().add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 290, 40));
        getContentPane().add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 290, 40));

        txtid.setEditable(false);
        txtid.setText("0");
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 290, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Observação");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor R$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Serviço");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtservicoActionPerformed
        this.controller.updatePrice();
    }//GEN-LAST:event_txtservicoActionPerformed

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        this.controller.schedule();
    }//GEN-LAST:event_btnagendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagendar;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> txtcliente;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtobs;
    private javax.swing.JComboBox<String> txtservico;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables


    public JTable getDataTable() {
        return dataTable;
    }

    public void setDataTable(JTable dataTable) {
        this.dataTable = dataTable;
    }

    private void iniciar() {
        this.controller.updateTable();
        this.controller.updateClients();
        this.controller.updateServices();
        this.controller.setTxtIdToLast();
        this.controller.updatePrice();
    }

    public JComboBox<String> getTxtcliente() {
        return txtcliente;
    }

    public void setTxtcliente(JComboBox<String> txtcliente) {
        this.txtcliente = txtcliente;
    }

    public JComboBox<String> getTxtservico() {
        return txtservico;
    }

    public void setTxtservico(JComboBox<String> txtservico) {
        this.txtservico = txtservico;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JTextField getTxtvalor() {
        return txtvalor;
    }

    public void setTxtvalor(JTextField txtvalor) {
        this.txtvalor = txtvalor;
    }

    public JTextField getTxtdata() {
        return txtdata;
    }

    public void setTxtdata(JTextField txtdata) {
        this.txtdata = txtdata;
    }

    public JTextField getTxthora() {
        return txthora;
    }

    public void setTxthora(JTextField txthora) {
        this.txthora = txthora;
    }

    public JTextArea getTxtobs() {
        return txtobs;
    }

    public void setTxtobs(JTextArea txtobs) {
        this.txtobs = txtobs;
    }
    
    
    
}