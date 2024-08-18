/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waugh
 */
class User6 {

    private int RouteNo;
    private String StartingPlace, Destination;

    public User6(int RouteNo, String StartingPlace, String Destination) {
        this.RouteNo = RouteNo;
        this.StartingPlace = StartingPlace;
        this.Destination = Destination;

    }

    public int getRouteNo() {
        return RouteNo;
    }

    public String getStartingPlace() {
        return StartingPlace;
    }

    public String getDestination() {
        return Destination;
    }

}
