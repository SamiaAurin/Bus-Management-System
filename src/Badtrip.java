/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Badtrip extends javax.swing.JFrame {

    /**
     * Creates new form TripPage
     */
    public Connection con;
    PreparedStatement pst;

    String currentuser;

    public Badtrip(String currentuser) {
        initComponents();
        this.currentuser = currentuser;
        try {
            /*con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "swarnali");*/
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        showTripTable();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }

    public Badtrip() {
        initComponents();

        try {
            /*con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "swarnali");*/
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }

        showTripTable();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);

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
        jButtonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTrip = new javax.swing.JTable();
        jButtonBacktoHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldBusNoAdd = new javax.swing.JTextField();
        jTextFieldDateAdd = new javax.swing.JTextField();
        jTextFieldDriveridAdd = new javax.swing.JTextField();
        jTextFieldRouteNoAdd = new javax.swing.JTextField();
        jTextFieldBookedSeatsAdd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldAvailableSeatsAdd = new javax.swing.JTextField();
        jTextFieldStartingTimeAdd = new javax.swing.JTextField();
        jButtonBackAdd = new javax.swing.JButton();
        jButtonAddtotable = new javax.swing.JButton();
        jTextFieldTKpertripAdd = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTripid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTKpertrip = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldDriverid = new javax.swing.JTextField();
        jTextFieldRouteNo = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldBookedSeats = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldBusNo = new javax.swing.JTextField();
        jTextFieldAvailableSeats = new javax.swing.JTextField();
        jTextFieldStartingTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(970, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(968, 431));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdd.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jTableTrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TripID", "RouteNo", "BusNo", "DriverID", "Date", "SalaryPerTrip", "Available Seats", "Booked Seats", "Starting Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTrip.setPreferredSize(new java.awt.Dimension(968, 500));
        jTableTrip.getTableHeader().setReorderingAllowed(false);
        jTableTrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTripMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTrip);
        if (jTableTrip.getColumnModel().getColumnCount() > 0) {
            jTableTrip.getColumnModel().getColumn(0).setResizable(false);
            jTableTrip.getColumnModel().getColumn(1).setResizable(false);
            jTableTrip.getColumnModel().getColumn(2).setResizable(false);
            jTableTrip.getColumnModel().getColumn(3).setResizable(false);
            jTableTrip.getColumnModel().getColumn(5).setResizable(false);
            jTableTrip.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 340));

        jButtonBacktoHome.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonBacktoHome.setText("Back");
        jButtonBacktoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBacktoHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBacktoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(968, 431));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Route No");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 110, 30));

        jLabel6.setText("Salary per Trip");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, 30));

        jLabel12.setText("Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, 30));

        jLabel13.setText("Driver ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, 30));

        jLabel14.setText("Bus No");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, 30));
        jPanel2.add(jTextFieldBusNoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 30));
        jPanel2.add(jTextFieldDateAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 220, 30));
        jPanel2.add(jTextFieldDriveridAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 220, 30));
        jPanel2.add(jTextFieldRouteNoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 30));
        jPanel2.add(jTextFieldBookedSeatsAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 220, 30));

        jLabel19.setText("Availble Seats");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 30));

        jLabel20.setText("Starting Time");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 110, 30));

        jLabel21.setText("Booked Seats");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 30));
        jPanel2.add(jTextFieldAvailableSeatsAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 220, 30));
        jPanel2.add(jTextFieldStartingTimeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 220, 30));

        jButtonBackAdd.setText("Back");
        jButtonBackAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackAddActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBackAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        jButtonAddtotable.setText("Save");
        jButtonAddtotable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddtotableActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAddtotable, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));
        jPanel2.add(jTextFieldTKpertripAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 220, 30));

        jPanel3.setAlignmentY(30.0F);
        jPanel3.setMinimumSize(new java.awt.Dimension(970, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(968, 431));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Trip ID");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 30));
        jPanel3.add(jLabelTripid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 220, 30));

        jLabel3.setText("Route No");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 110, 30));

        jLabel4.setText("Salary Per Trip");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, 30));

        jLabel9.setText("Date");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, 30));

        jLabel10.setText("Driver ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));
        jPanel3.add(jTextFieldTKpertrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 220, -1));
        jPanel3.add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 220, 30));
        jPanel3.add(jTextFieldDriverid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 220, 30));
        jPanel3.add(jTextFieldRouteNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 30));

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 80, -1));

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));
        jPanel3.add(jTextFieldBookedSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 220, 30));

        jLabel15.setText("Bus No");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, 30));

        jLabel16.setText("Availble Seats");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 30));

        jLabel17.setText("Starting Time");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 110, 30));

        jLabel18.setText("Booked Seats");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 30));
        jPanel3.add(jTextFieldBusNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 30));
        jPanel3.add(jTextFieldAvailableSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 220, 30));
        jPanel3.add(jTextFieldStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 122, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 127, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:

        jPanel1.setVisible(false);
        jPanel2.setVisible(true);


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTableTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTripMouseClicked
        // TODO add your handling code here:

        DefaultTableModel t = (DefaultTableModel) jTableTrip.getModel();
        int SelectIndex = jTableTrip.getSelectedRow();

        //JOptionPane.showMessageDialog(this, SelectIndex);  
        try {
            String TripID = t.getValueAt(SelectIndex, 0).toString();
            String TKperTrip = t.getValueAt(SelectIndex, 5).toString();
            String Date = t.getValueAt(SelectIndex, 4).toString();
            String DriverID = t.getValueAt(SelectIndex, 3).toString();
            String RoutetNO = t.getValueAt(SelectIndex, 1).toString();
            String BusNO = t.getValueAt(SelectIndex, 2).toString();
            String AvailableSeats = t.getValueAt(SelectIndex, 6).toString();
            String BookedSeats = t.getValueAt(SelectIndex, 7).toString();
            String StartingTime = t.getValueAt(SelectIndex, 8).toString();

            jPanel1.setVisible(false);
            jPanel3.setVisible(true);

            jLabelTripid.setText(TripID);
            jTextFieldTKpertrip.setText(TKperTrip);
            jTextFieldDate.setText(Date);
            jTextFieldDriverid.setText(DriverID);
            jTextFieldRouteNo.setText(RoutetNO);
            jTextFieldBusNo.setText(BusNO);
            jTextFieldAvailableSeats.setText(AvailableSeats);
            jTextFieldBookedSeats.setText(AvailableSeats);
            jTextFieldStartingTime.setText(StartingTime);

        } catch (ArrayIndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No row selected");

        }


    }//GEN-LAST:event_jTableTripMouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);

        jLabelTripid.setEnabled(true);
        jTextFieldTKpertrip.setEnabled(true);
        jTextFieldDate.setEnabled(true);
        jTextFieldDriverid.setEnabled(true);
        jTextFieldRouteNo.setEnabled(true);
        jTextFieldBusNo.setEnabled(true);
        jTextFieldAvailableSeats.setEnabled(true);
        jTextFieldBookedSeats.setEnabled(true);
        jTextFieldStartingTime.setEnabled(true);

        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);


    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTableTrip.getModel();
        int SelectIndex = jTableTrip.getSelectedRow();

        String tripid = t.getValueAt(SelectIndex, 0).toString();

        try {
            pst = con.prepareStatement("delete from Trip where TripID=?");

            pst.setString(1, tripid);
            int x = pst.executeUpdate();

            if (x == 1) {
                jLabelTripid.setText("");
                jTextFieldTKpertrip.setText("");
                jTextFieldDate.setText("");
                jTextFieldDriverid.setText("");
                jTextFieldRouteNo.setText("");
                jTextFieldBusNo.setText("");
                jTextFieldAvailableSeats.setText("");
                jTextFieldBookedSeats.setText("");
                jTextFieldStartingTime.setText("");

                jLabelTripid.setEnabled(false);
                jTextFieldTKpertrip.setEnabled(false);
                jTextFieldDate.setEnabled(false);
                jTextFieldDriverid.setEnabled(false);
                jTextFieldRouteNo.setEnabled(false);
                jTextFieldBusNo.setEnabled(false);
                jTextFieldAvailableSeats.setEnabled(false);
                jTextFieldBookedSeats.setEnabled(false);
                jTextFieldStartingTime.setEnabled(false);

                jButtonUpdate.setEnabled(false);
                jButtonDelete.setEnabled(false);

                jTextFieldTKpertrip.requestFocus();

                showTripTable();

                JOptionPane.showMessageDialog(this, "Record deleted");

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Badtrip.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel t = (DefaultTableModel) jTableTrip.getModel();
        int SelectIndex = jTableTrip.getSelectedRow();

        String tripid = t.getValueAt(SelectIndex, 0).toString();

        int TripID = Integer.parseInt(jLabelTripid.getText());
        int TKperTrip = Integer.parseInt(jTextFieldTKpertrip.getText());
        String Date = jTextFieldDate.getText();
        int DriverID = Integer.parseInt(jTextFieldDriverid.getText());
        int RoutetNO = Integer.parseInt(jTextFieldRouteNo.getText());
        int BusNO = Integer.parseInt(jTextFieldBusNo.getText());
        int AvailableSeats = Integer.parseInt(jTextFieldAvailableSeats.getText());
        int BookedSeats = Integer.parseInt(jTextFieldBookedSeats.getText());
        String StartingTime = jTextFieldStartingTime.getText();

        //System.out.println(BusNO);
        try {
            pst = con.prepareStatement("update Trip set SalaryperTrip=?,Date=?, DriverID=?,RouteNo=?, BusNo=?,AvailableSeats=?, BookedSeats=?,StartingTime=? where TripID=?");
            pst.setInt(1, TKperTrip);
            pst.setString(2, Date);
            pst.setInt(3, DriverID);
            pst.setInt(4, RoutetNO);
            pst.setInt(5, BusNO);
            pst.setInt(6, AvailableSeats);
            pst.setInt(7, BookedSeats);
            pst.setString(8, StartingTime);

            pst.setInt(9, TripID);
            int x = pst.executeUpdate();

            if (x == 1) {
                jLabelTripid.setText("");
                jTextFieldTKpertrip.setText("");
                jTextFieldDate.setText("");
                jTextFieldDriverid.setText("");
                jTextFieldRouteNo.setText("");
                jTextFieldBusNo.setText("");
                jTextFieldAvailableSeats.setText("");
                jTextFieldBookedSeats.setText("");
                jTextFieldStartingTime.setText("");

                jLabelTripid.setEnabled(false);
                jTextFieldTKpertrip.setEnabled(false);
                jTextFieldDate.setEnabled(false);
                jTextFieldDriverid.setEnabled(false);
                jTextFieldRouteNo.setEnabled(false);
                jTextFieldBusNo.setEnabled(false);
                jTextFieldAvailableSeats.setEnabled(false);
                jTextFieldBookedSeats.setEnabled(false);
                jTextFieldStartingTime.setEnabled(false);

                jButtonUpdate.setEnabled(false);
                jButtonDelete.setEnabled(false);

                jTextFieldTKpertrip.requestFocus();

                showTripTable();

                JOptionPane.showMessageDialog(this, "Record updated");

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Badtrip.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonAddtotableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddtotableActionPerformed
        // TODO add your handling code here:

        //String TripID=jTextFieldTripIDAdd.getText();
        String TKperTrip = jTextFieldTKpertripAdd.getText();
        String Date = jTextFieldDateAdd.getText();
        String DriverID = (jTextFieldDriveridAdd.getText());
        String RoutetNO = (jTextFieldRouteNoAdd.getText());
        String BusNO = (jTextFieldBusNoAdd.getText());
        String AvailableSeats = (jTextFieldAvailableSeatsAdd.getText());
        String BookedSeats = (jTextFieldBookedSeatsAdd.getText());
        String StartingTime = (jTextFieldStartingTimeAdd.getText());

        try {
            ////////////

            pst = con.prepareStatement("select DriverID from Driver where DriverID=?");
            pst.setString(1, DriverID);

            ResultSet rs = pst.executeQuery();

            if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "DriverID does not exist");
            } else {
                pst = con.prepareStatement("select RouteNo from Route where RouteNO=?");
                pst.setString(1, RoutetNO);

                rs = pst.executeQuery();
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "Route no does not exist");
                } else {
                    pst = con.prepareStatement("select BusNo from Bus where BusNO=?");
                    pst.setString(1, BusNO);

                    rs = pst.executeQuery();
                    if (rs.next() == false) {
                        JOptionPane.showMessageDialog(this, "Bus no does not exist");
                    } else {
                        try {
                            pst = con.prepareStatement("insert into Trip(SalaryperTrip,Date, DriverID,RouteNo,BusNo,AvailableSeats,BookedSeats,StartingTime)values(?,?,?,?,?,?,?,?)");
                            //pst.setString(1,TripID);
                            pst.setString(1, TKperTrip);
                            pst.setString(2, Date);
                            pst.setString(3, DriverID);
                            pst.setString(4, RoutetNO);
                            pst.setString(5, BusNO);
                            pst.setString(6, AvailableSeats);
                            pst.setString(7, BookedSeats);
                            pst.setString(8, StartingTime);
                            int x = pst.executeUpdate();

                            if (x == 1) {
                                //jTextFieldTripIDAdd.setText("");
                                jTextFieldTKpertripAdd.setText("");
                                jTextFieldDateAdd.setText("");
                                jTextFieldDriveridAdd.setText("");
                                jTextFieldRouteNoAdd.setText("");
                                jTextFieldBusNoAdd.setText("");
                                jTextFieldAvailableSeatsAdd.setText("");
                                jTextFieldBookedSeatsAdd.setText("");
                                jTextFieldStartingTimeAdd.setText("");

                                jTextFieldTKpertrip.requestFocus();

                                showTripTable();

                                JOptionPane.showMessageDialog(this, "Record Added");

                            } else {
                                JOptionPane.showMessageDialog(this, "Failed");
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(Badtrip.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Badtrip.class.getName()).log(Level.SEVERE, null, ex);
        }

        ///////////////
        ///////////////
        ///////////////
        ///////////////

    }//GEN-LAST:event_jButtonAddtotableActionPerformed

    private void jButtonBackAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackAddActionPerformed
        // TODO add your handling code here:

        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButtonBackAddActionPerformed

    private void jButtonBacktoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBacktoHomeActionPerformed
        // TODO add your handling code here:
        Badwelcome wlcmpg = new Badwelcome(currentuser);
        wlcmpg.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonBacktoHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Badtrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Badtrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Badtrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Badtrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Badtrip().setVisible(true);
            }
        });
    }

    //TableShow
    public void showTripTable() {
        try {
            pst = con.prepareStatement("select*from Trip");

            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rsm = rs.getMetaData();

            int x = rsm.getColumnCount();

            DefaultTableModel DF = (DefaultTableModel) jTableTrip.getModel();
            DF.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();

                for (int i = 0; i <= x; i++) {
                    v.add(rs.getString("TripID"));
                    v.add(rs.getString("RouteNo"));
                    v.add(rs.getString("BusNo"));
                    v.add(rs.getString("DriverID"));
                    v.add(rs.getString("Date"));
                    v.add(rs.getString("SalaryperTrip"));
                    v.add(rs.getString("AvailableSeats"));
                    v.add(rs.getString("BookedSeats"));
                    v.add(rs.getString("StartingTime"));
                    /*v.add(rs.getString("TripID"));
                    v.add(rs.getString("SalaryperTrip"));
                    v.add(rs.getString("Date"));
                    v.add(rs.getString("DriverID"));
                    v.add(rs.getString("RoutetNo"));
                    v.add(rs.getString("BusNo"));
                    v.add(rs.getString("AvailableSeats"));
                    v.add(rs.getString("BookedSeats"));
                    v.add(rs.getString("StartingTime"));*/

                }

                DF.addRow(v);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Badtrip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddtotable;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBackAdd;
    private javax.swing.JButton jButtonBacktoHome;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTripid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTrip;
    private javax.swing.JTextField jTextFieldAvailableSeats;
    private javax.swing.JTextField jTextFieldAvailableSeatsAdd;
    private javax.swing.JTextField jTextFieldBookedSeats;
    private javax.swing.JTextField jTextFieldBookedSeatsAdd;
    private javax.swing.JTextField jTextFieldBusNo;
    private javax.swing.JTextField jTextFieldBusNoAdd;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldDateAdd;
    private javax.swing.JTextField jTextFieldDriverid;
    private javax.swing.JTextField jTextFieldDriveridAdd;
    private javax.swing.JTextField jTextFieldRouteNo;
    private javax.swing.JTextField jTextFieldRouteNoAdd;
    private javax.swing.JTextField jTextFieldStartingTime;
    private javax.swing.JTextField jTextFieldStartingTimeAdd;
    private javax.swing.JTextField jTextFieldTKpertrip;
    private javax.swing.JTextField jTextFieldTKpertripAdd;
    // End of variables declaration//GEN-END:variables
}
