package model;

//this is a subclass to the superclass RealEstate
//below is the extension of the superclass

import java.util.Date;

public class Apartment extends RealEstate {
    private int numberOfBuildingStoreys;
    private int storey;
    private boolean parking;
    private int parkingSpots;

    //the constructor                                       the constructor
    public Apartment(int id,
                     String estateTitle,
                     String address,
                     double estateSurface,
                     Date buildDate,
                     double price,
                     Date offerCreationDate,
                     Date offerEndingDate,
                     boolean availability,
                     int numberOfRooms,
                     int numberOfBuildingStoreys,
                     int storey,
                     boolean parking,
                     int parkingSpots) {
        super(id, estateTitle, address, estateSurface, buildDate, price, offerCreationDate, offerEndingDate, availability, numberOfRooms);
        this.numberOfBuildingStoreys = numberOfBuildingStoreys;
        this.storey=storey;
        this.parking=parking;
        this.parkingSpots=parkingSpots;
    }
        //getters                                       getters
        public int getNumberOfBuildingStoreys(){
            return numberOfBuildingStoreys;
        }
        public int getStorey(){
            return storey;
        }
        public boolean getParking(){
            return parking;
        }
        public int getParkingSpots(){
            return parkingSpots;
        }
        //setters                                       setters
        public void setNumberOfBuildingStoreys(int numberOfBuildingStoreys){
            this.numberOfBuildingStoreys = numberOfBuildingStoreys;
        }
        public void setStorey(int storey){
            this.storey=storey;
        }
        public void setParking(boolean parking){
            this.parking=parking;
        }
        public void setParkingSpots(int parkingSpots){
            this.parkingSpots=parkingSpots;
        }

    @Override
    public String toString(){
        return  "\nID=" +getId()+
                "\nReal estate title=" +getEstateTitle()+
                "\nAddress="+getAddress()+
                "\nSurface of the estate="+getEstateSurface()+
                "\nBuilt on="+getBuildDate()+
                "\nPrice="+getPrice()+
                "\nOffer creation date="+getOfferCreationDate()+
                "\nOffer ending date="+getOfferEndingDate()+
                "\nAvailability="+getAvailability()+
                "\nNumber of rooms="+getNumberOfRooms()+
                "\nNumber of estate storeys="+ getNumberOfBuildingStoreys()+
                "\nApartment storey="+getStorey()+
                "\nHas parking="+getParking()+
                "\nParking spots="+getParkingSpots();

    }












}
