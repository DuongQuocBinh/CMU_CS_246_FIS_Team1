/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author pur
 */
public class FrmMenu extends javax.swing.JFrame {

    private String ChiaLayDu;
    private String FrmMenu;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        txtResult = new javax.swing.JLabel();
        btnchia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtFirstNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSecondNumber = new javax.swing.JTextField();
        btnCE = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnCong = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnTru = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnNhan = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnChia = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnChiaLayDu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnchia.setText("Bằng");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        jLabel1.setText("Kết quả:");

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Phép tính");

        txtFirstNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNumberActionPerformed(evt);
            }
        });

        jLabel3.setText("Số thứ nhất:");

        jLabel4.setText("Số thứ hai:");

        txtSecondNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecondNumberActionPerformed(evt);
            }
        });

        btnCE.setText("Xóa");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        mnMenu.setText("Menu");
        mnMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnCong.setText("Phép Cộng");
        mnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCongActionPerformed(evt);
            }
        });
        mnMenu.add(mnCong);
        mnMenu.add(jSeparator7);

        mnTru.setText("Phép Trừ");
        mnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTruActionPerformed(evt);
            }
        });
        mnMenu.add(mnTru);
        mnMenu.add(jSeparator6);

        mnNhan.setText("Phép Nhân");
        mnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhanActionPerformed(evt);
            }
        });
        mnMenu.add(mnNhan);
        mnMenu.add(jSeparator4);

        mnChia.setText("Phép Chia");
        mnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChiaActionPerformed(evt);
            }
        });
        mnMenu.add(mnChia);
        mnMenu.add(jSeparator3);

        mnChiaLayDu.setText("Phép chia lấy dư");
        mnChiaLayDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChiaLayDuActionPerformed(evt);
            }
        });
        mnMenu.add(mnChiaLayDu);

        jMenuBar1.add(mnMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnchia)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)
                        .addGap(18, 18, 18)
                        .addComponent(btnCE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 184, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 184, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchia)
                    .addComponent(btnreset)
                    .addComponent(btnCE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 123, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 123, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchiaActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtFirstNumber.setText("");
        txtSecondNumber.setText("");
        txtResult.setText("");
        boolean isEqualsPress = false;
    }//GEN-LAST:event_btnresetActionPerformed

    private void mnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCongActionPerformed
        // TODO add your handling code here:
        new Cong().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnCongActionPerformed

    private void mnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTruActionPerformed
        // TODO add your handling code here:
        new Tru().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnTruActionPerformed

    private void mnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhanActionPerformed
        // TODO add your handling code here:
        new Nhan().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnNhanActionPerformed

    private void mnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChiaActionPerformed
        // TODO add your handling code here:
        new Chia().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnChiaActionPerformed

    private void mnChiaLayDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChiaLayDuActionPerformed
        // TODO add your handling code here:
        new ChiaLayDu().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnChiaLayDuActionPerformed

    private void txtFirstNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNumberActionPerformed

    private void txtSecondNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecondNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecondNumberActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
        txtFirstNumber.setText("");
        txtSecondNumber.setText("");
        txtResult.setText("");
        boolean isEqualsPress = false;
    }//GEN-LAST:event_btnCEActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem mnChia;
    private javax.swing.JMenuItem mnChiaLayDu;
    private javax.swing.JMenuItem mnCong;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JMenuItem mnNhan;
    private javax.swing.JMenuItem mnTru;
    private javax.swing.JTextField txtFirstNumber;
    private javax.swing.JLabel txtResult;
    private javax.swing.JTextField txtSecondNumber;
    // End of variables declaration//GEN-END:variables
}
