package ProjModel;

public class Franchise {

    private String name;
    private ServicesDirectory enterpriseDirectory;

    public Franchise(String name) {
        this.name = name;
        enterpriseDirectory = new ServicesDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServicesDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ServicesDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
   

    public String toString()

    {
        return name;
    }
}
