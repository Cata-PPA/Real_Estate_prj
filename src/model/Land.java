package model;

//this is a standalone class. Will be used for the creation of the subclass House
// House has Land scheme.

import java.util.Date;

public class Land {
    private int id;
    private String landTitle;
    private String address;
    private double landSurface;
    private double price;
    private Date offerCreationDate;
    private Date offerEndingDate;
    private boolean availability;

    //the constructor                                the constructor
    public Land( int id,
                 String landTitle,
                 String address,
                 double landSurface,
                 double price,
                 Date offerCreationDate,
                 Date offerEndingDate,
                 boolean availability){
        this.id=id;
        this.landTitle = landTitle;
        this.address=address;
        this.landSurface = landSurface;
        this.price=price;
        this.offerCreationDate=offerCreationDate;
        this.offerEndingDate=offerEndingDate;
        this.availability=availability;
    }

    //getters                                       getters
    public int getId(){
        return id;
    }

    public String getLandTitle() {
        return landTitle;
    }
    public String getAddress() {
        return address;
    }
    public double getLandSurface() {
        return landSurface;
    }
    public double getPrice() {
        return price;
    }
    public Date getOfferCreationDate() {
        return offerCreationDate;
    }
    public Date getOfferEndingDate() {
        return offerEndingDate;
    }
    public boolean getAvailability() {
        return availability;
    }


    //setters                                       setters
    public void setId(int id){
        this.id=id;
    }
    public void setLandTitle(String landTitle){
        this.landTitle = landTitle;
    }
    public void setAddress(String address){
        this.landTitle = landTitle;
    }
    public void setLandSurface(double landSurface){
        this.landTitle = landTitle;
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


    @Override
    public String toString(){
        return  "\nID=" +getId()+
                "\nReal estate Title=" + getLandTitle()+
                "\nAddress="+getAddress()+
                "\nSurface of the land="+ getLandSurface()+
                "\nPrice="+getPrice()+
                "\nOffer creation date="+getOfferCreationDate()+
                "\nOffer ending date="+getOfferEndingDate()+
                "\nAvailability="+getAvailability();
    }

    @Override
    public boolean equals(Object o){
        Land l2=(Land) o;
        return id==(l2.getId());
    }

    @Override
    public int hashCode(){
        return id*31;
    }

}
