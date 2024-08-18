/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User1 {

    private int VetID, Fee, PID;
    private String Address, Lastcheckup;

    public User1(int VetID, String Address, int Fee, String Lastcheckup, int PID) {
        this.VetID = VetID;
        this.Address = Address;
        this.Fee = Fee;
        this.Lastcheckup = Lastcheckup;
        this.PID = PID;
    }

    public int getVetID() {
        return VetID;
    }

    public String getAddress() {
        return Address;
    }

    public int getFee() {
        return Fee;
    }

    public String getLastcheckup() {
        return Lastcheckup;
    }

    public int getPID() {
        return PID;
    }
}
