/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DefenseSystem extends javax.swing.JFrame {

    private MainController mainController;
    private boolean checkAreaCleared;
    private String msg;
    private String title;
    private ArrayList<Observers> observerList;

    /**
     * Creates new form DefenseSystem
     */
    public DefenseSystem(MainController mainController) {
        this.mainController = mainController;
        observerList = mainController.getList();
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
        txtSendMsg = new javax.swing.JTextArea();
        chkAreaClear = new javax.swing.JCheckBox();
        chkSendPrivate = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReceiveMsg = new javax.swing.JTextArea();
        sliderStrength = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCollect = new javax.swing.JButton();
        cmbSelect = new javax.swing.JComboBox<>();
        txtSoldierCount = new javax.swing.JTextField();
        txtFuelAmount = new javax.swing.JTextField();
        txtAmmoAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Defense System");
        setResizable(false);

        jScrollPane1.setForeground(new java.awt.Color(102, 0, 204));

        txtSendMsg.setColumns(20);
        txtSendMsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSendMsg.setForeground(new java.awt.Color(204, 0, 51));
        txtSendMsg.setRows(5);
        jScrollPane1.setViewportView(txtSendMsg);

        chkAreaClear.setForeground(new java.awt.Color(51, 153, 255));
        chkAreaClear.setText("Area Clear");
        chkAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAreaClearActionPerformed(evt);
            }
        });

        chkSendPrivate.setForeground(new java.awt.Color(51, 153, 255));
        chkSendPrivate.setText("Send Private");

        btnSend.setBackground(new java.awt.Color(153, 204, 255));
        btnSend.setForeground(new java.awt.Color(0, 102, 204));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jScrollPane3.setForeground(new java.awt.Color(51, 153, 255));

        txtReceiveMsg.setColumns(20);
        txtReceiveMsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReceiveMsg.setForeground(new java.awt.Color(204, 0, 51));
        txtReceiveMsg.setRows(5);
        jScrollPane3.setViewportView(txtReceiveMsg);

        sliderStrength.setForeground(new java.awt.Color(51, 153, 255));
        sliderStrength.setMajorTickSpacing(20);
        sliderStrength.setMinorTickSpacing(5);
        sliderStrength.setPaintLabels(true);
        sliderStrength.setPaintTicks(true);
        sliderStrength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStrengthStateChanged(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Soldier Count :");

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Fuel Amount  :");

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Ammo Amount : ");

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Position :");

        btnCollect.setBackground(new java.awt.Color(153, 204, 255));
        btnCollect.setForeground(new java.awt.Color(0, 102, 204));
        btnCollect.setText("Collect Informations");
        btnCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectActionPerformed(evt);
            }
        });

        cmbSelect.setBackground(new java.awt.Color(153, 204, 255));
        cmbSelect.setForeground(new java.awt.Color(0, 102, 204));
        cmbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defense", "Helicopter", "Tank", "Submarine" }));

        txtSoldierCount.setForeground(new java.awt.Color(204, 0, 51));

        txtFuelAmount.setForeground(new java.awt.Color(204, 0, 51));

        txtAmmoAmount.setForeground(new java.awt.Color(204, 0, 51));
        txtAmmoAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmmoAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmmoAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(sliderStrength, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCollect, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend)
                    .addComponent(chkSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(chkAreaClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSendPrivate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCollect)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAmmoAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(sliderStrength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmmoAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmmoAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmmoAmountActionPerformed

    private void chkAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAreaClearActionPerformed
        if (chkAreaClear.isSelected()) {
            checkAreaCleared = true;
            mainController.setChkArea(checkAreaCleared);
        } else {
            checkAreaCleared = false;
            mainController.setChkArea(checkAreaCleared);
        }
    }//GEN-LAST:event_chkAreaClearActionPerformed
    public void SetMessage(String title, String msg) {
        txtReceiveMsg.append(title + " : " + msg + "\n");
    }


    private void sliderStrengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStrengthStateChanged
        // TODO add your handling code here:
        mainController.setStrength(sliderStrength.getValue());
    }//GEN-LAST:event_sliderStrengthStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        boolean selected = chkSendPrivate.isSelected();
        mainController.setTextIndex(cmbSelect.getSelectedIndex(), selected, txtSendMsg.getText());
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectActionPerformed
        mainController.CollectInfo(cmbSelect.getSelectedIndex());// TODO add your handling code here:
    }//GEN-LAST:event_btnCollectActionPerformed
    public void setCount(int soldiers, int ammo) {
        txtSoldierCount.setText("" + soldiers);
        txtAmmoAmount.setText("" + ammo);
    }

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DefenseSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefenseSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefenseSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefenseSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefenseSystem(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollect;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chkAreaClear;
    private javax.swing.JCheckBox chkSendPrivate;
    private javax.swing.JComboBox<String> cmbSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider sliderStrength;
    private javax.swing.JTextField txtAmmoAmount;
    private javax.swing.JTextField txtFuelAmount;
    private javax.swing.JTextArea txtReceiveMsg;
    private javax.swing.JTextArea txtSendMsg;
    private javax.swing.JTextField txtSoldierCount;
    // End of variables declaration//GEN-END:variables
}
