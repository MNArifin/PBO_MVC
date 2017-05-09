/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import control.cKoneksi; 
import control.cToko; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import model.mToko;
/**
 *
 * @author MNArifin
 */
public class home extends javax.swing.JFrame {

    String nol_jam, nol_menit, nol_detik;
    cToko ctoko;
    List<mToko>listdata = new ArrayList<>();
    
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new cToko (this);
        ctoko.isiTable();
        String user = null;
        tadmin.setText(user);
        setTanggal();
        setJam();
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
        jLabel1 = new javax.swing.JLabel();
        tadmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tharga = new javax.swing.JLabel();
        tkode = new javax.swing.JLabel();
        tnama = new javax.swing.JLabel();
        cbkategoribrg = new javax.swing.JLabel();
        cbjenispack = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbkategori = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbcarikategori = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Admin Toko :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 30);

        tadmin.setEditable(false);
        jPanel1.add(tadmin);
        tadmin.setBounds(100, 10, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data Barang di Toko");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 20, 220, 30);

        hasil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(hasil);
        hasil.setBounds(590, 30, 100, 30);

        tgl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(tgl);
        tgl.setBounds(590, 10, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 70);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        tharga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tharga.setText("Harga");
        jPanel2.add(tharga);
        tharga.setBounds(20, 170, 120, 30);

        tkode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tkode.setText("Kode Barang");
        jPanel2.add(tkode);
        tkode.setBounds(20, 10, 120, 30);

        tnama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tnama.setText("Nama Barang");
        jPanel2.add(tnama);
        tnama.setBounds(20, 50, 120, 30);

        cbkategoribrg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbkategoribrg.setText("Kategori Barang");
        jPanel2.add(cbkategoribrg);
        cbkategoribrg.setBounds(20, 90, 120, 30);

        cbjenispack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbjenispack.setText("Jenis Packaging");
        jPanel2.add(cbjenispack);
        cbjenispack.setBounds(20, 130, 120, 30);
        jPanel2.add(txtkode);
        txtkode.setBounds(180, 10, 260, 30);
        jPanel2.add(txtnama);
        txtnama.setBounds(180, 50, 260, 30);

        cbkategori.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Barang Lain" }));
        cbkategori.setToolTipText("");
        jPanel2.add(cbkategori);
        cbkategori.setBounds(180, 90, 260, 30);

        cbjenis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Pieces" }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(180, 130, 260, 30);
        jPanel2.add(txtharga);
        txtharga.setBounds(180, 170, 260, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 500, 210);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        btnsave.setBackground(new java.awt.Color(153, 153, 255));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(null);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave);
        btnsave.setBounds(30, 10, 110, 30);

        btnedit.setBackground(new java.awt.Color(153, 153, 255));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnedit.setText("Edit");
        btnedit.setBorder(null);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel3.add(btnedit);
        btnedit.setBounds(30, 50, 110, 30);

        btnclear.setBackground(new java.awt.Color(153, 153, 255));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setBorder(null);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel3.add(btnclear);
        btnclear.setBounds(30, 90, 110, 30);

        btndel.setBackground(new java.awt.Color(153, 153, 255));
        btndel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndel.setText("Delete");
        btndel.setBorder(null);
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel3.add(btndel);
        btndel.setBounds(30, 130, 110, 30);

        btnexit.setBackground(new java.awt.Color(153, 153, 255));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(null);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel3.add(btnexit);
        btnexit.setBounds(30, 170, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(520, 80, 160, 210);

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setLayout(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(50, 10, 550, 130);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 360, 670, 150);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        jLabel8.setText("Cari Berdasarkan Kategori Barang");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(20, 10, 210, 30);

        cbcarikategori.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        cbcarikategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Barang Lain" }));
        jPanel5.add(cbcarikategori);
        cbcarikategori.setBounds(260, 10, 120, 30);

        btnsearch.setBackground(new java.awt.Color(153, 153, 153));
        btnsearch.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnsearch);
        btnsearch.setBounds(420, 10, 80, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 300, 670, 50);

        setBounds(0, 0, 703, 549);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
       ctoko.SimpanData();
       ctoko.isiTable();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_btndelActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String user1 = login.user;
        tadmin.setText(user1);
    }//GEN-LAST:event_formWindowOpened

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int baris = table1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(table1.getValueAt(baris, 0).toString());
            txtnama.setText((String) table1.getValueAt(baris, 1));
            cbkategori.setSelectedItem(table1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(table1.getValueAt(baris, 3).toString());
            txtharga.setText(table1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    
    public JTextField getTxtKode(){
        return txtkode;
    }
    
    public JTextField getTxtNama(){
        return txtnama;
    }
    
    public JTextField getTxtHarga(){
        return txtharga;
    }
    
    public JComboBox getCbKategori(){
        return cbkategori;
    }
    
    public JComboBox getCbJenis(){
        return cbjenis;
    }
    public JComboBox getCbCariKategori(){
        return cbcarikategori;
    }
    
    public JButton getButtonHapus(){
        return btndel;
    }
    public JButton getButtonSimpan(){
        return btnsave;
    }
    public JButton getButtonUbah(){
        return btnedit;
    }
    
    public JButton getButtonKeluar(){
        return btnexit;
    }
    public JTable getTableData(){
        return table1;
    }
    

    private void setTanggal() {
       java.util.Date skrg = new java.util.Date();
       java.text.SimpleDateFormat kal = new
       java.text.SimpleDateFormat("dd/MM/yyyy");
       tgl.setText(kal.format(skrg));
    }

    private void setJam() {
        ActionListener taskPerformer = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                
                
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                
                if (nilai_jam<=9){
                    nol_jam = "0";
                } if (nilai_menit <= 9) {
                    nol_menit = "0";
                } if (nilai_detik <= 9){
                    nol_detik = "0";
                }
               
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                hasil.setText(jam+":"+menit+":"+detik);
            }
        } ;
    new Timer(100, taskPerformer).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbcarikategori;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel cbjenispack;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JLabel cbkategoribrg;
    private javax.swing.JLabel hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tadmin;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel tharga;
    private javax.swing.JLabel tkode;
    private javax.swing.JLabel tnama;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

}