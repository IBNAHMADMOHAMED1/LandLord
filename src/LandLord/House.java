package LandLord;

public class House extends Residence implements Occupiable {
     private final Double SECURITY_DEPOSIT = 200.00;
    public House(String contactName, String contactPhone, String address, String city, String state, String zipCode, Double monthlyRent) {
        super( contactName,contactPhone, address, city, state, zipCode, monthlyRent);

    }
    public Double firstPayment(){
        return getMonthlyRent() + APPRECIATION_FEES + SECURITY_DEPOSIT;
    }

    public String toString(){
        return "Address: " + getAddress() + "\nCity: " + getCity() + "\nState: " + getState() + "\nZip Code: " +
                getZipCode() + "\nMonthly Rent: " + getMonthlyRent();
    }
    public String getContacteInfo(){
        return "Contact Name: " + getContactName() + "\nContact Phone: " + getContactPhone();
    }
}

