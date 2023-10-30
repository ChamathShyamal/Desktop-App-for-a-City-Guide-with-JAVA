/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ViewUsers {
    
    //declaring variables to be called inside the 'ViewUsers' method
    private int id;
    private String fName;
    private String lName;
    private String uType;
    private String uName;
    private String pswd;
    private String gender;
    private String fromCountry;
    private String email;
    private String tel;
    
    //Created method to generate getter and setter
    public ViewUsers(int ID , String Firstname, String Lastname, String UserType, String Username, String Password, String Gender, String FromCountry, String Email, String Telephone)
    {
        this.id=ID;
        this.fName=Firstname;  
        this.lName=Lastname;
        this.uType=UserType;
        this.uName=Username;
        this.pswd=Password;
        this.gender=Gender;
        this.fromCountry=FromCountry;
        this.email=Email;
        this.tel=Telephone;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getuType() {
        return uType;
    }

    public String getuName() {
        return uName;
    }

    public String getPswd() {
        return pswd;
    }

    public String getGender() {
        return gender;
    }

    public String getFromCountry() {
        return fromCountry;
    }
    
    public String getEmail(){
        return email;
    }

    public String getTel() {
        return tel;
    }    
}
