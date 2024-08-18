
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author waugh
 */
public class Badticket extends javax.swing.JFrame {

    /**
     * Creates new form Badticket
     */
    public Connection connection;
    String currentuser;
    String driver, email, password, name, age, phone, license, gender;

    public Badticket(String currentuser) {
        initComponents();
        this.currentuser = currentuser;
        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        show_user();
    }

    public Badticket() {
        initComponents();
    }

    public ArrayList<User7> userList() {

        ArrayList<User7> userList = new ArrayList<>();
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

            String query1 = "SELECT * FROM Ticket";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);

            User7 user;

            while (rs.next()) {
                user = new User7(rs.getInt("TicketID"),
                        rs.getInt("UserID"),
                        rs.getInt("SelectedSeats"),
                        rs.getInt("TripID"),
                        rs.getInt("BusNo"),
                        rs.getInt("RouteNo"),
                        rs.getInt("TotalPrice"),
                        rs.getString("Status"));
                userList.add(user);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }

        return userList;

    }

    public void show_user() {
        ArrayList<User7> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object[] row = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getTicketID();
            row[1] = list.get(i).getUserID();
            row[2] = list.get(i).getSelectedSeats();
            row[3] = list.get(i).getTripID();
            row[4] = list.get(i).getBusNo();
            row[5] = list.get(i).getRouteNo();
            row[6] = list.get(i).getTotalPrice();
            row[7] = list.get(i).getStatus();
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TicketID", "UserID", "SelectedSeats", "TripID", "BusNo", "RouteNo", "TotalPrice", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Status:");

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(819, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Badwelcome wlcmpg = new Badwelcome(currentuser);
        wlcmpg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();

            /*String query2 = "DELETE FROM DRIVER WHERE DriverID = '" + driver
                    + "' AND Email = '" + email
                    + "' AND Password = '" + password + "' AND Name = '" + name
                    + "' AND Age = '" + age + "' AND PhoneNumber = '" + phone + "' AND LicenseNumber = '" + license + "' AND Gender = '" + gender + "'";*/

            String query2 = "DELETE FROM Ticket WHERE TicketID = '" + model.getValueAt(row, 0).toString()
                    + "' AND UserID = '" + model.getValueAt(row, 1).toString()
                    + "' AND SelectedSeats = '" + model.getValueAt(row, 2).toString() + "' AND TripID = '" + model.getValueAt(row, 3).toString()
                    + "' AND BusNo = '" + model.getValueAt(row, 4).toString() + "' AND RouteNo = '" + model.getValueAt(row, 5).toString() + "' AND TotalPrice = '" + model.getValueAt(row, 6).toString() + "' AND Status = '" + model.getValueAt(row, 7).toString() + "'";
           //System.out.println(query2);
            PreparedStatement pst = connection.prepareStatement(query2);
            pst.executeQuery();

            if (jTable1.getSelectedRowCount() == 1) {
                model.removeRow(jTable1.getSelectedRow());
            } else if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Please Select a Row");
            }

        } catch (Exception e) {
            //Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, e);
            // e.printStackTrace();

            ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
            show_user();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {

            String status = jTextField1.getText();

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            //String sqlInsert = "UPDATE Route SET StartingPlace = '" + StartingPlace + "' , Destination = '" + Destination + "' WHERE RouteNo = " + model.getValueAt(row, 0).toString()
            //+ "' AND StartingPlace = '" + model.getValueAt(row, 1).toString() + "' AND Destination = '" + model.getValueAt(row, 2).toString() + "'";

            String sqlInsert = "UPDATE Ticket SET Status = '" + status + "' WHERE TicketID = '" + model.getValueAt(row, 0).toString()
                    + "' AND UserID = '" + model.getValueAt(row, 1).toString() + "' AND SelectedSeats = '" + model.getValueAt(row, 2).toString()
                    + "' AND TripID = '" + model.getValueAt(row, 3).toString() + "' AND BusNo = '" + model.getValueAt(row, 4).toString()
                    + "' AND RouteNo = '" + model.getValueAt(row, 5).toString() + "' AND TotalPrice = '" + model.getValueAt(row, 6).toString()
                    + "'";

            //System.out.println(sqlInsert);
            PreparedStatement stat = connection.prepareStatement(sqlInsert);
            stat.executeQuery();
        } catch (Exception e) {
            //Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, e);
            ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
            show_user();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTextField1.setText(model.getValueAt(selectedRow, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Badticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Badticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Badticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Badticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Badticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}