/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DEBIT_CARD.java
 *
 * Created on Dec 31, 2019, 8:45:51 PM
 */

/**
 *
 * @author JAYANTH,SANJAY
 */
import javax.swing.*;
import java.sql.*;
public class DEBIT_CARD extends javax.swing.JFrame {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;

    /** Creates new form DEBIT_CARD */
    public DEBIT_CARD() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel7.setText("             Bill Details");

        jLabel8.setText("Amt");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEBIT CARD DETAILS");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("DEBIT CARD DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 11, 145, 36);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("CARD NUMBER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(66, 89, 87, 36);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("CARD HOLDER NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(66, 157, 127, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("EXPIRY DATE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(66, 228, 107, 31);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("CVV");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(66, 291, 45, 37);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(113, 380, 136, 25);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 90, 234, 37);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 159, 234, 38);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(240, 229, 54, 29);

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(317, 231, 56, 29);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(348, 380, 126, 25);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel6.setText("/");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(298, 231, 13, 22);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(658, 208, 56, 20);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(240, 296, 71, 29);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debitcard.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 610, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cno=jTextField1.getText();
        String name=jTextField2.getText();
        String cv=new String(jPasswordField2.getPassword());
        //int c=Integer.parseInt(cvv);
        int a=cno.length();
        int b=cv.length();
        System.out.println(a+" "+b);
        if(a==16 && b==3) {
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost/RAILWAY","root","root");
                st=con.createStatement();
                String sql="INSERT INTO DEBIT VALUES('"+cno+"','"+name+"','"+cv+"');";
                int n=st.executeUpdate(sql);
                if(n>0) {
                    JOptionPane.showMessageDialog(null,"PROCESSING....");
                    this.dispose();
                    DEBIT_CARD LAST=new DEBIT_CARD();
                    new END().setVisible(true);
                }
                st.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Enter the details correctly");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"ARE YOU SURE?");
        if(a==0)
        {
            this.dispose();
            DEBIT_CARD CONFIRM_BOOKING=new DEBIT_CARD();
            new CONFIRM_BOOKING().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    System.exit(0);
                }
                new DEBIT_CARD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
