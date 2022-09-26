package LandLord;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Residence myResidence = new Residence("123 Main St", "Anytown", "CA", "12345", 1000.00);
        Occupiable myApartment = new Apartment("John Smith", "123-456-7890", "123 Main St", "Apt 1", "Anytown", "CA", "12345", 1000.00);
        Occupiable myHouse = new House("Ivan Smith", "123-456-7890", "123 Main St", "Anytown", "CA", "12345", 1000.00);
        //System.out.println(myApartment);
       // System.out.printf("First Payment: %.2f $", myApartment.firstPayment());
        //System.out.println(myHouse);
        //System.out.printf("First Payment: %.2f $", myHouse.firstPayment());

        ArrayList<Occupiable> occupiable = new ArrayList<>();
        occupiable.add(myApartment);
        occupiable.add(myHouse);

        for (Occupiable residence : occupiable) {
           if (residence instanceof Apartment){
               System.out.println("Apartment Unit");
              }else if (residence instanceof House){
               System.out.println("House");

           }
            System.out.println(residence);
            System.out.println(residence.getContacteInfo());
        }


    }
}