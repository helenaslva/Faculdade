/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Veiculo;

/**
 *
 * @author helenas
 */
public class AppUi extends javax.swing.JFrame {

    /**
     * Creates new form AppUi
     */
    public AppUi() {
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

        lHoraEntrada1 = new javax.swing.JLabel();
        lHoraEntrada = new javax.swing.JLabel();
        lHoraSaida = new javax.swing.JLabel();
        onClick = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfHoraEntrada = new javax.swing.JTextField();
        tfHoraSaida = new javax.swing.JTextField();
        lMostraValor = new javax.swing.JLabel();

        lHoraEntrada1.setText("Hora de entrada");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lHoraEntrada.setText("Hora de entrada");

        lHoraSaida.setText("Hora de saída");

        onClick.setText("Validar");
        onClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClickActionPerformed(evt);
            }
        });

        tfHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraEntradaActionPerformed(evt);
            }
        });

        tfHoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraSaidaActionPerformed(evt);
            }
        });

        lMostraValor.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lHoraEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(lHoraSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(onClick)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lMostraValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHoraEntrada)
                    .addComponent(lHoraSaida)
                    .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(onClick)
                .addGap(40, 40, 40)
                .addComponent(lMostraValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraEntradaActionPerformed

    private void tfHoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraSaidaActionPerformed

    private void onClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClickActionPerformed
       int horaEntrada = Integer.parseInt(tfHoraEntrada.getText());
       int horaSaida = Integer.parseInt(tfHoraSaida.getText());; 
       
       Veiculo veiculo = new Veiculo("shdasd", "kabsd", "dsdfsd");
       
      lMostraValor.setText("O valor a ser pago é: " + veiculo.calculaValorTotal(horaEntrada, horaSaida));
       
       
    }//GEN-LAST:event_onClickActionPerformed

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
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lHoraEntrada;
    private javax.swing.JLabel lHoraEntrada1;
    private javax.swing.JLabel lHoraSaida;
    private javax.swing.JLabel lMostraValor;
    private javax.swing.JButton onClick;
    private javax.swing.JTextField tfHoraEntrada;
    private javax.swing.JTextField tfHoraSaida;
    // End of variables declaration//GEN-END:variables
}