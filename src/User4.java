/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class User4 {

    private int BusNo, TotalSeats, PricePerSeat;
    private String BusName, Type;

    public User4(int BusNo, String BusName, int TotalSeats, String Type, int PricePerSeat) {
        this.BusNo = BusNo;

        this.BusName = BusName;

        this.TotalSeats = TotalSeats;

        this.Type = Type;

        this.PricePerSeat = PricePerSeat;

    }

    public int getBusNo() {
        return BusNo;
    }

    public String getBusName() {
        return BusName;
    }

    public int getTotalSeats() {
        return TotalSeats;
    }
    
    public String getType() {
        return Type;
    }

    public int getPricePerSeat() {
        return PricePerSeat;
    }
}
