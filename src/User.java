/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User {

    private int PetID, Age;
    private String Type, Name, Size, Gender;

    public User(int PetID, String Type, String Name, String Size, int age, String Gender) {
        this.PetID = PetID;
        this.Type = Type;
        this.Name = Name;
        this.Size = Size;
        this.Age = age;
        this.Gender = Gender;
    }

    public int getPetID() {
        return PetID;
    }

    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }

    public String getSize() {
        return Size;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

}
