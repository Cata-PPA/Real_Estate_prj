package model;

//this is a subclass to the superclass RealEstate
//below is the extension of the superclass

import java.util.Date;

public class House extends RealEstate {
    private int numberOfEstateStoreys;
    private Land land;

    //the constructor                                       the constructor
    public House(int id,
                 String estateTitle,
                 String address,
                 double estateSurface,
                 Date buildDate,
                 double price,
                 Date offerCreationDate,
                 Date offerEndingDate,
                 boolean availability,
                 int numberOfRooms,
                 int numberOfEstateStoreys,
                 Land land) {
        super(id, estateTitle, address, estateSurface, buildDate, price, offerCreationDate, offerEndingDate, availability, numberOfRooms);
        this.numberOfEstateStoreys=numberOfEstateStoreys;
        this.land=land;
    }
    //getters                                       getters
    public int getNumberOfEstateStoreys(){
        return numberOfEstateStoreys;
    }
    public Land getLand(){
        return land;
    }

    //setters                                       setters
    public void setNumberOfEstateStoreys(int numberOfEstateStoreys){
        this.numberOfEstateStoreys=numberOfEstateStoreys;
    }
    public void setLand(Land land){
        this.land=land;
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
                "\nNumber of estate storeys="+ getNumberOfEstateStoreys()+
                "\nSurface of the land="+ getLand();

    }



}
