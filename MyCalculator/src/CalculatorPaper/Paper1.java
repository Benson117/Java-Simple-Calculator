
package CalculatorPaper;


public class Paper1 extends javax.swing.JFrame {
    CalculatorPaper1 cp1= new CalculatorPaper1();

   
    public Paper1() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jBOpen = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMSave = new javax.swing.JMenuItem();
        jMSaveAs = new javax.swing.JMenu();
        jMTXT = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMPrint = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jToolBar1.setRollover(true);

        jBOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalculatorPaper/open.jpg"))); // NOI18N
        jBOpen.setFocusable(false);
        jBOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(jBOpen);

        jBSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalculatorPaper/save.jpg"))); // NOI18N
        jBSave.setFocusable(false);
        jBSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(jBSave);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalculatorPaper/text.jpg"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jBExit.setText("Exit");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        jMenu1.setText("Archive");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMOpen.setText("Open");
        jMOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMOpen);
        jMenu1.add(jSeparator1);

        jMSave.setText("Save");
        jMSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMSave);

        jMSaveAs.setText("Save as");

        jMTXT.setText("TXT");
        jMSaveAs.add(jMTXT);

        jMenu1.add(jMSaveAs);
        jMenu1.add(jSeparator2);

        jMPrint.setText("Print");
        jMPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrintActionPerformed(evt);
            }
        });
        jMenu1.add(jMPrint);
        jMenu1.add(jSeparator3);

        jMExit.setText("Exit");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBExit, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jBOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOpenActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExitActionPerformed

    private void jMOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMOpenActionPerformed

    private void jMSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMSaveActionPerformed

    private void jMPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMPrintActionPerformed

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMExitActionPerformed

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
            java.util.logging.Logger.getLogger(Paper1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paper1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paper1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paper1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paper1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOpen;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenuItem jMExit;
    private javax.swing.JMenuItem jMOpen;
    private javax.swing.JMenuItem jMPrint;
    private javax.swing.JMenuItem jMSave;
    private javax.swing.JMenu jMSaveAs;
    private javax.swing.JMenuItem jMTXT;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
