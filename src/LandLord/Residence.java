package LandLord;

public abstract class Residence {  // abstract class can't be instantiated but can be inherited
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Double monthlyRent;
    protected final Double APPRECIATION_FEES = 30.00;
    private String contactName;
    private String contactPhone;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Residence(String contactName, String contactPhone, String address, String city, String state, String zipCode, Double monthlyRent) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.monthlyRent = monthlyRent;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
    public String toString(){
        return "Address: " + address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zipCode + "\nMonthly Rent: " + monthlyRent;
    }

    public abstract Double firstPayment();

}
