/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User5 {

    private int DriverID, Age;
    private String Email, Password, Name, PhoneNumber, LicenseNumber, Gender;

    public User5(int DriverID, String Email, String Password, String Name, int Age, String PhoneNumber, String LicenseNumber, String Gender) {
        this.DriverID = DriverID;

        this.Email = Email;

        this.Password = Password;

        this.Name = Name;

        this.Age = Age;

        this.PhoneNumber = PhoneNumber;

        this.LicenseNumber = LicenseNumber;

        this.Gender = Gender;

    }

    public int getDriverID() {
        return DriverID;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public String getGender() {
        return Gender;
    }

}
