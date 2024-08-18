/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User12 {

    private int RouteNo, TripID, BusNo, SalaryPerTrip;
    private String StartingPlace, Destination, StartingTime, Date;

    public User12(int RouteNo, int TripID, int BusNo, int SalaryPerTrip, String StartingPlace, String Destination, String StartingTime, String Date) {
        this.RouteNo = RouteNo;

        this.TripID = TripID;

        this.BusNo = BusNo;

        this.SalaryPerTrip = SalaryPerTrip;

        this.StartingPlace = StartingPlace;

        this.Destination = Destination;

        this.StartingTime = StartingTime;

        this.Date = Date;
    }

    public int getRouteNo() {
        return RouteNo;
    }

    public int getTripID() {
        return TripID;
    }

    public int getBusNo() {
        return BusNo;
    }

    public int getSalaryPerTrip() {
        return SalaryPerTrip;
    }

    public String getStartingPlace() {
        return StartingPlace;
    }

    public String getDestination() {
        return Destination;
    }

    public String getStartingTime() {
        return StartingTime;
    }

    public String getDate() {
        return Date;
    }

}
