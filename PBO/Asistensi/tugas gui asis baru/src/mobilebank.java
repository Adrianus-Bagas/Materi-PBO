/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class mobilebank extends javax.swing.JFrame {

    /**
     * Creates new form mobilebank
     */
    public mobilebank() {
        initComponents();
    }
    private long harga;
    public long getHarga(){
        return harga;
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        awalan = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        transfer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rekening = new javax.swing.JTextField();
        jumlahtransfer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pulsa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telepon = new javax.swing.JTextField();
        jumlahpulsa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pln = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nomormeter = new javax.swing.JTextField();
        jumlahpln = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(400, 379));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        saldo.setText("5000000");

        jLabel6.setText("Rp");

        jLabel14.setText("878185387597");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldo)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldo)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 100);

        awalan.setBackground(new java.awt.Color(255, 255, 51));
        awalan.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(255, 255, 0));
        menu.setMinimumSize(new java.awt.Dimension(400, 379));

        jLabel23.setText("Info");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel5.setText("Transfer");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setText("Pulsa");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setText("Keluar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setText("Token Listrik");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel23))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        awalan.add(menu, "card7");

        info.setBackground(new java.awt.Color(255, 255, 0));

        jLabel10.setText("Nama Lengkap");

        jLabel11.setText("Alamat");

        jLabel12.setText("TTL");

        jLabel13.setText("Email");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jButton7.setText("Kembali");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(72, 72, 72)
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton7)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(32, 32, 32)
                .addComponent(jButton7)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        awalan.add(info, "card3");

        transfer.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setText("No. Rekening Tujuan");

        jLabel2.setText("Nominal");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Lanjut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jButton3))
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rekening, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahtransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahtransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        awalan.add(transfer, "card4");

        pulsa.setBackground(new java.awt.Color(255, 255, 0));

        jLabel3.setText("Nomor Telepon");

        jLabel4.setText("Nominal");

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Lanjut");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pulsaLayout = new javax.swing.GroupLayout(pulsa);
        pulsa.setLayout(pulsaLayout);
        pulsaLayout.setHorizontalGroup(
            pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pulsaLayout.createSequentialGroup()
                .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pulsaLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pulsaLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pulsaLayout.setVerticalGroup(
            pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pulsaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jumlahpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        awalan.add(pulsa, "card5");

        pln.setBackground(new java.awt.Color(255, 255, 0));

        jLabel19.setText("ID Pelanggan");

        jLabel20.setText("Nominal");

        jButton5.setText("Lanjut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Kembali");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plnLayout = new javax.swing.GroupLayout(pln);
        pln.setLayout(plnLayout);
        plnLayout.setHorizontalGroup(
            plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plnLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(56, 56, 56)
                        .addComponent(jButton6))
                    .addGroup(plnLayout.createSequentialGroup()
                        .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahpln, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomormeter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        plnLayout.setVerticalGroup(
            plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nomormeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jumlahpln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(plnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        awalan.add(pln, "card6");

        getContentPane().add(awalan);
        awalan.setBounds(0, 106, 400, 379);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        awalan.removeAll();
        awalan.add(info);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        awalan.removeAll();
        awalan.add(transfer);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        awalan.removeAll();
        awalan.add(pulsa);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        awalan.removeAll();
        awalan.add(pln);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{ 
            if("".equals(rekening.getText())||"".equals(jumlahtransfer.getText())){
            JOptionPane.showMessageDialog(null,"Semua data harus diisi","Error",JOptionPane.ERROR_MESSAGE);
        } else { 
            if(rekening.getText().length()!=12){
                JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                        "Error",JOptionPane.ERROR_MESSAGE);
                rekening.setText("");
                jumlahtransfer.setText("");
            } else if("878185387597".equals(rekening.getText())){
                JOptionPane.showMessageDialog(null,"Tidak bisa transfer ke rekening sendiri",
                        "Error",JOptionPane.ERROR_MESSAGE);
                rekening.setText("");
            }else{  
                 String s=Long.toString(Long.parseLong(rekening.getText()));
                 
                 Database data=new Database();
                 
                 data.setRekening(rekening.getText());
                 data.setHarga(Long.parseLong(jumlahtransfer.getText()));
                 
                 transfersukses ts=new transfersukses();
                 
                 if(saldotransfer()<0){
                     JOptionPane.showMessageDialog(null,"Saldo tidak cukup",
                             "Error",JOptionPane.ERROR_MESSAGE);
                     jumlahtransfer.setText("");
                     throw new HeadlessException();
                 }
                 
                 ts.saldo(saldotransfer());
                 ts.setHarga(data.getHarga());
                 ts.setRekening(data.getRekening());
                 
                 ts.setVisible(true);
                 dispose();
            }
            
        } 
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                    "Error",JOptionPane.ERROR_MESSAGE);
            rekening.setText("");
            jumlahtransfer.setText("");
        }
        catch (HeadlessException e){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{
             String a=Long.toString(Long.parseLong(telepon.getText()));
    
            if("".equals(telepon.getText())||"".equals(jumlahpulsa.getText())){
            JOptionPane.showMessageDialog(null,"Semua data harus diisi","Error",JOptionPane.ERROR_MESSAGE);
        } else { 
            if(telepon.getText().length()!=12){
                JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                        "Error",JOptionPane.ERROR_MESSAGE);
                telepon.setText("");
                jumlahpulsa.setText("");
            } else {
              
                 Database data=new Database();
                 
                 data.setTelepon(telepon.getText());
                 data.setHarga(Long.parseLong(jumlahpulsa.getText()));
                 
                 pulsasukses pls=new pulsasukses();
                 
                 if(saldopulsa()<0){
                     JOptionPane.showMessageDialog(null,"Saldo tidak cukup",
                             "Error",JOptionPane.ERROR_MESSAGE);
                     jumlahpulsa.setText("");
                     throw new HeadlessException();
                 }
                 
                 pls.saldo(saldopulsa());
                 pls.setHarga(data.getHarga());
                 pls.setTelepon(data.getTelepon());
                 
                 pls.setVisible(true);
                 dispose();
            }
            
        }
         } catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                     "Error",JOptionPane.ERROR_MESSAGE);
         }

        catch (HeadlessException e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try{
             String a=Long.toString(Long.parseLong(telepon.getText()));
    
            if("".equals(nomormeter.getText())||"".equals(jumlahpln.getText())){
            JOptionPane.showMessageDialog(null,"Semua data harus diisi","Error",JOptionPane.ERROR_MESSAGE);
        } else { 
            if(nomormeter.getText().length()!=11){
                JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                        "Error",JOptionPane.ERROR_MESSAGE);
                nomormeter.setText("");
                jumlahpln.setText("");
            } else {
              
                 Database data=new Database();
                 
                 data.setNomormeter(nomormeter.getText());
                 data.setHarga(Long.parseLong(jumlahpln.getText()));
                 
                 plnsukses pl=new plnsukses();
                 
                 if(saldopln()<0){
                     JOptionPane.showMessageDialog(null,"Saldo tidak cukup",
                             "Error",JOptionPane.ERROR_MESSAGE);
                     jumlahpln.setText("");
                     throw new HeadlessException();
                 }
                 
                 pl.saldo(saldopln());
                 pl.setHarga(data.getHarga());
                 pl.setNomormeter(data.getNomormeter());
                 
                 pl.setVisible(true);
                 dispose();
            }
            
        }
         } catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Masukkan data dengan benar",
                     "Error",JOptionPane.ERROR_MESSAGE);
         }

        catch (HeadlessException e){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        awalan.removeAll();
        awalan.add(menu);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        awalan.removeAll();
        awalan.add(menu);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        awalan.removeAll();
        awalan.add(menu);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        awalan.removeAll();
        awalan.add(menu);
        awalan.repaint();
        awalan.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed
  public long saldopln() {
        long saldoawal = Long.parseLong(saldo.getText());
        long saldoakhir = saldoawal - Long.parseLong(jumlahpln.getText());
        return saldoakhir;
   }
  public long saldopulsa() {
        long saldoawal = Long.parseLong(saldo.getText());
        long saldoakhir = saldoawal - Long.parseLong(jumlahpulsa.getText());
        return saldoakhir;
   }
  public long saldotransfer() {
        long saldoawal = Long.parseLong(saldo.getText());
        long saldoakhir = saldoawal - Long.parseLong(jumlahtransfer.getText());
        return saldoakhir;
   }
    public void saldoakhir(String saldodo) {
        saldo.setText(saldodo);
    }
    public void saldo(long sisasaldoku) {
        saldo.setText(String.valueOf(sisasaldoku));
    }
    public long Sisasaldo() {
        long saldoawal = Long.parseLong(saldo.getText());
        long saldoakhir = saldoawal - getHarga();
        return saldoakhir;
   }
    public long sisaSaldo() {
        long saldoawal = Long.parseLong(saldo.getText());
        long saldoakhir = saldoawal - getHarga();
        return saldoakhir;
   }
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
            java.util.logging.Logger.getLogger(mobilebank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mobilebank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mobilebank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mobilebank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mobilebank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel awalan;
    private javax.swing.JPanel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlahpln;
    private javax.swing.JTextField jumlahpulsa;
    private javax.swing.JTextField jumlahtransfer;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nomormeter;
    private javax.swing.JPanel pln;
    private javax.swing.JPanel pulsa;
    private javax.swing.JTextField rekening;
    private javax.swing.JLabel saldo;
    private javax.swing.JTextField telepon;
    private javax.swing.JPanel transfer;
    // End of variables declaration//GEN-END:variables
}
