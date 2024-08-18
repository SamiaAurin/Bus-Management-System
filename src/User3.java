/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User3 {

    private int TicketID, SelectedSeats, BusNo, RouteNo, TotalPrice, TripID;
    String Status;

    public User3(int TicketID, int SelectedSeats, int TripID, int BusNo, int RouteNo, int TotalPrice, String Status) {
        this.TicketID = TicketID;
        this.SelectedSeats = SelectedSeats;
        this.TripID = TripID;
        this.BusNo = BusNo;
        this.RouteNo = RouteNo;
        this.TotalPrice = TotalPrice;
        this.Status = Status;
    }

    public int getTicketID() {
        return TicketID;
    }

    public int getSelectedSeats() {
        return SelectedSeats;
    }

    public int getTripID() {
        return TripID;
    }

    public int getBusNo() {
        return BusNo;
    }

    public int getRouteNo() {
        return RouteNo;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public String getStatus() {
        return Status;
    }
}
