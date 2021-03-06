/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.view;

import controller.TransaksiController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mobile.controller.MobileController;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class PanelPembayaran extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeranda
     */
    public PanelPembayaran() {
        initComponents();
        panel_konfirmasi.setVisible(false);
        clear();
    }
    
    public void setNotifikasi(String text) {
        notifikasi.setText(text);
    }
    
    public void clear() {
        idPelanggan.setText("");
        notifikasi.setText("");
        idPel.setText("");
        jumlahTagihan.setText("");
    }

    public JLabel getIdPel() {
        return idPel;
    }

    public JLabel getJumlahTagihan() {
        return jumlahTagihan;
    }

    public JPanel getPanel_konfirmasi() {
        return panel_konfirmasi;
    }

    public JTextField getIdPelanggan() {
        return idPelanggan;
    }

    public JComboBox<String> getJenis() {
        return jenis;
    }

    public JLabel getBiayaAdmin() {
        return biayaAdmin;
    }

    public JLabel getBiayaTotal() {
        return biayaTotal;
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
        jenis = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        idPelanggan = new javax.swing.JTextField();
        btn_bayar = new javax.swing.JButton();
        panel_konfirmasi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jumlahTagihan = new javax.swing.JLabel();
        idPel = new javax.swing.JLabel();
        btn_yes = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        biayaAdmin = new javax.swing.JLabel();
        biayaTotal = new javax.swing.JLabel();
        notifikasi = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 152, 224));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pilih Jenis Pembayaran :");

        jenis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLN", "PDAM" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pelanggan :");

        idPelanggan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_bayar.setText("Bayar");
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID Pelanggan");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Bayar Tagihan");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah Tagihan");

        jumlahTagihan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jumlahTagihan.setText("Rp. xxx");

        idPel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idPel.setText("xxxx");

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

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Biaya Admin");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Biaya Total");

        biayaAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        biayaAdmin.setText("Rp. xxx");

        biayaTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        biayaTotal.setText("Rp. xxx");

        javax.swing.GroupLayout panel_konfirmasiLayout = new javax.swing.GroupLayout(panel_konfirmasi);
        panel_konfirmasi.setLayout(panel_konfirmasiLayout);
        panel_konfirmasiLayout.setHorizontalGroup(
            panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_konfirmasiLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(btn_yes)
                .addGap(97, 97, 97)
                .addComponent(btn_cancel)
                .addGap(81, 81, 81))
            .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                        .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(biayaTotal)
                            .addComponent(biayaAdmin)
                            .addComponent(idPel)
                            .addComponent(jumlahTagihan))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_konfirmasiLayout.setVerticalGroup(
            panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_konfirmasiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idPel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlahTagihan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(biayaAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(biayaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panel_konfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_yes))
                .addContainerGap())
        );

        notifikasi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        notifikasi.setForeground(new java.awt.Color(255, 255, 255));
        notifikasi.setText("Notifikasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPelanggan)
                    .addComponent(panel_konfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(notifikasi))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btn_bayar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notifikasi)
                .addGap(10, 10, 10)
                .addComponent(btn_bayar)
                .addGap(18, 18, 18)
                .addComponent(panel_konfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        panel_konfirmasi.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
        // TODO add your handling code here:
        MobileController.getInstance().pembayaran(this);
    }//GEN-LAST:event_btn_bayarActionPerformed

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        // TODO add your handling code here:
        TransaksiController.getInstance().bayarTagihan();
        panel_konfirmasi.setVisible(false);
        setNotifikasi("Pembayaran Tagihan Berhasil");
    }//GEN-LAST:event_btn_yesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biayaAdmin;
    private javax.swing.JLabel biayaTotal;
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_yes;
    private javax.swing.JLabel idPel;
    private javax.swing.JTextField idPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel jumlahTagihan;
    private javax.swing.JLabel notifikasi;
    private javax.swing.JPanel panel_konfirmasi;
    // End of variables declaration//GEN-END:variables
}
