
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Tourist_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Tourist_Menu
     */
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Tourist_Menu() {
        initComponents();
    }
    //Creating public Tourist_Menu method to get the value of uname from Users_Login 
    public Tourist_Menu(String uname){
         initComponents();
         //Set uname into a lable to display username in the interface
         lblTouristName.setText(uname);    
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAboutCity = new javax.swing.JButton();
        btnCityMap = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSearchUsingCategory = new javax.swing.JComboBox<>();
        lblTouristName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTourist = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnAboutCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 690, 130, 50));

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
        getContentPane().add(btnCityMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 110, 50));

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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 76, 50));

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("WELCOME TO TOURIST MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 580, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Choose Any Sector From Here :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 22));

        cmbSearchUsingCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSearchUsingCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Hotel", "ATM", "RentalAccomodations", "Resturants", "Bars", "CoffeeShops", "Transportation", "TouristAttractions", "Theatres", "HealthCare", "AirlineReservation", "Shopping", "EmergencyHelpline", " " }));
        cmbSearchUsingCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchUsingCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSearchUsingCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 110, 860, 40));

        lblTouristName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(lblTouristName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 237, 40));

        jTableTourist.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableTourist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "subCategory", "PlaceName", "Description", "City", "PostalCode", "Website"
            }
        ));
        jTableTourist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTouristMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTourist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 1112, 480));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 690, 76, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeMenu6.jpg"))); // NOI18N
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
        jTableTourist.setModel(model);
        
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

    private void btnCityMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityMapActionPerformed
        //Directing to CityMap window when user pressed City Map button
        dispose();
        CityMap cm= new CityMap();
        //Have used a PUBLIC lable by setting the text as 'StudentMap' to access 
        //the interface when in the City Map interface
        cm.lblAccessBackButton.setText("TouristMap");
        cm.setVisible(true);
    }//GEN-LAST:event_btnCityMapActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       // To exit the system
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAboutCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutCityActionPerformed
        //Directing to CityAbout window when user pressed About City button
        dispose();
        CityAbout ca= new CityAbout();
        //Have used PUBLIC a lable by setting the text as 'StudentAbout' to access 
        //the interface when in the City About interface
        ca.lblAccessBackButton.setText("TouristAbout");
        ca.setVisible(true);
    }//GEN-LAST:event_btnAboutCityActionPerformed

    private void jTableTouristMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTouristMouseClicked
        //Coding for allowing user to go to a website by opening a web browser 
        //when user double clicked on a record in the table
        if(evt.getClickCount() == 2 && !evt.isConsumed() )
        {
            evt.consume();
            //to get the number of the user selected row
            int rowPosition = jTableTourist.getSelectedRow();
            // Using WebLink string variable for Getting the value at a row 
            //in the Column 'Website'
            String WebLink = jTableTourist.getValueAt(rowPosition, 6).toString();
            
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
    }//GEN-LAST:event_jTableTouristMouseClicked

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
            java.util.logging.Logger.getLogger(Tourist_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tourist_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tourist_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tourist_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tourist_Menu().setVisible(true);
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
    private javax.swing.JTable jTableTourist;
    private javax.swing.JLabel lblTouristName;
    // End of variables declaration//GEN-END:variables
}
