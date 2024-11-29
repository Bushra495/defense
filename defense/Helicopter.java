/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense;

import static defense.Strength.STRONG;

/**
 *
 * @author User
 */
public class Helicopter extends javax.swing.JFrame implements Observers {

    private boolean checkAreaCleared = false;
    private MainController mainController;
     private int valueSoldier=0;
    private int valueAmmo=0;
   
    /**
     * Creates new form Helicopter
     */
    public Helicopter(MainController mainController) {
        initComponents();
        this.mainController = mainController;
    }

    @Override
    public void updateCheckAreaCleared(boolean checkAreaCleared) {
        if (checkAreaCleared == true) {
            this.checkAreaCleared = checkAreaCleared;
            lblAreaClear.setText("Area Cleared");

        } else {
            this.checkAreaCleared = checkAreaCleared;
            lblAreaClear.setText("Area Not Cleared");

        }
    }

    @Override
    public void updateStrengthButtons(int strength) {
        Strength st = Strength.strengthForValue(strength);
        if (checkAreaCleared == true && chkPosition.isSelected()) {
            switch (st) {
                case STRONG:
                    btn3.setEnabled(true);
                    btn2.setEnabled(true);
                    btn1.setEnabled(true);
                    break;
                case HIGH:
                    btn2.setEnabled(true);
                    btn1.setEnabled(true);
                    btn3.setEnabled(false);
                    break;
                case MEDIUM:
                    btn1.setEnabled(true);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    break;
                case LOW:
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaClear = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceiveMsg = new javax.swing.JTextArea();
        txtToDefense = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkPosition = new javax.swing.JCheckBox();
        spinSoldier = new javax.swing.JSpinner();
        spinAmmo = new javax.swing.JSpinner();
        sliderFuel = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");
        setResizable(false);

        lblAreaClear.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lblAreaClear.setForeground(new java.awt.Color(0, 102, 0));
        lblAreaClear.setText("Area Not Cleared");

        btn1.setBackground(new java.awt.Color(153, 255, 204));
        btn1.setForeground(new java.awt.Color(0, 102, 0));
        btn1.setText("Shoot");
        btn1.setEnabled(false);

        btn3.setBackground(new java.awt.Color(153, 255, 204));
        btn3.setForeground(new java.awt.Color(0, 102, 0));
        btn3.setText("Laser Operation");
        btn3.setEnabled(false);

        btn2.setBackground(new java.awt.Color(153, 255, 204));
        btn2.setForeground(new java.awt.Color(0, 102, 0));
        btn2.setText("Missile Operation");
        btn2.setEnabled(false);

        txtReceiveMsg.setColumns(20);
        txtReceiveMsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReceiveMsg.setForeground(new java.awt.Color(204, 0, 0));
        txtReceiveMsg.setRows(5);
        jScrollPane1.setViewportView(txtReceiveMsg);

        txtToDefense.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtToDefense.setForeground(new java.awt.Color(204, 0, 0));

        btnSend.setBackground(new java.awt.Color(153, 255, 204));
        btnSend.setForeground(new java.awt.Color(0, 102, 0));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Soldier Count");

        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Ammo Count ");

        chkPosition.setForeground(new java.awt.Color(0, 102, 0));
        chkPosition.setText("Position");
        chkPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositionActionPerformed(evt);
            }
        });

        spinSoldier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinSoldier.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinSoldierStateChanged(evt);
            }
        });

        spinAmmo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinAmmo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinAmmoStateChanged(evt);
            }
        });

        sliderFuel.setForeground(new java.awt.Color(0, 102, 0));
        sliderFuel.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderFuel.setPaintLabels(true);
        sliderFuel.setPaintTicks(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtToDefense)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend))
                    .addComponent(jScrollPane1)
                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaClear)
                            .addComponent(jLabel2)
                            .addComponent(spinSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(spinAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPosition)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtToDefense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPositionActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = txtToDefense.getText();
        mainController.setReceivedMsg(getTitle(), msg);
    }//GEN-LAST:event_btnSendActionPerformed

    private void spinSoldierStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinSoldierStateChanged
        // TODO add your handling code here:
        this.valueSoldier=(Integer) spinSoldier.getValue();
    }//GEN-LAST:event_spinSoldierStateChanged

    private void spinAmmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinAmmoStateChanged
        // TODO add your handling code here:
        this.valueAmmo=(Integer) spinAmmo.getValue();
    }//GEN-LAST:event_spinAmmoStateChanged
@Override
    public void updateText(String text) {
        txtReceiveMsg.append(text);
    }
    @Override
public int updateSoldiers(){
         return this.valueSoldier;
    }
@Override
    public int updateAmmo(){
        return this.valueAmmo;
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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helicopter(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chkPosition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JSlider sliderFuel;
    private javax.swing.JSpinner spinAmmo;
    private javax.swing.JSpinner spinSoldier;
    private javax.swing.JTextArea txtReceiveMsg;
    private javax.swing.JTextField txtToDefense;
    // End of variables declaration//GEN-END:variables
}
