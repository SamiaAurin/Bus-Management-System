/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User2 {

    private int PID;
    private String TimesPerDay, Type;

    public User2(String TimesPerDay, String Type, int PID) {
        this.TimesPerDay = TimesPerDay;
        this.Type = Type;
        this.PID = PID;
    }

    public String getTimesPerDay() {
        return TimesPerDay;
    }

    public String getType() {
        return Type;
    }

    public int getPID() {
        return PID;
    }
}
