package com.skillsoft.model;


import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name = "ticket")
public class FlightTicket {

    private String name;
    private int ticketNumber;
    private String route;
    private BigDecimal ticketPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "name='" + name + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", route=" + route +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}