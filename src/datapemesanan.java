/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class datapemesanan extends javax.swing.JFrame {


   public datapemesanan(){
        initComponents();
        tampil();
         
        try {
            BufferedImage beam = ImageIO.read(getClass().getResource("kebun.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Data produk");
    }

    private void tampil(){
       DefaultTableModel model =  new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Produk");
    model.addColumn("Petani");
    model.addColumn("Tgl Panen");
    model.addColumn("Kategori");
    model.addColumn("Deskripsi");
    model.addColumn("Stok");
    try{
        
       String query = "select * from produk";
       java.sql.Connection kon = (Connection) koneksi.koneksi();
       java.sql.Statement stm = kon.createStatement();
       java.sql.ResultSet data = stm.executeQuery(query);
       while(data.next()){
        model.addRow(new Object []{data.getString(1),data.getString(2),data.getString(3),
        data.getString(4),data.getString(5),data.getString(6),data.getString(7)});
       }
       tblpinjam.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }  

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpinjam = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtsrc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblpinjam.setBackground(new java.awt.Color(255, 255, 153));
        tblpinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpinjam);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 800, 320));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jButton1.setText("Update & Dalate Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 150, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        txtsrc.setBackground(new java.awt.Color(255, 255, 153));
        txtsrc.setText("Search ID");
        txtsrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsrcMouseClicked(evt);
            }
        });
        txtsrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrcKeyReleased(evt);
            }
        });
        jPanel2.add(txtsrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setText("DAFTAR PRODUK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(847, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpinjamMouseClicked
 int baris = tblpinjam.getSelectedRow();
        String id= tblpinjam.getValueAt(baris, 0).toString();
      session.setid(id);
      new produk().setVisible(true);
       this.dispose(); 


    }//GEN-LAST:event_tblpinjamMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JOptionPane.showMessageDialog(null, "Harap Klik Table Untuk Merubah Data");
//        new inputpinjam().setVisible(true);
//        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new beranda().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        txtsrc.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtsrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrcKeyReleased
if(txtsrc.getText().equals("")){
 tampil();   
}
else{
        DefaultTableModel model =  new DefaultTableModel();
    model.addColumn("ID_Produk");
    model.addColumn("Produk");
    model.addColumn("petani");
    model.addColumn("Tgl Panen");
    model.addColumn("Kategori");
    model.addColumn("Deskripsi");
    model.addColumn("Stok");
    try{
        
       String query = "select * from produk where id_produk = '"+txtsrc.getText()+"'";
       java.sql.Connection kon = (Connection) koneksi.koneksi();
       java.sql.Statement stm = kon.createStatement();
       java.sql.ResultSet data = stm.executeQuery(query);
       while(data.next()){
        model.addRow(new Object []{data.getString(1),data.getString(2),data.getString(3),
        data.getString(4),data.getString(5),data.getString(6),data.getString(7)});
       }
       tblpinjam.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}

// TODO add your handling code here:
    }//GEN-LAST:event_txtsrcKeyReleased

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpinjam;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
