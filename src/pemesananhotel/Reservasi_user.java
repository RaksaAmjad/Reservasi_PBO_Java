/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananhotel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Reservasi_user extends javax.swing.JFrame {

    /**
     * Creates new form Reservasi_user
     */
    public Reservasi_user() {
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

        txt_nama = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        txt_no = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        jk_ComboBox = new javax.swing.JComboBox<>();
        alamat1 = new javax.swing.JLabel();
        jkamar_ComboBox = new javax.swing.JComboBox<>();
        alamat2 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        alamat3 = new javax.swing.JLabel();
        txt_tarif = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 261, -1));

        id.setText("No Pemesanan");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        nama.setText("Nama");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txt_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noActionPerformed(evt);
            }
        });
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 261, -1));

        jLabel1.setText("Reservasi Kamar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        alamat.setText("Jenis Kelamin");
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jk_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jk_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jk_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jk_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 261, -1));

        alamat1.setText("Jenis Kamar");
        getContentPane().add(alamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jkamar_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Deluxe", "Suite", "Resident" }));
        jkamar_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkamar_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jkamar_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 261, -1));

        alamat2.setText("Alamat");
        getContentPane().add(alamat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 261, 46));

        alamat3.setText("Tarif");
        getContentPane().add(alamat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
        getContentPane().add(txt_tarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 261, -1));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemesananhotel/gambar/back.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 550, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemesananhotel/gambar/hotel2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noActionPerformed

    private void jk_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jk_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jk_ComboBoxActionPerformed

    private void jkamar_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkamar_ComboBoxActionPerformed
        // TODO add your handling code here:
        if(jkamar_ComboBox.getSelectedItem()=="Standard"){
            txt_tarif.setText("Rp 500.000");
        }
        if(jkamar_ComboBox.getSelectedItem()=="Deluxe"){
            txt_tarif.setText("Rp 750.000");
        }
        if(jkamar_ComboBox.getSelectedItem()=="Suite"){
            txt_tarif.setText("Rp 1.000.000");
        }
        if(jkamar_ComboBox.getSelectedItem()=="Resident"){
            txt_tarif.setText("Rp 2.000.000");
        }
    }//GEN-LAST:event_jkamar_ComboBoxActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            String sql ="insert into pemesanan values ('"+txt_no.getText()+"','"+txt_nama.getText()+"','"+jk_ComboBox.getSelectedItem()+"','"+txt_alamat.getText()+"','"+jkamar_ComboBox.getSelectedItem()+"','"+txt_tarif.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)pemesananhotel.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_no.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_tarif.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Reservasi_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservasi_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservasi_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservasi_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservasi_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel alamat1;
    private javax.swing.JLabel alamat2;
    private javax.swing.JLabel alamat3;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jk_ComboBox;
    private javax.swing.JComboBox<String> jkamar_ComboBox;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_tarif;
    // End of variables declaration//GEN-END:variables
}
