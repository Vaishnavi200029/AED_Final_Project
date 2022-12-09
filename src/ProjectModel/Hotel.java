/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectModel;
import ProjectModel.Room.RoomType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import ProjectModel.Room.RoomType;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class Hotel extends Services {

    private RoomList roomListDirec;
    private List<Manager> listOfManager;
    private List<LaundaryOg> laundaryOrg;
    private List<TransportationOg> transportationOgList;
    private List<LaundaryOg> laundaryOg;
    private List<TransportationOg> transportationOrgList;

    public Hotel() {

    }

    public Hotel(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        roomListDirec = new RoomList();
        transportationOgList = new ArrayList<>();
        laundaryOrg = new ArrayList<>();
    }

    public List<LaundaryOg> getLaundaryOg() {
        List<LaundaryOg> laundaryOg = null;

        return laundaryOg;
    }

    public void setLaundaryOg(List<LaundaryOg> laundaryList) {
        this.laundaryOg = laundaryList;
    }

    public List<TransportationOg> getTransportationOgList() {
        List<TransportationOg> transportationOgList = null;
        return transportationOgList;
    }

    public void setTransportationOgList(List<TransportationOg> transportationList) {
        this.transportationOgList = transportationList;
    }

    public RoomList getRoomListDirec() {
        return roomListDirec;
    }

    public void setRoomListDirec(RoomList roomList) {
        this.roomListDirec = roomList;
    }

    public List<Room> availableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : roomListDirec.getListOfRooms()) {
            if (room.getRoomType().equals(roomType) && room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> bookRooms(Date startDate, Date endDate, int count, RoomType roomType) {
        List<Room> availableRooms = availableRooms(startDate, endDate, roomType);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("Rooms unavailable for the  date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked room list
        return availableRooms.subList(0, count);
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUsername().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addLaundaryOg(String name, String contact, String city) {
        LaundaryOg laundaryOg1 = new LaundaryOg(name, contact, city);
        laundaryOg.add(laundaryOg1);
    }

    public void addTransportationOg(String name, String contact, String networkName) {
        TransportationOg to = new TransportationOg(name, contact, networkName);
        transportationOgList.add(to);
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

    public void deleteLaundary(LaundaryOg laundary) {
        laundaryOg.remove(laundary);
    }

    public void deleteTransportation(TransportationOg transport) {
        transportationOgList.remove(transport);
    }

}