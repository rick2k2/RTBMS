/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RTBMS;
import Connection.MyConnection;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ricks
 */


public class A5_Addtrain_Portal extends javax.swing.JFrame {

    /**
     * Creates new form RailwayReservitionSystem
     */
    public A5_Addtrain_Portal() {
        initComponents();
        Train_Details_Load();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        tsp = new javax.swing.JTextField();
        tdp = new javax.swing.JTextField();
        tprice = new javax.swing.JTextField();
        thrs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainTables = new javax.swing.JTable();
        addtrain_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ADD TRAIN PROTAL");

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Train No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Train Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Start Place");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Destination Place");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Price");

        tno.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        tname.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        tsp.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        tdp.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        tprice.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        thrs.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(60, 60, 60))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(131, 131, 131)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(209, 209, 209)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thrs, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tdp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(thrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TrainTables.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TrainTables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Train no", "Train name", "start ", "Destination", "Price", "Time"
            }
        ));
        TrainTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainTablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TrainTables);

        addtrain_btn.setBackground(new java.awt.Color(0, 153, 102));
        addtrain_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addtrain_btn.setForeground(new java.awt.Color(255, 255, 255));
        addtrain_btn.setText("Add Train");
        addtrain_btn.setBorderPainted(false);
        addtrain_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtrain_btnActionPerformed(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(102, 0, 102));
        update_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Edit");
        update_btn.setBorderPainted(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(255, 51, 51));
        delete_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setBorderPainted(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(0, 0, 204));
        back_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("Back");
        back_btn.setBorderPainted(false);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        reset_btn.setBackground(new java.awt.Color(255, 51, 51));
        reset_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        reset_btn.setText("Reset");
        reset_btn.setBorderPainted(false);
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        exit_btn.setBackground(new java.awt.Color(255, 0, 51));
        exit_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setText("Exit");
        exit_btn.setBorderPainted(false);
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addtrain_btn)
                        .addGap(428, 428, 428)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_btn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit_btn)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn)
                    .addComponent(addtrain_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_btn)
                    .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

// global variable start
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
//global variable end
    
    
    // Table to load from db to jtable train_details_load methode
   public void Train_Details_Load()
    {
        try {
          pst = MyConnection.getConnection().prepareStatement("SELECT * FROM traindetails");
          rs = pst.executeQuery();
          
          ResultSetMetaData rsd =rs.getMetaData();
          int c;
          c = rsd.getColumnCount();
          DefaultTableModel d = (DefaultTableModel)TrainTables.getModel();
          d.setRowCount(0);
          
          while(rs.next())
          {
              Vector v = new Vector();
              for(int i=0;i<=c;i++)
              {
                  v.add(rs.getString("tno"));
                  v.add(rs.getString("tname"));
                  v.add(rs.getString("startplace"));
                  v.add(rs.getString("endplace"));
                  v.add(rs.getString("price"));
                  v.add(rs.getString("time"));
              }
              d.addRow(v);
          }
          
        } catch (SQLException ex) {
            Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
//    reset all field methode
    public void reset_all_field()
    {
            tno.setText("");
            tname.setText("");
            tsp.setText("");
            tdp.setText("");
            tprice.setText("");
            thrs.setText("");
            tno.requestFocus();
    } 
   
   
//   Add train button
    private void addtrain_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtrain_btnActionPerformed
        // TODO add your handling code here:
        String tnum = tno.getText();
        String tnam =tname.getText();
        String sp = tsp.getText();
        String ep = tdp.getText();
        String tp = tprice.getText();
        String th = thrs.getText();
        
        try {
            
            pst = MyConnection.getConnection().prepareStatement("INSERT INTO traindetails(tno,tname,startplace,endplace,price,time)VALUES(?,?,?,?,?,?)");
            pst.setString(1,tnum);
            pst.setString(2,tnam);
            pst.setString(3,sp);
            pst.setString(4,ep);
            pst.setString(5,tp);
            pst.setString(6,th);
            
            int k = pst.executeUpdate();

            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"New Train Added");
            }
            else{
                JOptionPane.showMessageDialog(this,"New Train Added Failed");
            }

//          reset all fields like default
            reset_all_field();
//          load table auto
            Train_Details_Load();
        }
        catch (SQLException ex) {
            Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addtrain_btnActionPerformed

 
//   edit buttom work
    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        String tnum = tno.getText();
        String tnam =tname.getText();
        String sp = tsp.getText();
        String ep = tdp.getText();
        String tp = tprice.getText();
        String th = thrs.getText();

        try {
            pst = MyConnection.getConnection().prepareStatement("UPDATE traindetails SET tname= ?,startplace= ?,endplace= ?,price= ?,time= ?  WHERE tno= ?");
            pst.setString(1,tnam);
            pst.setString(2,sp);
            pst.setString(3,ep);
            pst.setString(4,tp);
            pst.setString(5,th);
            pst.setString(6,tnum);
            int k = pst.executeUpdate();

            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Train Updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Train Updated Failed");
            }

           reset_all_field();
           
            //load table auto
            Train_Details_Load();
            //Now enable Add train button agaian
            addtrain_btn.setEnabled(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    
//    Delete Button work
    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        addtrain_btn.setEnabled(false);
        update_btn.setEnabled(false);

        String tnum = tno.getText();

        try {
            pst = MyConnection.getConnection().prepareStatement("DELETE FROM traindetails WHERE tno= ?");
            pst.setString(1,tnum);

            int k = pst.executeUpdate();

            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"OKAY! Train details Deleted");
            }
            else{
                JOptionPane.showMessageDialog(this,"Train details Delete Failed");
            }

            //load table auto methode
            Train_Details_Load();

            tno.setText("");
            tname.setText("");
            tsp.setText("");
            tdp.setText("");
            tprice.setText("");
            thrs.setText("");
            tno.requestFocus();
            
            addtrain_btn.setEnabled(true);
            update_btn.setEnabled(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_btnActionPerformed


//back button work
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.hide();
        new A4_Admin_Menu().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    
//    reset button work
    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
        tno.setText("");
        tname.setText("");
        tsp.setText("");
        tdp.setText("");
        tprice.setText("");
        thrs.setText("");
        tno.requestFocus();
//      Train_Details_Load();
        addtrain_btn.setEnabled(true);
        update_btn.setEnabled(true);
        delete_btn.setEnabled(true);

    }//GEN-LAST:event_reset_btnActionPerformed

//    exit button work
    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    
//    Load data from train_details table to jtextfield
    private void TrainTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainTablesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)TrainTables.getModel();
        int selectindex = TrainTables.getSelectedRow();
        tno.setText(d.getValueAt(selectindex, 0).toString());
        tname.setText(d.getValueAt(selectindex, 1).toString());
        tsp.setText(d.getValueAt(selectindex, 2).toString());
        tdp.setText(d.getValueAt(selectindex, 3).toString());
        tprice.setText(d.getValueAt(selectindex, 4).toString());
        thrs.setText(d.getValueAt(selectindex, 5).toString());
        
        
        //disable addtrain button when we click on jtable any row
        addtrain_btn.setEnabled(false);
    }//GEN-LAST:event_TrainTablesMouseClicked

  
//    Main function work here......
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
            java.util.logging.Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A5_Addtrain_Portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A5_Addtrain_Portal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TrainTables;
    private javax.swing.JButton addtrain_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset_btn;
    private javax.swing.JTextField tdp;
    private javax.swing.JTextField thrs;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tsp;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}