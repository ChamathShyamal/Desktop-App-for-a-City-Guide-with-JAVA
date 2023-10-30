
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;//nested class inside the Arrays class that implements 
//the List interface
import javax.swing.JOptionPane;
import javax.swing.RowFilter;// filter out entries from the model
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;//Returns the most specific superclass for 
//all the cell values in the column
import javax.swing.table.TableRowSorter;// provides sorting and filtering using a TableModel

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Menu
     */
    DefaultTableModel mdl;
    
    public Admin_Menu() {
        initComponents(); 
    }
    
    //Creating public JbSeekerNbusinessmen_Menu method to get the value of uname from Users_Login 
    public Admin_Menu(String uname){
        initComponents();
        
         //Set uname into a lable to display username in the interface
         lblAdminName.setText(uname);
         
         //To dispay the values in the table when the interface is loading
         Show_CityData_In_JTable(); 
         
         //Making the ID Text Field not visible to unble user to use it
         txtId.setVisible(false);    
    }

   //Creating the database connection by providing the location
   public Connection getConnection()
   {
       Connection con;
       try 
       {
           con = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root","");
           return con;
       } 
       catch (Exception ex) 
       {
           System.out.println(""+ex);
           return null;
       }
   }
 //to get the list of city details from the database
                   //'CityDetails' is the method which has getter and setter in its class
   public ArrayList<CityDetails> getCityDetailsList()
   {
       // create an arraylist object using the public method 'CityDetails' in 'CityDetails' class
       ArrayList<CityDetails> citydetailsList = new ArrayList<CityDetails>();
       Connection connection = getConnection();
       
       //SQL query to select all from the database table 'city_data'
       String query = "SELECT * FROM `city_data` ";
       Statement st;
       ResultSet rs;
       
       //Using try...catch block to catch if there's an exception
       try 
       {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           CityDetails citydata;
           
           //Using while loop to retrieve all values in values from the class CityDetails      
           while(rs.next())
           {
            citydata = new CityDetails(rs.getInt("id"),rs.getString("Category"),
            rs.getString("Sub_Category"),rs.getString("Place_Name"),rs.getString("Description"),
            rs.getString("City"),rs.getString("Postal_Code"),rs.getString("Website"));
            
            // use add() method to add elements in the list
            citydetailsList.add(citydata);
           }
       } 
       catch (Exception e) {
           e.printStackTrace();
       } 
       return citydetailsList;
   }
   
   //Method to Display database records in JTable
   public void Show_CityData_In_JTable()
   {
       ArrayList<CityDetails> list = getCityDetailsList();
       DefaultTableModel model = (DefaultTableModel)jTableCityData.getModel();
       
       //Decalring the number of columns creating an object
       Object[] row = new Object[8];
       //Using a FOR Loop to add all the elements available in list
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getId();
           row[1] = list.get(i).getCategory();
           row[2] = list.get(i).getSubCategory();
           row[3] = list.get(i).getPlaceName();
           row[4] = list.get(i).getDescription();
           row[5] = list.get(i).getCity();
           row[6] = list.get(i).getPostalCode();
           row[7] = list.get(i).getWebsite();
           
           model.addRow(row);
       }
       
       //sets columns width of the jTableCityData
           TableColumnModel columnModel = jTableCityData.getColumnModel();
           columnModel.getColumn(0).setPreferredWidth(5);
           columnModel.getColumn(1).setPreferredWidth(15);
           columnModel.getColumn(2).setPreferredWidth(50);
           columnModel.getColumn(3).setPreferredWidth(80);
           columnModel.getColumn(4).setPreferredWidth(30);
           columnModel.getColumn(5).setPreferredWidth(10);
           columnModel.getColumn(6).setPreferredWidth(10);
           columnModel.getColumn(7).setPreferredWidth(180);
    }
   
   //Execute the sql query
   public void executeSQlQuery(String query, String outputMsg)
   {
       //calling the getConnection method to establiosh database connection
       Connection con = getConnection();
       Statement st;
       
       //Using try...catch block to catch if there's an exception
       try{
        st = con.createStatement();
      //To update/refresh the jTableCityData when user add/update/delete a record
        if((st.executeUpdate(query)) == 1)
        {
            //To refresh the data in the table
            DefaultTableModel model = (DefaultTableModel)jTableCityData.getModel();
            model.setRowCount(0);
            //Calling the public Method Show_CityData_In_JTable()
            Show_CityData_In_JTable();

            //If the data added, deleted, updated successfully, the following 
            //messeage will be displayed. 'outputMsg' is the String varible 
            //declared inside the methgod 'executeSQlQuery'. 

           //Value for that variable is passed from the relevant methods which 
           //have coded below for the functions of ADD< UPDATE and Delete
            JOptionPane.showMessageDialog(null, "Indormation "+outputMsg+" Succefully");      
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Information Does Not "+outputMsg);
        }
       }
       catch(Exception ex){
           
           System.out.println(""+ex);
       }
   }
   
   //Method for sorting all results from any key word searched by the user
   public void search(String str)
   {
       mdl = (DefaultTableModel) jTableCityData.getModel();
       TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(mdl);
       jTableCityData.setRowSorter(trs);
       trs.setRowFilter(RowFilter.regexFilter(str));    
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
        btnViewUsers = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblAdminName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSubCategory = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtPlaceName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPostalCode = new javax.swing.JTextField();
        txtWebsite = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbCategory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCityData = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        txtSearchBar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 785));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAboutCity.setBackground(new java.awt.Color(0, 0, 51));
        btnAboutCity.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAboutCity.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutCity.setText("ABOUT CITY");
        btnAboutCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnAboutCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnAboutCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 680, 130, 50));

        btnCityMap.setBackground(new java.awt.Color(0, 0, 51));
        btnCityMap.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnCityMap.setForeground(new java.awt.Color(255, 255, 255));
        btnCityMap.setText("CITY MAP");
        btnCityMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnCityMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityMapActionPerformed(evt);
            }
        });
        getContentPane().add(btnCityMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 680, 120, 50));

        btnViewUsers.setBackground(new java.awt.Color(0, 0, 51));
        btnViewUsers.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnViewUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUsers.setText("VIEW USERS");
        btnViewUsers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 680, 130, 50));

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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 82, 52));

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
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 138, -1));

        lblAdminName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(lblAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CATEGORY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("SUB ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("NAME OF ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("DESCRIPTION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("CITY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 479, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("POSTAL CODE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("WEBSITE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 603, -1, -1));

        cmbSubCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSubCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " ", "--HOTEL/RENTAL/RESTURANT/BAR/COFFEE/THEATRES/AIRLINE/SHOPPING--", "High Budget ", "Cheap", " ", "----------------**EDUCATION**----------------", "Universities", "High Schools", "Libraries", "Coaching Centres", " ", "---------------------**JOBS**---------------------", "Engineering", "Arts", "Designing", "Business, management & administration", "Science & Technology ", "Repair & Maintenance", "Agricultural", "Government", "Health & Medicine", "Law", "Sales ", " ", "--------------------**ATM**--------------------", "Best Rated ", "Good Rated ", " ", "-----------------**INDUSTRIES**----------------", "Energy", "Automobiles ", "Electrical", "Machinery", "Apparel", "Logistics ", " ", "------------**TRANSPOTATION**-------------", "Bus", "Rail", "Cycling", "Coaches", "Flights ", "Taxies", " ", "---------**TOURIST ATTRACTIONS**---------", "Natural Attractions", "Historical", "Entertainments", "Art & Culture ", " ", "---------------**HEALTHCARE**----------------", "Government Hospitals", "Private Hospitals", "Pharmacies", "Dentals", "Surgeries ", " ", "---------**EMERGENCY HELPLINE**----------", "Police", "Ambulance", "Fire Service", "Coastguard", "Rescue Services", " " }));
        cmbSubCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSubCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 197, 270, 41));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 102, 270, -1));

        txtPlaceName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtPlaceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 256, 270, 42));

        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCity.setText("Cardiff");
        getContentPane().add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 467, 270, 40));

        txtPostalCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtPostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 531, 270, 40));

        txtWebsite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtWebsite, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 591, 270, 40));

        btnAdd.setBackground(new java.awt.Color(0, 0, 51));
        btnAdd.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 82, 52));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 51));
        btnUpdate.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 100, 52));

        btnDelete.setBackground(new java.awt.Color(0, 0, 51));
        btnDelete.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 680, 90, 52));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Education", "Jobs", "ATM", "Hotel", "Industries", "RentalAccomodations", "Resturants", "Bars", "CoffeeShops", "Transportation", "TouristAttractions", "Theatres", "HealthCare", "AirlineReservation", "Shopping", "EmergencyHelpline", " " }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 137, 270, 42));

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAreaDescription.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 317, 270, 132));

        jTableCityData.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTableCityData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Category", "subCategory", "PlaceName", "Description", "City", "PostalCode", "Website"
            }
        ));
        jTableCityData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCityDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCityData);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 185, 833, 446));

        btnClear.setBackground(new java.awt.Color(0, 0, 51));
        btnClear.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 5, true));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 82, 52));

        txtSearchBar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarActionPerformed(evt);
            }
        });
        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 134, 600, 33));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Search Using Any Keyword :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 134, 230, 33));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, 82, 50));

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("WELCOME TO ADMIN MENU ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("CATEGORY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("THE PLACE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeMenu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1370, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSubCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSubCategoryActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void jTableCityDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCityDataMouseClicked
       //Coding for allowing user to go to a website by opening a web browser 
       
       //when user double clicked on a record in the table
        if(evt.getClickCount() == 2 && !evt.isConsumed() )
        {
            evt.consume();
            int rowPosition = jTableCityData.getSelectedRow();
            String WebLink = jTableCityData.getValueAt(rowPosition, 7).toString();
            
            try 
            {
                Desktop.getDesktop().browse(new URL(WebLink).toURI());
            } 
            catch (Exception ex) 
            {
                System.out.println(""+ex);
            }
        }
        else
        {
            //To show the data of a selected row in text fields

            // Get The Index Of The Slected Row 
            int i = jTableCityData.getSelectedRow();
            TableModel model = jTableCityData.getModel();

            //Get selected row's values into text fields in the form
            txtId.setText(model.getValueAt(i,0).toString());
            cmbCategory.setSelectedItem(model.getValueAt(i,1));
            cmbSubCategory.setSelectedItem(model.getValueAt(i,2));
            txtPlaceName.setText(model.getValueAt(i,3).toString());
            txtAreaDescription.setText(model.getValueAt(i,4).toString());
            txtCity.setText(model.getValueAt(i,5).toString());
            txtPostalCode.setText(model.getValueAt(i,6).toString());
            txtWebsite.setText(model.getValueAt(i,7).toString());
        }
    }//GEN-LAST:event_jTableCityDataMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Coding for saving city details 

        //The coding below will be functined only if the user have filled the form wrong
        
        //Declaring valiables to get the selected intems from the combo box and make 
        //it easier to use when validating empty fields
        String ctgry = cmbCategory.getSelectedItem().toString();
        String sbCtgry = cmbSubCategory.getSelectedItem().toString();
        
        //Empty Field validation
        if(ctgry.equals("Select") || sbCtgry.equals("Select") || txtPlaceName.getText().length()<=0 
          || txtAreaDescription.getText().length()<=0 || txtCity.getText().length()<=0 || 
          txtPostalCode.getText().length()<=0 || txtWebsite.getText().length()<=0)
        {
            
        JOptionPane.showMessageDialog(null, "Fields can't be blank , Fill & Try Again ! ", 
                "Admin Menu", JOptionPane.WARNING_MESSAGE);
        }
        //The coding below will be functined only if the user have filled the form correctly
        else
        {
        //SQL query to insert data into the city_data table in the database   
        String query = "INSERT INTO `city_data`(`Category`, `Sub_Category`, `Place_Name`, "
        + "`Description`, `City`, `Postal_Code`, `Website`) VALUES "
        + "('"+cmbCategory.getSelectedItem()+"','"+cmbSubCategory.getSelectedItem()+"',"
        + "'"+txtPlaceName.getText()+"','"+txtAreaDescription.getText()+"','"+txtCity.getText()+"',"
        + "'"+txtPostalCode.getText()+"','"+txtWebsite.getText()+"')";

        //Passng the characters 'Saved' to the method 'executeSQlQuery' to use 
        //in displaying the messages
        executeSQlQuery(query, "Saved");
        
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Coding for updating city details 
        
        //Declaring valiables to get the selected intems from the combo box and make 
        //it easier to use when validating empty fields
        String ctgry = cmbCategory.getSelectedItem().toString();
        String sbCtgry = cmbSubCategory.getSelectedItem().toString();
        
        //Empty Field validation
        if(ctgry.equals("Select") || sbCtgry.equals("Select") || txtPlaceName.getText().length()<=0 
        || txtAreaDescription.getText().length()<=0 || txtCity.getText().length()<=0 || 
        txtPostalCode.getText().length()<=0 || txtWebsite.getText().length()<=0)
        {  
        JOptionPane.showMessageDialog(null, "Fields can't be blank , Fill & Try Again ! ", "Admin Menu", JOptionPane.WARNING_MESSAGE);
        }
        
        else
        {
        //SQL query to update data into the city_data table in the database     
        String query = "UPDATE `city_data` SET `Category`='"+cmbCategory.getSelectedItem()+"',"
        + "`Sub_Category`='"+cmbSubCategory.getSelectedItem()+"',`Place_Name`='"+txtPlaceName.getText()+"',"
        + "`Description`='"+txtAreaDescription.getText()+"',`City`='"+txtCity.getText()+"',"
        + "`Postal_Code`='"+txtPostalCode.getText()+"',`Website`='"+txtWebsite.getText()+"' WHERE `id`="+txtId.getText();   
        
        //Passng the characters 'Updated' to the method 'executeSQlQuery' to use 
        //in displaying the messages
        executeSQlQuery(query, "Updated");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //SQL query to delete data using the ID from the city_data table in the database  
        String query = "DELETE FROM `city_data` WHERE id = "+txtId.getText();
        
        //Passng the characters 'Deleted' to the method 'executeSQlQuery' to use 
        //in displaying the messages
        executeSQlQuery(query, "Deleted");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //Directing to Users_Login window when user pressed Back button
        dispose();
        Users_Login ul= new Users_Login();
        ul.setTitle ("Users Login");
        ul.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Coding to clear fields in the form 
        txtId.setText("");
        cmbCategory.setSelectedIndex(0);
        cmbSubCategory.setSelectedIndex(0);
        txtPlaceName.setText("");
        txtAreaDescription.setText("");
        txtCity.setText("");
        txtPostalCode.setText("");
        txtWebsite.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Directing to Home window when user pressed Logout button
        dispose();
        Home hm= new Home();
        hm.setTitle ("Home");
        hm.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        // To get the user input into a variable from the search text field
        String searchString = txtSearchBar.getText();
        search (searchString);
    }//GEN-LAST:event_txtSearchBarKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // To exit the system
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAboutCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutCityActionPerformed
         //Directing to CityAbout window when user pressed About City button
        dispose();
        CityAbout ca= new CityAbout();
        //Have used a PUBLIC lable by setting the text as 'AdminAbout' to access 
        //the interface when in the City About interface
        ca.lblAccessBackButton.setText("AdminAbout");
        ca.setVisible(true);
    }//GEN-LAST:event_btnAboutCityActionPerformed

    private void btnCityMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityMapActionPerformed
        //Directing to CityMap window when user pressed City Map button
        dispose();
        CityMap cm= new CityMap();
        //Have used a PUBLIC lable by setting the text as 'AdminMap' to access 
        //the interface when in the City Map interface
        cm.lblAccessBackButton.setText("AdminMap");
        cm.setVisible(true);
    }//GEN-LAST:event_btnCityMapActionPerformed

    private void btnViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUsersActionPerformed
       //Directing to AdminViewUsers window when user pressed View Users button
        dispose();
        AdminViewUsers avu= new AdminViewUsers();
        avu.setTitle ("Admin View Users");
        avu.setVisible(true);
    }//GEN-LAST:event_btnViewUsersActionPerformed

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutCity;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCityMap;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewUsers;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbSubCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCityData;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPlaceName;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtSearchBar;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables
}
