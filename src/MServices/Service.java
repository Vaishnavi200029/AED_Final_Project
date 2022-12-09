/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MServices;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ProjectModel.Services;
import ProjectModel.Organization;
import ui.main.DateUtils;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public abstract class Service {
    protected static final String TAB = "      ";

    static enum ServiceType {
        BUSINESS_EVENT,
        RESTURANT,
        HEALTH_CLUB,
        HOTEL,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    protected Services services;
    private Status status;
    protected int totalCost;
    private List<Organization> listOfOrg;

    Service(Services enterprise, ServiceType serviceType, Date date) {
        this.services = services;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtils.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrg = new ArrayList<>();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Services getServices() {
        return services;
    }

    public void setEnterprise(Services enterprise) {
        this.services = services;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrganization(Organization org) {
        listOfOrg.add(org);
    }

    public List<Organization> getListOfOrg() {
        return listOfOrg;
    }

    public void setListOfOrg(List<Organization> listOfOrg) {
        this.listOfOrg = listOfOrg;
    }

    public abstract String toString();
    
}
