/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectModel;
import MServices.HotelService;
import MServices.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
//import ProjectModel.services.HotelService;
//import ProjectModel.services.Service;
import ui.main.DateUtils;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class Booking {
    private static final String TAB = "      ";

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private Franchise franchise;

    private List<Service> services;
    private String id;

    public Booking() {
        
    }
    
    public Booking(Hotel hotel, Franchise franchise) {
        this.services = new ArrayList<>();
        this.services.add(new HotelService(hotel));
        this.franchise = franchise;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = DateUtils.formatDate(checkin);
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = DateUtils.formatDate(checkout);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        Franchise franchise1 = this.franchise;
    }

    public HotelService getHotelService() {
        for (Service service : services) {
            if (service instanceof HotelService) {
                return (HotelService) service;
            }
        }

        throw new RuntimeException("Booking should always have an hotel service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Your booking details are mentioned below -\n");
        sb.append("\n").append("The booking details of hotel are as follows:");
        sb.append("\n").append(TAB).append("City: ").append(franchise.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);
        
        List<Room> listOfRooms = getHotelService().getRoomlist().getListOfRooms();
        int roomCost = 0;
        sb.append("\n").append(TAB).append(String.format("The details of the %d rooms booked are mentioned below :", listOfRooms.size()));
        for (Room room : listOfRooms) {
            roomCost += room.getRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("Room number: ")
                    .append(room.getRoomNo()).append(", Room type: ").append(room.getRoomType());
        }
        sb.append("\n").append(TAB).append("Total price of your stay: $").append(roomCost);
        
        int totalCost = roomCost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nThe total price of  booking including all services is : $").append(getTotalCost()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
    
}
