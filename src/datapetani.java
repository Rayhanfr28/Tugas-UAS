
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class datapetani extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public datapetani(){
        initComponents();
    loadtable();
   
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("kebun.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Data Pelanggan");
    }
    
    //methot, objek, prperti
private void loadtable(){
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Pemesan");
    model.addColumn("No Handphone");
    model.addColumn("Alamat");
    
    try{
        String query = "select * from pelanggan";
        java.sql.Connection kon = (Connection) koneksi.koneksi();
        java.sql.Statement stm = kon.createStatement();
        java.sql.ResultSet data = stm.executeQuery(query);
        //properties
        while(data.next()){
           model.addRow(new Object[]{data.getString(1),data.getString(2)
                   ,data.getString(3),data.getString(4) });
        }
        tblmhs.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmhs = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtsrc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("DATA PELANGGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 585, -1));

        tblmhs.setBackground(new java.awt.Color(255, 255, 153));
        tblmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmhs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 549, 242));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("Input Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, 35));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        txtsrc.setBackground(new java.awt.Color(255, 255, 153));
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
        jPanel1.add(txtsrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4. kebun.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new inputpetani().setVisible(true);
dispose();
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
 loadtable();   
}
else{      
       DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Pemesan");
    model.addColumn("No Handphone");
    model.addColumn("Alamat");
    
    try{
        String query = "select * from pelanggan where id_pelanggan = '"+txtsrc.getText()+"'";
        java.sql.Connection kon = (Connection) koneksi.koneksi();
        java.sql.Statement stm = kon.createStatement();
        java.sql.ResultSet data = stm.executeQuery(query);
        
        while(data.next()){
           model.addRow(new Object[]{data.getString(1),data.getString(2)
                   ,data.getString(3),data.getString(4) });
        }
        tblmhs.setModel(model);
    }
    catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcKeyReleased

    private void tblmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmhsMouseClicked

    }//GEN-LAST:event_tblmhsMouseClicked

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmhs;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
