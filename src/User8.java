/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User8 {

    private int AvailableSeats, BusNo, PricePerSeat;
    private String StartingPlace, Destination, Date, StartingTime, BusName, Type;

    public User8(String StartingPlace, String Destination, String Date, int AvailableSeats, String StartingTime, int BusNo, String BusName, String Type, int PricePerSeat) {
        this.StartingPlace = StartingPlace;
        this.Destination = Destination;
        this.Date = Date;
        this.AvailableSeats = AvailableSeats;
        this.StartingTime = StartingTime;
        this.BusNo = BusNo;
        this.BusName = BusName;
        this.Type = Type;
        this.PricePerSeat = PricePerSeat;
    }

    public String getStartingPlace() {
        return StartingPlace;
    }

    public String getDestination() {
        return Destination;
    }

    public String getDate() {
        return Date;
    }

    public int getAvailableSeats() {
        return AvailableSeats;
    }

    public String getStartingTime() {
        return StartingTime;
    }

    public int getBusNo() {
        return BusNo;
    }

    public String getBusName() {
        return BusName;
    }

    public String getType() {
        return Type;
    }

    public int getPricePerSeat() {
        return PricePerSeat;
    }

}
