/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class User11 {
     private int AdminID;
    private String Name,Email,Password,PhoneNumber;
    
    public User11(int AdminID,String Name,String Email, String Password,String PhoneNumber)
    {
        this.AdminID = AdminID;
        
        this.Name = Name;
       
        this.Email = Email;
        
        this.Password = Password;
       
        this.PhoneNumber = PhoneNumber;
        
        
    }
    
    public int getAdminID()
            {
                return AdminID;
            }
     public String getName()
            {
                return Name;
            }
     
    public String getEmail()
            {
                return Email;
            }
    
    
    public String getPassword()
            {
                return Password;
            }
    
    public String getPhoneNumber()
            {
                return PhoneNumber;
            }
    
}
