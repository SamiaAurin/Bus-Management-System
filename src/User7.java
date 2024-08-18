/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User7 {

    private int TicketID, UserID, SelectedSeats, TripID, BusNo, RouteNo, TotalPrice;
    private String Status;

    public User7(int TicketID, int UserID, int SelectedSeats, int TripID, int BusNo, int RouteNo, int TotalPrice, String Status) {
        this.TicketID = TicketID;
        this.UserID = UserID;
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

    public int getUserID() {
        return UserID;
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
