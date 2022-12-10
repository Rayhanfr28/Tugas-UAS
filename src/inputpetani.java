
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class inputpetani extends javax.swing.JFrame {

    public inputpetani(){
        initComponents();
//        setcombo();
        
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("kebun.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Pelanggan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txthp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtal = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        lblid.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txthp.setText("no  hp");
        txthp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthpMouseClicked(evt);
            }
        });
        txthp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthpActionPerformed(evt);
            }
        });
        txthp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthpKeyReleased(evt);
            }
        });
        jPanel1.add(txthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 515, 46));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 80, 38));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 80, 40));

        txtnama.setText("Nama Pelanggan");
        txtnama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnamaMouseClicked(evt);
            }
        });
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 515, 46));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel3.setText("Data Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 26, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 296, -1, -1));

        txtal.setText("Alamat");
        txtal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtalMouseClicked(evt);
            }
        });
        txtal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalActionPerformed(evt);
            }
        });
        txtal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtalKeyReleased(evt);
            }
        });
        jPanel1.add(txtal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 515, 46));

        txtid.setText("Id pelanggan");
        txtid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidMouseClicked(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 515, 46));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4. kebun.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthpActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txthpActionPerformed

    private void txthpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthpMouseClicked
txthp.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txthpMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String npm = txtid.getText();
    String nama = txtnama.getText();
    String nohp = txthp.getText();
    String al = txtal.getText();
    if(npm.equals("")||nama.equals("")||nohp.equals("")||al.equals("")){
            JOptionPane.showMessageDialog(null,"Isi Semua Form Yang Tersedia ");
        
    }
        else{
        try {
            String sql1 = "INSERT INTO pelanggan"
                    + " VALUES ('"+txtid.getText()+"','" 
                    + txtnama.getText() + "','" 
                    + txthp.getText() + "','" 
                    + txtal.getText() + "')";
//                    + cmbfakultas.getSelectedItem()+ "','" 
//                    + cmbprodi.getSelectedItem() + "')";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pdt = kon.prepareStatement(sql1);
            pdt.execute();
           JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        new datapetani().setVisible(true);
        dispose();
        } catch (Exception b) {
            JOptionPane.showMessageDialog(this, b.getMessage());
        }   
  
    }
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnamaMouseClicked
txtnama.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaMouseClicked

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txthpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txthpKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new datapetani().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalMouseClicked

    private void txtalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalActionPerformed

    private void txtalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalKeyReleased

    private void txtidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyReleased

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtal;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
