package model;

import java.util.Date;

//this is the superclass(parent class). Will be used for the creation of the subclasses
//it contains the common variables needed for the creation of the classes

public class RealEstate {
    private int id;
    private String estateTitle;
    private String address;
    private double estateSurface;
    private Date buildDate;
    private double price;
    private Date offerCreationDate;
    private Date offerEndingDate;
    private boolean availability;
    private int numberOfRooms;

//the constructor                                the constructor
public RealEstate( int id,
                   String estateTitle,
                   String address,
                   double estateSurface,
                   Date buildDate,
                   double price,
                   Date offerCreationDate,
                   Date offerEndingDate,
                   boolean availability,
                   int numberOfRooms){
    this.id=id;
    this.estateTitle=estateTitle;
    this.address=address;
    this.estateSurface=estateSurface;
    this.buildDate=buildDate;
    this.price=price;
    this.offerCreationDate=offerCreationDate;
    this.offerEndingDate=offerEndingDate;
    this.availability=availability;
    this.numberOfRooms=numberOfRooms;
}

//getters                                       getters
    public int getId(){
        return id;
    }

    public String getEstateTitle() {
        return estateTitle;
    }
    public String getAddress() {
        return address;
    }
    public double getEstateSurface() {
        return estateSurface;
    }
    public Date getBuildDate() {
        return buildDate;
    }
    public double getPrice() {
        return price;
    }
    public Date getOfferCreationDate () {
        return offerCreationDate;
    }
    public Date  getOfferEndingDate() {
        return offerEndingDate;
    }
    public boolean getAvailability() {
        return availability;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    //setters                                       setters
    public void setId(int id){
        this.id=id;
    }
    public void setEstateTitle(String estateTitle){
        this.estateTitle=estateTitle;
    }
    public void setAddress(String address){
        this.estateTitle=estateTitle;
    }
    public void setEstateSurface(double estateSurface){
        this.estateTitle=estateTitle;
    }
    public void setBuildDate(Date buildDate){
        this.buildDate=buildDate;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setOfferCreationDate(Date offerCreationDate){
        this.offerCreationDate=offerCreationDate;
    }
    public void setOfferEndingDate(Date offerEndingDate){
        this.offerEndingDate=offerEndingDate;
    }
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms=numberOfRooms;
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
                "\nNumber of rooms="+getNumberOfRooms();
}

    @Override
    public boolean equals(Object o){
        RealEstate re2=(RealEstate) o;
        return id==(re2.getId());
    }

    @Override
    public int hashCode(){
        return id*31;
    }












}
