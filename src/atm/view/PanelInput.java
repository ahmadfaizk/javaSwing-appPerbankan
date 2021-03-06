/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.view;

import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class PanelInput extends javax.swing.JPanel {

    /**
     * Creates new form PanelLogin
     */
    public PanelInput() {
        initComponents();
        judul_1.setText("");
        judul_2.setText("");
        clear();
    }

    public JTextField getInput() {
        return input;
    }
    
    public void setJudul1(String text) {
        judul_1.setText(text);
    }
    
    public void setJudul2(String text) {
        judul_2.setText(text);
    }
    
    public void setNotifikasi(String text) {
        notifikasi.setText(text);
    }
    
    public void clear() {
        input.setText("");
        notifikasi.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul_1 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        notifikasi = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        judul_2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 255));

        judul_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judul_1.setForeground(new java.awt.Color(255, 255, 0));
        judul_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul_1.setText("Judul 1");

        label8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 0));
        label8.setText("Salah -->");

        label7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 0));
        label7.setText("Benar -->");

        label4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 0));
        label4.setText("<-- Kembali");

        notifikasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notifikasi.setForeground(new java.awt.Color(255, 255, 0));
        notifikasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notifikasi.setText("Notifikasi");

        input.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        judul_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judul_2.setForeground(new java.awt.Color(255, 255, 0));
        judul_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul_2.setText("Judul 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judul_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label8))
                    .addComponent(notifikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(judul_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(label7)
                .addGap(46, 46, 46)
                .addComponent(notifikasi)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8)
                    .addComponent(label4))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(judul_2)
                    .addContainerGap(414, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JLabel judul_1;
    private javax.swing.JLabel judul_2;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel notifikasi;
    // End of variables declaration//GEN-END:variables
}
