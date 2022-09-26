package LandLord;

public class Apartment extends Residence implements  Occupiable {
    private  String apartmentNumber;
    public Apartment( String contactName, String contactPhone, String address, String apartmentNumber, String city, String state, String zipCode, Double monthlyRent) {
        super(contactName, contactPhone, address, city, state, zipCode, monthlyRent);
        this.apartmentNumber = apartmentNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public Double firstPayment(){
        return getMonthlyRent() + APPRECIATION_FEES + (getMonthlyRent() * 0.5);
    }
    public String toString(){
        return "Address: " + getAddress() + "\nCity: " + getCity() + "\nState: " + getState() + "\nZip Code: "
                + getZipCode() + "\nMonthly Rent: " + getMonthlyRent() + "\nApartment Number: " + apartmentNumber;
    }
    public String getContacteInfo(){
        return "Contact Name: " + getContactName() + "\nContact Phone: " + getContactPhone();
    }
}
