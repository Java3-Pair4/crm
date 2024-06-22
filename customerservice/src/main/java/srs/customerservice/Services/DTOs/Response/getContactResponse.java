package srs.customerservice.Services.DTOs.Response;

public class getContactResponse {
    private int id;

    private String email;


    private String gsmNumber;


    private String homeNumber;

    private String fax;

    public getContactResponse(int id, String email, String gsmNumber, String homeNumber, String fax) {
        this.id = id;
        this.email = email;
        this.gsmNumber = gsmNumber;
        this.homeNumber = homeNumber;
        this.fax = fax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
