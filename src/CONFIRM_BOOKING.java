/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CONFIRM_BOOKING.java
 *
 * Created on Nov 9, 2019, 1:05:34 AM
 */

/**
 *
 * @author JAYANTH,SANJAY
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
public class CONFIRM_BOOKING extends javax.swing.JFrame {
        Connection con=null;
        Statement st=null;
        Statement st1=null;
        Statement st2=null;
        Statement st3=null;
        Statement st4=null;
        Statement st5=null;
        ResultSet rs=null;
        ResultSet rs1=null;
        ResultSet rs2=null;
        ResultSet rs3=null;
        ResultSet rs4=null;

    /** Creates new form CONFIRM_BOOKING */
    public CONFIRM_BOOKING() {
        initComponents();
        
        DefaultTableModel train_details=(DefaultTableModel)jTable1.getModel();
        DefaultTableModel contact_details=(DefaultTableModel)jTable2.getModel();
        DefaultTableModel passenger_details=(DefaultTableModel)jTable3.getModel();
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/RAILWAY","root","root");
            st=con.createStatement();
            int fare=0,nop=0;
            String sql="SELECT * FROM BOOKING;";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String tn=rs.getString("TRAIN_NAME");
                String o=rs.getString("ORIGIN");
                String ds=rs.getString("DESTINATION");
                String at=rs.getString("ARRIVAL_TIME");
                String dt=rs.getString("DEPARTING_TIME");
                int f=Integer.parseInt(rs.getString("FARE"));
                String dd=rs.getString("DEPARTING_DATE");
                train_details.addRow(new Object[]{tn,o,ds,at,dt,f,dd});
            }
            try{
            st1=con.createStatement();
            String sql1="SELECT * FROM CONTACT_DETAILS;";
            rs1=st1.executeQuery(sql1);
            while(rs1.next())
            {
                String fn=rs1.getString("FIRSTNAME");
                String ln=rs1.getString("LASTNAME");
                String dob=rs1.getString("DOB");
                String g=rs1.getString("GENDER");
                String add=rs1.getString("ADDRESS");
                String city=rs1.getString("CITY");
                String ctry=rs1.getString("COUNTRY");
                String mobno=rs1.getString("MOBILENO");
                String eid=rs1.getString("E_ID");
                String pin=rs1.getString("PINCODE");
                contact_details.addRow(new Object[]{fn,ln,dob,g,add,city,ctry,mobno,eid,pin});
            }
                rs1.close();
                st1.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
                   System.exit(0);
            }
            try
            {
                st5=con.createStatement();
                String sql5="SELECT * FROM PASSENGER_DETAILS";
                rs4=st5.executeQuery(sql5);
                while(rs4.next())
                {
                    String n=rs4.getString("NAME");
                    int age=Integer.parseInt(rs4.getString("AGE"));
                    String g=rs4.getString("GENDER");
                    passenger_details.addRow(new Object[]{n,age,g});
                }
                rs4.close();
                st5.close();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
                   System.exit(0);
            }
            try{
                st2=con.createStatement();
                String a="SELECT COUNT(*) FROM PASSENGER_DETAILS;";
                rs2=st2.executeQuery(a);
                while(rs2.next())
                {
                    nop=Integer.parseInt(rs2.getString("COUNT(*)"));
                }
                rs2.close();
                st2.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.exit(0);
            }
            try
            {
                st3=con.createStatement();
                String b="SELECT FARE FROM BOOKING";
                rs3=st3.executeQuery(b);
                while(rs3.next())
                {
                    fare=Integer.parseInt(rs3.getString("FARE"));
                }
                rs3.close();
                st3.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.exit(0);
            }
             int amt=nop*fare;
             jTextField1.setText(""+amt);
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CONFIRM BOOKING\n");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("CONFIRM BOOKING");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(548, 67, 260, 29);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TRAIN DETAILS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(71, 124, 102, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTACT DETAILS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(71, 295, 127, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRAIN NAME", "FROM CITY", "TO CITY", "ARRIVAL TIME", "DEPARTING TIME", "FARE/PERSON", "DEPARTING DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(71, 147, 1262, 96);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FRIST NAME", "LAST NAME", "DATE OF BIRTH", "GENDER", "ADDRESS", "CITY", "COUNTRY", "MOBILE NO.", "EMAIL ID", "PINCODE"
            }
        ));
        jTable2.setRowHeight(45);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(71, 318, 1321, 95);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AMOUNT TO BE PAID ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(71, 650, 181, 28);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(270, 652, 181, 29);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("PROCEED TO PAYMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 710, 220, 31);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(987, 708, 120, 36);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSENGER DETAILS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(71, 444, 170, 17);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "AGE", "GENDER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(71, 467, 940, 112);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Flamsbanen.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1440, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CONFIRM_BOOKING USER_MODE_OF_PAYMENT=new CONFIRM_BOOKING();
        new USER_MODE_OF_PAYMENT().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/RAILWAY","root","root");
            st4=con.createStatement();
            String sql1="DELETE FROM BOOKING";
            int n1=st4.executeUpdate(sql1);
            String sql2="DELETE FROM PASSENGER_DETAILS";
            int n2=st4.executeUpdate(sql2);
            String sql3="DELETE FROM CONTACT_DETAILS";
            int n3=st4.executeUpdate(sql3);
            String sql4="DELETE FROM SEARCH_TRAIN";
            int n4=st4.executeUpdate(sql4);
            st4.close();
            System.exit(0);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                    Class.forName("java.sql.DriverManager");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }
                new CONFIRM_BOOKING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
