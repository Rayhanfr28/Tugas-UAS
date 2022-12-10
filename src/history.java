
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class history extends javax.swing.JFrame {


    public history()  {
        initComponents();
        tampil();
//        kosong();

        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("kebun.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Bukti Pemesanan");
    }
//private void kosong(){
//
//}    
private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Id Pelanggan");
        model.addColumn("Pelanggan");
        model.addColumn("Id_Produk");
        model.addColumn("Produk");
        model.addColumn("Jumlah Pesanan");

        try{
            String query = "select*from pemesanan";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);
            
            while(data.next()){
                model.addRow(new Object [] {data.getString(1),data.getString(2),
                data.getString(3),data.getString(4),data.getString(5),data.getString(6)
               });
            }
            tblpinjam.setModel(model);
        }
        catch(Exception b){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpinjam = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtsrc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 790, 243));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        txtsrc.setText("Search ID");
        txtsrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsrcMouseClicked(evt);
            }
        });
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        txtsrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrcKeyReleased(evt);
            }
        });
        jPanel1.add(txtsrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 110, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("HISTORY PEMESANAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 820, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrcKeyReleased
       if(txtsrc.getText().equals("")){
 tampil();   
}
else{      
       DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("id_pelanggan");
            model.addColumn("Nama");
            model.addColumn("Id_produk");
            model.addColumn("produk");
            model.addColumn("Jumlah");
    
    try{
        String query = "select * from pemesanan where id_pemesanan = '"+txtsrc.getText()+"'";
        java.sql.Connection kon = (Connection) koneksi.koneksi();
        java.sql.Statement stm = kon.createStatement();
        java.sql.ResultSet data = stm.executeQuery(query);
        
        while(data.next()){
           model.addRow(new Object[]{data.getString(1),data.getString(2)
                   ,data.getString(3),data.getString(4),data.getString(5),data.getString(6) });
        }
        tblpinjam.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}
        

//       // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcKeyReleased

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        txtsrc.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new beranda().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpinjamMouseClicked
       int dialogResult = JOptionPane.showConfirmDialog
        (null, "Delete Data Yang Dipilih?","",YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){
            int baris = tblpinjam.getSelectedRow();
            String id= tblpinjam.getValueAt(baris, 0).toString();
            String id_buku = tblpinjam.getValueAt(baris, 3).toString();

            try {
                String sql ="delete from pinjaman where id_pinjam = '"+id+"'";
                java.sql.Connection conn=(Connection)koneksi.koneksi();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
            }

            String status= tblpinjam.getValueAt(baris, 9).toString();
            if(status.equals("Sudah Kembali"))
            {
                tampil();
            }
            else{
                try{
                    String query1 = "select*from produk where id_produk = '"+id_buku+"'";
                    java.sql.Connection kon1 = (Connection) koneksi.koneksi();
                    java.sql.Statement st = kon1.createStatement();
                    java.sql.ResultSet data1 = st.executeQuery(query1);

                    while(data1.next()){
                        String jmlh= tblpinjam.getValueAt(baris, 5).toString();
                        int jumlah= Integer.parseInt(data1.getString(7));
                        int jumlahpinjam = Integer.parseInt(jmlh);
                        int total = jumlah+jumlahpinjam;
                        try {
                            String sql1 ="UPDATE produk SET stok = '"+total
                            +"' WHERE id_produk = '"+id_buku+"'";
                            java.sql.Connection conn1=(Connection)koneksi.koneksi();
                            java.sql.PreparedStatement pst=conn1.prepareStatement(sql1);
                            pst.execute();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
                        }

                    }
                }catch(Exception b){
                    JOptionPane.showMessageDialog(null, b.getMessage());
                }
            }

            tampil();
        }
        else if(dialogResult == JOptionPane.NO_OPTION){
            tampil();

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_tblpinjamMouseClicked

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpinjam;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
