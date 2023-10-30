/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//Class to implemet getter and setter 
public class CityDetails {
    
    //declaring variables to be called inside the 'CityDetails' method
    private int id;
    private String category;
    private String subCategory;
    private String placeName;
    private String description;
    private String city;
    private String postalCode;
    private String web;
    
    //Created method to generate getter and setter
    public CityDetails(int ID , String Category, String SubCategory, String PlaceName, String Description, String City, String PostalCode, String Website)
    {
        this.id=ID;
        this.category=Category; 
        this.subCategory=SubCategory;
        this.placeName=PlaceName;
        this.description=Description;
        this.city=City;
        this.postalCode=PostalCode;
        this.web=Website;
    }
    
    //getter and setter
    public int getId()
    {
        return id;
    }
    public String getCategory()
    {
        return category;
    }
    public String getSubCategory()
    {
        return subCategory;
    }
    public String getPlaceName()
    {
        return placeName;
    }
    public String getDescription()
    {
        return description;
    }
    public String getCity()
    {
        return city;
    }
    public String getPostalCode()
    {
        return postalCode;
    }
    public String getWebsite()
    {
        return web;
    }   
}
