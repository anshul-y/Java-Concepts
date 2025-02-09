package com.java.oops.innerclass.localclass;

public class Hotel {
    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String hotelName, int totalRooms, int reservedRooms) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReserveValidator{ //local inner class, to encapsulate validation logic
            public boolean validate() {
                if(reservedRooms+numOfRooms>totalRooms){
                    System.out.println("No rooms available");
                    return false;
                }
                if(guestName.isEmpty()){
                    System.out.println("Guest Name cannot be empty");
                    return false;
                }
                if(numOfRooms<0){
                    System.out.println("Rooms should be greater than 0");
                    return false;
                }
                return true;
            }
        }
        ReserveValidator validator = new ReserveValidator();
        if(validator.validate()){
            reservedRooms+=numOfRooms;
            System.out.println(numOfRooms+" rooms reserved for "+guestName);
        }else{
            System.out.println("Reservation Failed");
        }
    }
}
