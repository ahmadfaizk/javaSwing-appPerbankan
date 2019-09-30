/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.view;

import atm.controller.ATMController;
import javax.swing.JPanel;
import launcher.Perbankan;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class ATM extends javax.swing.JFrame {

    private JPanel login = new PanelLogin();
    private JPanel menuAwal = new PanelMenu();
    private JPanel menuLain = new PanelMenu();
    private JPanel tarik = new PanelInput();
    private JPanel inputRekening = new PanelInput();
    private JPanel inputNominal = new PanelInput();
    private JPanel inputId = new PanelInput();
    private JPanel info = new PanelInfo();
    private JPanel menuPembayaran = new PanelMenu();
    private JPanel menuIsiUlang = new PanelMenu();
    private JPanel konfirmasiTarik = new PanelKonfirmasi();
    private JPanel konfirmasiTransfer = new PanelKonfirmasi();
    private JPanel konfirmasiPembayaran = new PanelKonfirmasi();
    private JPanel menuNominalIsiUlang = new PanelMenu();
    private JPanel inputNoHp = new PanelInput();
    private JPanel konfirmasiIsiUlang = new PanelKonfirmasi();
    private JPanel inputPinLama = new PanelInput();
    private JPanel inputPinBaru = new PanelInput();
    private Perbankan main;
    
    public ATM(Perbankan main) {
        initComponents();
        this.main = main;
        panel_layar.add(login);
        panel_layar.add(menuAwal);
        panel_layar.add(menuLain);
        panel_layar.add(inputRekening);
        panel_layar.add(inputNominal);
        panel_layar.add(tarik);
        panel_layar.add(info);
        panel_layar.add(menuPembayaran);
        panel_layar.add(menuIsiUlang);
        panel_layar.add(konfirmasiTarik);
        panel_layar.add(konfirmasiTransfer);
        panel_layar.add(konfirmasiPembayaran);
        panel_layar.add(inputId);
        panel_layar.add(inputNoHp);
        panel_layar.add(menuNominalIsiUlang);
        panel_layar.add(konfirmasiIsiUlang);
        panel_layar.add(inputPinLama);
        panel_layar.add(inputPinBaru);
        initPanelAwal();
        ATMController.getInstance().initAllPanel(this);
    }
    
    public void initPanelAwal() {
        setPanelHide();
        login.setVisible(true);
    }
    
    public void setPanelHide() {
        login.setVisible(false);
        menuAwal.setVisible(false);
        menuLain.setVisible(false);
        tarik.setVisible(false);
        inputRekening.setVisible(false);
        info.setVisible(false);
        menuPembayaran.setVisible(false);
        menuIsiUlang.setVisible(false);
        konfirmasiTarik.setVisible(false);
        inputNominal.setVisible(false);
        konfirmasiTransfer.setVisible(false);
        konfirmasiPembayaran.setVisible(false);
        inputId.setVisible(false);
        inputNoHp.setVisible(false);
        menuNominalIsiUlang.setVisible(false);
        konfirmasiIsiUlang.setVisible(false);
        inputPinLama.setVisible(false);
        inputPinBaru.setVisible(false);
    }
    
    public void gantiPanel(JPanel panel) {
        setPanelHide();
        panel.setVisible(true);
    }
    
    public PanelLogin getPanelLogin() {
        return (PanelLogin) login;
    }

    public PanelMenu getMenuAwal() {
        return (PanelMenu) menuAwal;
    }
    
    public PanelMenu getMenuLain() {
        return (PanelMenu) menuLain;
    }
    
    public PanelInput getPanelTarik() {
        return (PanelInput) tarik;
    }
    
    public PanelInfo getPanelInfo() {
        return (PanelInfo) info;
    }
    
    public PanelInput getPanelInputRekening() {
        return (PanelInput) inputRekening;
    }
    
    public PanelInput getPanelInputNominal() {
        return (PanelInput) inputNominal;
    }
    
    public PanelMenu getMenuPembayaran() {
        return (PanelMenu) menuPembayaran;
    }
    
    public PanelMenu getMenuIsiUlang() {
        return (PanelMenu) menuIsiUlang;
    }
    
    public PanelKonfirmasi getKonfirmasiTarik() {
        return (PanelKonfirmasi) konfirmasiTarik;
    }
    
    public PanelKonfirmasi getKonfirmasiTransfer() {
        return (PanelKonfirmasi) konfirmasiTransfer;
    }
    
    public PanelInput getPanelInputId() {
        return (PanelInput) inputId;
    }
    
    public PanelKonfirmasi getKonfirmasiPembayaran() {
        return (PanelKonfirmasi) konfirmasiPembayaran;
    }
    
    public PanelInput getPanelInputNoHp() {
        return (PanelInput) inputNoHp;
    }
    
    public PanelMenu getMenuNominalIsiUlang() {
        return (PanelMenu) menuNominalIsiUlang;
    }
    
    public PanelKonfirmasi getKonfirmasiIsiUlang() {
        return (PanelKonfirmasi) konfirmasiIsiUlang;
    }
    
    public PanelInput getInputPinLama() {
        return (PanelInput) inputPinLama;
    }
    
    public PanelInput getInputPinBaru() {
        return (PanelInput) inputPinBaru;
    }
    
    public PanelInput getInputNoHp() {
        return (PanelInput) inputNoHp;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        panel_layar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_7 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ATM");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_layar.setBackground(new java.awt.Color(51, 51, 255));
        panel_layar.setPreferredSize(new java.awt.Dimension(500, 0));
        panel_layar.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_layar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_layar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button3(this);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button7(this);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button8(this);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        if (login.isVisible()) {
            this.dispose();
            main.show();
        }
        else if (menuAwal.isVisible()) {
            gantiPanel(login);
        }
        else if (menuLain.isVisible()) {
            gantiPanel(menuAwal);
        }
        else if(menuPembayaran.isVisible() || menuIsiUlang.isVisible())
            gantiPanel(menuLain);
        else if (tarik.isVisible()) {
            gantiPanel(menuAwal);
        }
        else if (konfirmasiTarik.isVisible()) {
            gantiPanel(menuAwal);
        }
        else if (info.isVisible()) {
            gantiPanel(menuAwal);
        }
        else
            gantiPanel(menuAwal);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button6(this);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button5(this);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button1(this);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        ATMController.getInstance().button2(this);
    }//GEN-LAST:event_btn_2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_layar;
    // End of variables declaration//GEN-END:variables

}
