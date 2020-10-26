/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author apple
 */
public class sign_up extends javax.swing.JFrame {

    /**
     * Creates new form sign_up
     */
    public sign_up() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image_signup = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/logo.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }

        };
        name_signup = new javax.swing.JLabel();
        username_sign = new javax.swing.JTextField();
        pass_sign = new javax.swing.JPasswordField();
        confi_pass_sign = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        login_sign = new javax.swing.JButton();
        sign_up = new javax.swing.JButton();
        back_home_sign = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.white);
        image_signup.setText("");
        image_signup.setPreferredSize(new java.awt.Dimension(900, 900));

        name_signup.setText("SIGN UP");
        name_signup.setFont(new Font("Serif", Font.PLAIN, 50));
        name_signup.setPreferredSize(new java.awt.Dimension(200, 200));

        username_sign.setPreferredSize(new java.awt.Dimension(400, 50));

        pass_sign.setPreferredSize(new java.awt.Dimension(400, 50));

        confi_pass_sign.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setText("Already have an account?");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 16));

        login_sign.setText("login");
        login_sign.setBackground(Color.white);
        login_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_signActionPerformed(evt);
            }
        });

        sign_up.setText("Sign up");
        sign_up.setPreferredSize(new java.awt.Dimension(120, 35));
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });

        back_home_sign.setText("HOME");
        back_home_sign.setPreferredSize(new java.awt.Dimension(100, 30));
        back_home_sign.setBackground(Color.white);
        back_home_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_home_signActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(image_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(name_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(username_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(pass_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(confi_pass_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(login_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(back_home_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back_home_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(name_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(username_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pass_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(confi_pass_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_sign))
                .addGap(18, 18, 18)
                .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_signActionPerformed
        // TODO add your handling code here:
        login lo = new login();
        this.setVisible(false);
        lo.setVisible(true);
    }//GEN-LAST:event_login_signActionPerformed

    private void back_home_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_home_signActionPerformed
        // TODO add your handling code here:
        home_page hom = new home_page();
        this.setVisible(false);
        hom.setVisible(true);
    }//GEN-LAST:event_back_home_signActionPerformed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        // TODO add your handling code here:
        int demo=0;
        String user = username_sign.getText();
        String pass = String.valueOf(pass_sign.getPassword());
        String confi_pass1 = String.valueOf(confi_pass_sign.getPassword());
        if(user.equals("Admin")==true||user.equals("")==true){
            JOptionPane.showMessageDialog(rootPane,"Username khong hop le !","Warning",JOptionPane.WARNING_MESSAGE);
        }else if(pass.equals("")==true){
            JOptionPane.showMessageDialog(rootPane,"Ban chua nhap password !","Warning",JOptionPane.WARNING_MESSAGE);
        }else if(pass.equals(confi_pass1)==false){
            JOptionPane.showMessageDialog(rootPane,"Xac nhan password sai !","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            Connection conn = null;
            Statement st = null;
            ResultSet rs = null;
            PreparedStatement ps = null;
            try {
                String dbURL = "jdbc:mysql://localhost:8889/mysql_db";
                String username = "root";
                String password = "root";
                conn = DriverManager.getConnection(dbURL, username, password);             
                String sql = "select * from account ";              
                st = (Statement) conn.createStatement();
                // Thực thi
                rs = st.executeQuery(sql);
                while (rs.next()) {                   
                    if(user.equals(rs.getString("username"))==true){
                        demo=1;
                    }                   
                }
                if(demo==1){
                    JOptionPane.showMessageDialog(rootPane,"Tai khoan da ton tai","Warning",JOptionPane.WARNING_MESSAGE);
                }else if(demo==0){          
                    String sql3 = "INSERT INTO account VALUES (?,?)";                   
                    ps = (PreparedStatement) conn.prepareStatement(sql3);
                    ps.setString(1, user);
                    ps.setString(2, pass);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane,"Dang ki thanh cong");              
                }
                demo=0;
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                    if (st != null) {
                        st.close();
                    }
                    if (rs != null) {
                        rs.close();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                  }
            }                                                           
        }
    }//GEN-LAST:event_sign_upActionPerformed

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_home_sign;
    private javax.swing.JPasswordField confi_pass_sign;
    private javax.swing.JLabel image_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_sign;
    private javax.swing.JLabel name_signup;
    private javax.swing.JPasswordField pass_sign;
    private javax.swing.JButton sign_up;
    private javax.swing.JTextField username_sign;
    // End of variables declaration//GEN-END:variables
}
