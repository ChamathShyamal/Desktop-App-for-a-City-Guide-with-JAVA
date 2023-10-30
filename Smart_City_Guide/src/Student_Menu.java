
import java.awt.Desktop;//launch the native desktop applications that handle URIs
import java.net.URL;//represents an URL by pointing to a resource on the WWW
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;//executes the given SQL statement
import javax.swing.table.DefaultTableModel;//initializes the table by passing 
//data and columnNames
import javax.swing.table.TableColumnModel;//Returns the index of the columns

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author user
 */
public class Student_Menu extends javax.swing.JFrame { 

    /**
     * Creates new form Student_Menu
     */
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Student_Menu() {
        initComponents();
    }
    //Creating public Student_Menu method to get the value of uname from Users_Login 
    public Student_Menu(String uname){
         initComponents();
         //Set uname into a lable to display username in the interface
         lblStudentName.setText(uname);    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAboutCity = new javax.swing.JButton();
        btnCityMap = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cmbSearchUsingCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudent = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("WELCOME TO STUDENT MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 580, -1));

        btnAboutCity.setBackground(new java.awt.Color(0, 51, 51));
        btnAboutCity.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAboutCity.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutCity.setText("ABOUT CITY");
        btnAboutCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 5, true));
        btnAboutCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnAboutCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 700, 130, 47));

        btnCityMap.setBackground(new java.awt.Color(0, 51, 51));
        btnCityMap.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnCityMap.setForeground(new java.awt.Color(255, 255, 255));
        btnCityMap.setText("CITY MAP");
        btnCityMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 5, true));
        btnCityMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityMapActionPerformed(evt);
            }
        });
        getContentPane().add(btnCityMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, 110, 47));

        btnLogout.setBackground(new java.awt.Color(153, 0, 0));
        btnLogout.setFont(new java.awt.Font("Bell MT", 0, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 5, true));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 136, -1));

        btnBack.setBackground(new java.awt.Color(153, 0, 0));
        btnBack.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, 82, 47));

        cmbSearchUsingCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSearchUsingCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Education", "Jobs", "ATM", "Hotel", "RentalAccomodations", "Resturants", "CoffeeShops", "Transportation", "HealthCare", "AirlineReservation", "EmergencyHelpline", "Shopping" }));
        cmbSearchUsingCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchUsingCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSearchUsingCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 109, 850, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Choose Any Sector From Here :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 120, -1, 22));

        lblStudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblStudentName.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(lblStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 246, 40));

        jTableStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "subCategory", "PlaceName", "Description", "City", "PostalCode", "Website"
            }
        ));
        jTableStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 158, 1111, 477));

        btnExit.setBackground(new java.awt.Color(153, 0, 0));
        btnExit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 5, true));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 700, 77, 47));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeMenu4.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void cmbSearchUsingCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchUsingCategoryActionPerformed
        // Coding for search bar in the user
        
        //setting column names into columnNames
        String[] columnNames = {"Category", "Sub_Category", "Place_Name", 
            "Description", "City", "Postal_Code", "Website"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        //Using try...catch block to catch if there's an exception
        try{ 
            
        //Creating the database connection by providing the location
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root","");
        Statement st = (Statement) con.createStatement();
        ResultSet rs;
        st = con.createStatement();
        
        //SQL query for filter records from 'city_data' db table using only the 
        //Category Name
        String query1 = "SELECT * FROM city_data WHERE "
        + "Category = '"+cmbSearchUsingCategory.getSelectedItem().toString()+"'";
        
        rs = st.executeQuery(query1);
        //System.out.println(rs); - Used to printed the result of the query1 as 
        //an output to make sure that the function works without errors
        
        //Using while loop to retrieve all values in records into varibles 
         while (rs.next()) {
             String category = rs.getString("Category");
             String subcategory = rs.getString("Sub_Category");
             String placename = rs.getString("Place_Name");
             String description = rs.getString("Description");
             String city = rs.getString("City");
             String postal = rs.getString("Postal_Code");
             String web = rs.getString("Website");

             // create a single array of one row's worth of data
             String[] data = { category, subcategory, placename, description, city, postal, web} ;

             // and add this row of data into the table model
             model.addRow(data);
         }
        }
        catch (Exception ex) {
            System.out.println(ex.getStackTrace()[0]);
        }
        jTableStudent.setModel(model);
    }//GEN-LAST:event_cmbSearchUsingCategoryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //Directing to Users_Login window when user pressed Back button
        dispose();
        Users_Login ul= new Users_Login();
        ul.setTitle ("Users Login");
        ul.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Directing to Home window when user pressed Logout button
        dispose();
        Home hm= new Home();
        hm.setTitle ("Home");
        hm.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // To exit the system
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAboutCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutCityActionPerformed
        //Directing to About City window when user pressed About City button
        dispose(); 
        CityAbout ca= new CityAbout();
        //Have used a PUBLIC lable by setting the text as 'StudentAbout' to access 
        //the interface when in the City About interface
        ca.lblAccessBackButton.setText("StudentAbout");
        ca.setVisible(true);
    }//GEN-LAST:event_btnAboutCityActionPerformed

    private void btnCityMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityMapActionPerformed
        //Directing to CityMap window when user pressed City Map button
        dispose();
        CityMap cm= new CityMap();
        //Have used a PUBLIC lable by setting the text as 'StudentMap' to access 
        //the interface when in the City Map interface
        cm.lblAccessBackButton.setText("StudentMap");
        cm.setVisible(true);
    }//GEN-LAST:event_btnCityMapActionPerformed

    private void jTableStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentMouseClicked
        //Coding for allowing user to go to a website by opening a web browser 
        //when user double clicked on a record in the table
        if(evt.getClickCount() == 2 && !evt.isConsumed() )
        {
            evt.consume();
            //to get the number of the user selected row
            int rowPosition = jTableStudent.getSelectedRow();
            // Using WebLink string variable for Getting the value at a row 
            //in the 6th Column which is 'Website' 
            String WebLink = jTableStudent.getValueAt(rowPosition, 6).toString();
            
            //Using try...catch block to catch if there's any exception
            try 
            {
                //Browse using the value in the Column 'Website'
                Desktop.getDesktop().browse(new URL(WebLink).toURI());
            } 
            catch (Exception ex) 
            {
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_jTableStudentMouseClicked

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
            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutCity;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCityMap;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbSearchUsingCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudent;
    private javax.swing.JLabel lblStudentName;
    // End of variables declaration//GEN-END:variables
}
