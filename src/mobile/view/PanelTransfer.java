/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.view;

import controller.TransaksiController;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mobile.controller.MobileController;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class PanelTransfer extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeranda
     */
    public PanelTransfer() {
        initComponents();
        clear();
        panel_konfirmasi.setVisible(false);
    }
    
    public void clear() {
        noRekening.setText("");
        nominalTransfer.setText("");
        notifikasi.setText("");
        nama.setText("");
        jumlah.setText("");
    }
    
    public long getNoRekening() {
        return Long.parseLong(noRekening.getText());
    }
    
    public void setNotifikasi(String text) {
        notifikasi.setText(text);
    } 
    
    public Double getJumlahTransfer() {
        return Double.parseDouble(nominalTransfer.getText());
    }

    public JPanel getPanel_konfirmasi() {
        return panel_konfirmasi;
    }

    public JLabel getJumlah() {
        return jumlah;
    }

    public JLabel getNama() {
        return nama;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noRekening = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nominalTransfer = new javax.swing.JTextField();
        btn_transfer = new javax.swing.JButton();
        notifikasi = new javax.swing.JLabel();
        panel_konfirmasi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        btn_yes = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(27, 152, 224));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Rekening Tujuan : ");

        noRekening.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nominal Transfer :");

        nominalTransfer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_transfer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_transfer.setText("Transfer");
        btn_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferActionPerformed(evt);
            }
        });

        notifikasi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        notifikasi.setForeground(new java.awt.Color(255, 255, 255));
        notifikasi.setText("Notifikasi");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Senilai");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Transfer Ke");

        nama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nama.setText("Nama Nasabah");

        jumlah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jumlah.setText("Rp. xxx");

        btn_yes.setText("Ya");
        btn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yesActionPerformed(evt);
            }
        });

        btn_cancel.setText("Batal");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_konfirmasiLayout = new javax.swing.GroupLayout(panel_konfirmasi);
        panel_konfirmasi.setLayout(panel_konfirmasiLayout);
        panel_konfirmasiLayout.setHorizontalGroup(
            panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlah)
                    .addComponent(nama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btn_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        panel_konfirmasiLayout.setVerticalGroup(
            panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlah))
                .addGap(18, 18, 18)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_yes)
                    .addComponent(btn_cancel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btn_transfer))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(notifikasi)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noRekening)
                            .addComponent(nominalTransfer)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panel_konfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nominalTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notifikasi)
                .addGap(23, 23, 23)
                .addComponent(btn_transfer)
                .addGap(42, 42, 42)
                .addComponent(panel_konfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferActionPerformed
        // TODO add your handling code here:
        MobileController.getInstance().transfer(this);
    }//GEN-LAST:event_btn_transferActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        panel_konfirmasi.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        // TODO add your handling code here:
        TransaksiController.getInstance().transfer();
        clear();
        panel_konfirmasi.setVisible(false);
        setNotifikasi("Transfer Berhasil");
    }//GEN-LAST:event_btn_yesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_transfer;
    private javax.swing.JButton btn_yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField noRekening;
    private javax.swing.JTextField nominalTransfer;
    private javax.swing.JLabel notifikasi;
    private javax.swing.JPanel panel_konfirmasi;
    // End of variables declaration//GEN-END:variables
}
