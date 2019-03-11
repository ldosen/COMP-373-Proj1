package usage;

import facility.Apartment;

public class isInUseDuringInterval{
    private int count = 0;
    private int capacity;
    private String status;
    private Apartment apartmentId;
    

    public isInUseDuringInterval();

    public Apartment getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(Apartment apartmentId){
        this.apartmentId = apartmentId;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void getTotalVacancy(Apartment apartment){
        for(int i=0;i<=length.apartment; i++){
            if(apartment.status == "occupied"){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString(){
        String checkVacancy = "Apartment ID:" + Integer.toString(apartmentId) +
                "\nStatus:" + status + "\nCapacity:" + Integer.toString(capacity) + "\nTotalVacancy:" + Integer.toString(capacity - count);
        return checkVacancy;
    }
}