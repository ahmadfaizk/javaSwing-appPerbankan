/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.view.admin;

import javax.swing.JPanel;
import web.view.Web;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class PanelAdmin extends javax.swing.JPanel {
    
    private JPanel createNasabah = new PanelCreateNasabah();
    private JPanel listNasabah = new PanelListNasabah();
    private JPanel deleteNasabah = new PanelDeleteNasabah();
    private JPanel setor = new PanelSetor();
    private JPanel cekMutasi = new PanelCekMutasi();
    private JPanel tarik = new PanelTarik();
    private Web web;

    public PanelAdmin(Web web) {
        initComponents();
        this.web = web;
        panelMain.add(createNasabah);
        panelMain.add(listNasabah);
        panelMain.add(deleteNasabah);
        panelMain.add(tarik);
        panelMain.add(setor);
        panelMain.add(cekMutasi);
        setVisibleNasabah(false);
        setVisibleTransaksi(false);
        gantiPanel(createNasabah);
    }
    
    public void setVisibleNasabah(boolean show) {
        btn_tambahNasabah.setVisible(show);
        btn_listNasabah.setVisible(show);
        btn_hapusNasabah.setVisible(show);
    }
    
    public void setVisibleTransaksi(boolean show) {
        btn_setorTunai.setVisible(show);
        btn_tarikTunai.setVisible(show);
        btn_cekMutasi.setVisible(show);
    }
    
    public void setPanelHide() {
        createNasabah.setVisible(false);
        listNasabah.setVisible(false);
        deleteNasabah.setVisible(false);
        tarik.setVisible(false);
        setor.setVisible(false);
        cekMutasi.setVisible(false);
    }
    
    public void gantiPanel(JPanel panel) {
        setPanelHide();
        panel.setVisible(true);
    }
    
    public PanelListNasabah getPanelList() {
        return (PanelListNasabah) listNasabah;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btn_nasabah = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_tambahNasabah = new javax.swing.JButton();
        btn_listNasabah = new javax.swing.JButton();
        btn_setorTunai = new javax.swing.JButton();
        btn_tarikTunai = new javax.swing.JButton();
        btn_cekMutasi = new javax.swing.JButton();
        btn_hapusNasabah = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(19, 41, 61));

        btn_nasabah.setBackground(new java.awt.Color(208, 230, 239));
        btn_nasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nasabah.png"))); // NOI18N
        btn_nasabah.setText("Nasabah");
        btn_nasabah.setFocusable(false);
        btn_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nasabahActionPerformed(evt);
            }
        });

        btn_transaksi.setBackground(new java.awt.Color(208, 230, 239));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transaksi.png"))); // NOI18N
        btn_transaksi.setText("Transaksi");
        btn_transaksi.setFocusable(false);
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(208, 230, 239));
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit.png"))); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.setFocusable(false);
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        btn_tambahNasabah.setBackground(new java.awt.Color(208, 230, 239));
        btn_tambahNasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/addUser.png"))); // NOI18N
        btn_tambahNasabah.setText("Tambah");
        btn_tambahNasabah.setFocusable(false);
        btn_tambahNasabah.setIconTextGap(0);
        btn_tambahNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahNasabahActionPerformed(evt);
            }
        });

        btn_listNasabah.setBackground(new java.awt.Color(208, 230, 239));
        btn_listNasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        btn_listNasabah.setText("List");
        btn_listNasabah.setFocusable(false);
        btn_listNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listNasabahActionPerformed(evt);
            }
        });

        btn_setorTunai.setBackground(new java.awt.Color(208, 230, 239));
        btn_setorTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setorTunai.png"))); // NOI18N
        btn_setorTunai.setText("Setor Tunai");
        btn_setorTunai.setFocusable(false);
        btn_setorTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setorTunaiActionPerformed(evt);
            }
        });

        btn_tarikTunai.setBackground(new java.awt.Color(208, 230, 239));
        btn_tarikTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tarikTunai.png"))); // NOI18N
        btn_tarikTunai.setText("Tarik Tunai");
        btn_tarikTunai.setFocusable(false);
        btn_tarikTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarikTunaiActionPerformed(evt);
            }
        });

        btn_cekMutasi.setBackground(new java.awt.Color(208, 230, 239));
        btn_cekMutasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cekMutasi.png"))); // NOI18N
        btn_cekMutasi.setText("Cek Mutasi");
        btn_cekMutasi.setFocusable(false);
        btn_cekMutasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cekMutasiActionPerformed(evt);
            }
        });

        btn_hapusNasabah.setBackground(new java.awt.Color(208, 230, 239));
        btn_hapusNasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/removeUser.png"))); // NOI18N
        btn_hapusNasabah.setText("Hapus");
        btn_hapusNasabah.setFocusable(false);
        btn_hapusNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusNasabahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nasabah, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_hapusNasabah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_listNasabah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(btn_tambahNasabah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_setorTunai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_tarikTunai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cekMutasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_tambahNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_listNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapusNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_setorTunai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_tarikTunai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cekMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nasabahActionPerformed
        // TODO add your handling code here:
        if (btn_tambahNasabah.isVisible())
            setVisibleNasabah(false);
        else
            setVisibleNasabah(true);
    }//GEN-LAST:event_btn_nasabahActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        web.logOut();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
        if (btn_setorTunai.isVisible())
            setVisibleTransaksi(false);
        else
            setVisibleTransaksi(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_tambahNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahNasabahActionPerformed
        // TODO add your handling code here:
        gantiPanel(createNasabah);
    }//GEN-LAST:event_btn_tambahNasabahActionPerformed

    private void btn_listNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listNasabahActionPerformed
        // TODO add your handling code here:
        gantiPanel(listNasabah);
        getPanelList().update();
    }//GEN-LAST:event_btn_listNasabahActionPerformed

    private void btn_tarikTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarikTunaiActionPerformed
        // TODO add your handling code here:
        gantiPanel(tarik);
    }//GEN-LAST:event_btn_tarikTunaiActionPerformed

    private void btn_setorTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setorTunaiActionPerformed
        // TODO add your handling code here:
        gantiPanel(setor);
    }//GEN-LAST:event_btn_setorTunaiActionPerformed

    private void btn_cekMutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cekMutasiActionPerformed
        // TODO add your handling code here:
        gantiPanel(cekMutasi);
    }//GEN-LAST:event_btn_cekMutasiActionPerformed

    private void btn_hapusNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusNasabahActionPerformed
        // TODO add your handling code here:
        gantiPanel(deleteNasabah);
    }//GEN-LAST:event_btn_hapusNasabahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cekMutasi;
    private javax.swing.JButton btn_hapusNasabah;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_listNasabah;
    private javax.swing.JButton btn_nasabah;
    private javax.swing.JButton btn_setorTunai;
    private javax.swing.JButton btn_tambahNasabah;
    private javax.swing.JButton btn_tarikTunai;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
