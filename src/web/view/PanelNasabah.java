/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.view;

import javax.swing.JPanel;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class PanelNasabah extends javax.swing.JPanel {

    private JPanel dashboard = new PanelDashboard();
    private JPanel transfer = new PanelTransfer();
    private JPanel transaksi = new PanelMutasi();
    private JPanel pembayaran = new PanelPembayaran();
    private JPanel isiUlang = new PanelIsiUlang();
    private Web web;
    
    public PanelNasabah(Web web) {
        initComponents();
        this.web = web;
        panelMain.add(dashboard);
        panelMain.add(transfer);
        panelMain.add(transaksi);
        panelMain.add(isiUlang);
        panelMain.add(pembayaran);
        gantiPanel(dashboard);
    }
    
    public void setPanelHide() {
        dashboard.setVisible(false);
        transfer.setVisible(false);
        transaksi.setVisible(false);
        pembayaran.setVisible(false);
        isiUlang.setVisible(false);
    }
    
    public void gantiPanel(JPanel panel) {
        setPanelHide();
        panel.setVisible(true);
    }
    
    public PanelDashboard getDashboard() {
        return (PanelDashboard) dashboard;
    }
    
    public PanelMutasi getPanelTransaksi() {
        return (PanelMutasi) transaksi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btn_dashboard = new javax.swing.JButton();
        btn_trasfer = new javax.swing.JButton();
        btn_pembayaran = new javax.swing.JButton();
        btn_isiUlang = new javax.swing.JButton();
        btn_mutasi = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(19, 41, 61));

        btn_dashboard.setBackground(new java.awt.Color(208, 230, 239));
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile.png"))); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setFocusable(false);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        btn_trasfer.setBackground(new java.awt.Color(208, 230, 239));
        btn_trasfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transfer.png"))); // NOI18N
        btn_trasfer.setText("Transfer");
        btn_trasfer.setFocusable(false);
        btn_trasfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trasferActionPerformed(evt);
            }
        });

        btn_pembayaran.setBackground(new java.awt.Color(208, 230, 239));
        btn_pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/payment.png"))); // NOI18N
        btn_pembayaran.setText("Pembayaran");
        btn_pembayaran.setFocusable(false);
        btn_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pembayaranActionPerformed(evt);
            }
        });

        btn_isiUlang.setBackground(new java.awt.Color(208, 230, 239));
        btn_isiUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/isiUlang.png"))); // NOI18N
        btn_isiUlang.setText("Isi Ulang");
        btn_isiUlang.setFocusable(false);
        btn_isiUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_isiUlangActionPerformed(evt);
            }
        });

        btn_mutasi.setBackground(new java.awt.Color(208, 230, 239));
        btn_mutasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mutasi.png"))); // NOI18N
        btn_mutasi.setText("Cek Mutasi");
        btn_mutasi.setFocusable(false);
        btn_mutasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mutasiActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(208, 230, 239));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit.png"))); // NOI18N
        jButton7.setText("Keluar");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_trasfer, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btn_pembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btn_isiUlang, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btn_mutasi, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_trasfer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_isiUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setPreferredSize(new java.awt.Dimension(100, 600));
        panelMain.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
        gantiPanel(dashboard);
        getDashboard().update();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_trasferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trasferActionPerformed
        // TODO add your handling code here:
        gantiPanel(transfer);
    }//GEN-LAST:event_btn_trasferActionPerformed

    private void btn_mutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mutasiActionPerformed
        // TODO add your handling code here:
        gantiPanel(transaksi);
        getPanelTransaksi().update();
    }//GEN-LAST:event_btn_mutasiActionPerformed

    private void btn_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pembayaranActionPerformed
        // TODO add your handling code here:
        gantiPanel(pembayaran);
    }//GEN-LAST:event_btn_pembayaranActionPerformed

    private void btn_isiUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_isiUlangActionPerformed
        // TODO add your handling code here:
        gantiPanel(isiUlang);
    }//GEN-LAST:event_btn_isiUlangActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        web.logOut();
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_isiUlang;
    private javax.swing.JButton btn_mutasi;
    private javax.swing.JButton btn_pembayaran;
    private javax.swing.JButton btn_trasfer;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
