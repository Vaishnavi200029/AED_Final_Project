package ProjectModel;

public class Franchise {

    private String name;
    private ServicesDirectory serviceDirectory;

    public Franchise(String name) {
        this.name = name;
        serviceDirectory = new ServicesDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServicesDirectory getServiceDirectory() {
        return serviceDirectory;
    }

    public void setServiceDirectory(ServicesDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
    }
   

    public String toString()

    {
        return name;
    }
}
