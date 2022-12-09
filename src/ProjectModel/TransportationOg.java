/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
class TransportationOg extends Organization {

    private List<Transportation> listOfTransportation;

    public TransportationOg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTransportation = new ArrayList<>();
    }

    public List<Transportation> getListOfTransportation() {
        return listOfTransportation;
    }

    public void setListOfTransportation(List<Transportation> listOfTransportation) {
        this.listOfTransportation = listOfTransportation;
    }

    public void addTransportationman(String name, String city, String user, String password1) {
        Transportation transportation = new Transportation(name, city, user, password1);
        listOfTransportation.add(transportation);
        System.out.println("Delivery man  added is " + listOfTransportation.size());
    }

    public void deleteManager(Manager man) {
       listOfManager.remove(man);
    }
}