/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class User10 {
    
    private int UserID;
    private String Name,Email,Password,PhoneNumber,Gender;
    
    public User10(int UserID,String Name,String Email, String Password,String PhoneNumber,String Gender)
    {
        this.UserID = UserID;
        
        this.Name = Name;
       
        this.Email = Email;
        
        this.Password = Password;
       
        this.PhoneNumber = PhoneNumber;
        
        this.Gender = Gender;
        
    }
    
    public int getUserID()
            {
                return UserID;
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
    
    public String getGender()
            {
                return Gender;
            }
}
