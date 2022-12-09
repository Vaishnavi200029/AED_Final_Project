package ProjectModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemAdmin {

    private List<Franchise> listOfFranchise;
    private CustomerDirectory customerDirec;
    private Map<String, String> mapType;
    private Map<String, String> userNamePasswordMap;

    public SystemAdmin(String userName, String password) {
        listOfFranchise = new ArrayList<>();
        listOfFranchise.add(new Franchise("Seattle"));
        listOfFranchise.add(new Franchise("Boston"));
        customerDirec = new CustomerDirectory();
        mapType = new HashMap<>();
        userNamePasswordMap = new HashMap<>();
        userNamePasswordMap.put(userName, password);
        addUser(userName, password, "admin");
    }

    public Map<String, String> getUserNamePasswordMap() {
        return userNamePasswordMap;
    }

    public void setUserNamePasswordMap(Map<String, String> userNamePasswordMap) {
        this.userNamePasswordMap = userNamePasswordMap;
    }

    public Map<String, String> getMapType() {
        return mapType;
    }

    public void setMapType(Map<String, String> mapType) {
        this.mapType = mapType;
    }

    public List<Franchise> getListOfFranchise() {
        return listOfFranchise;
    }

    public void setListOfFranchise(List<Franchise> listOfFranchise) {
        this.listOfFranchise = listOfFranchise;
    }

    public CustomerDirectory getCustomerDirec() {
        return customerDirec;
    }

    public void setCustomerDirec(CustomerDirectory customerDirec) {
        this.customerDirec = customerDirec;
    }

    public void addFranchise(String name) {
        Franchise franchise = new Franchise(name);
        listOfFranchise.add(franchise);
    }

    public Franchise findFranchise(String franchiseName) {
        for (Franchise franchise : listOfFranchise) {
            if (listOfFranchise != null && franchise.getName().equals(franchiseName)) {
                return franchise;
            }
        }
        return null;
    }

    public void addUser(String username, String password, String type) {
        mapType.put(username, type);
        userNamePasswordMap.put(username, password);
    }

    public String findUserType(String username) {
        if (mapType.containsKey(username)) {
            return mapType.get(username);
        }
        return null;
    }

    public boolean userExistsInSystem(String username) {
        return mapType.containsKey(username);
    }

    public boolean validateUserNamePassword(String userName, String password) {
        return userNamePasswordMap.containsKey(userName) && userNamePasswordMap.get(userName).equals(password);
    }

    public static SystemAdmin createSystemAdmin() {
        return new SystemAdmin("admin", "admin");
    }

    public void deleteCustomer(Customer customer) {
        customerDirec.getListOfCustomer().remove(customer);
        mapType.remove(customer.getUserName());
    }

    public void updateUser(String username, String password) {
        if (userNamePasswordMap.containsKey(username)) {
            userNamePasswordMap.put(username, password);
        }
    }

    public Customer findCustomer(String user) {
        for (Customer custom : customerDirec.getListOfCustomer()) {
            if (custom.getUserName().equals(user)) {
                return custom;
            }
        }
        return null;
    }
}
