/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */ 
class User9 {
     
     private int ReportID,UserID;
     private String Content,RStatus,Name,Email,PhoneNumber;
     
       public  User9 (int ReportID,int UserID,String Content,String RStatus,String Name,String Email,String PhoneNumber)
            {
                this.ReportID = ReportID;
                this.UserID = UserID;
                this.Content = Content; 
                this.RStatus = RStatus;
                this.Name = Name;
                this.Email = Email;
                this.PhoneNumber = PhoneNumber;
            }
       
    public int getReportID()
    {
        return ReportID;
    }
    public int getUserID()
    {
        return UserID;
    }
    public String getContent()
            {
                return Content;
            }
    public String getRStatus()
            {
                return RStatus;
            }
    public String getName()
            {
                return Name;
            }
    public String getEmail()
            {
                return Email;
            }
    public String getPhoneNumber()
            {
                return PhoneNumber;
            }
    
}
     
