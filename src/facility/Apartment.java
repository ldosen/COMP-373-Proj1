package facility;

public class Apartment {

    private String apartmentId;
    private int numberOfRooms;
    private double monthlyRent;

    public Apartment(){}

    public String getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(String apartmentId){
        this.apartmentId = apartmentId;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public double getMonthlyRent(){
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent){
        this.monthlyRent = monthlyRent;
    }
}
