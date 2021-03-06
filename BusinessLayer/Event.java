package BusinessLayer;

import java.time.LocalDateTime;


public abstract class Event {
    private int eventId,addressId,noOfKids,noOfAdults;
    private String type,theme,adultMeal,kidsMeal,drinks,dessert;
    private LocalDateTime date;

    public Integer getEventId(){
        return eventId;
    }
    public void setEventId(int eventId){
        this.eventId = eventId;
    }  
    public Integer getAddressId(){
        return addressId;
    }
    public void setAddressId(int addressId){

        this.addressId = addressId;
    }
    public Integer getNoOfKids(){
        return noOfKids;
    }
    public void setNoOfKids(int noOfKids){

        this.noOfKids = noOfKids;
    }
    public Integer getNoOfAdults(){
        return noOfAdults;
    }
    public void setNoOfAdults(int noOfAdults){

        this.noOfAdults = noOfAdults;
    }    
    public String getType(){
        return type;
    }
    public void setType(String type){

        this.type = type;
    } 
    public String getTheme(){
        return theme;
    }
    public void setTheme(String theme){

        this.theme = theme;
    }
    public String getAdultMeal(){
        return adultMeal;
    }
    public void setAdultMeal(String adultMeal){

        this.adultMeal = adultMeal;
    }
    public String getKidsMeal(){
        return kidsMeal;
    }
    public void setKidsMeal(String kidsMeal){

        this.kidsMeal = kidsMeal;
    }
    public String getDrinks(){
        return drinks;
    }
    public void setDrinks(String drinks){

        this.drinks = drinks;
    }
    public String getDessert(){
        return dessert;
    }
    public void setDessert(String dessert){

        this.dessert = dessert;
    }
    public LocalDateTime getDate(){
        return date;
    }
    public void setDate(LocalDateTime date){

        this.date = date;
    }

    public Event(int eventId, int addressId, int noOfAdults, int noOfKids, String type,String theme, String adultMeal,String kidsMeal, String drinks,
    String dessert, LocalDateTime date)
    {
        this.eventId = eventId;
        this.addressId = addressId;
        this.noOfKids = noOfKids;
        this.noOfAdults = noOfAdults;
        this.type = type;
        this.theme = theme;
        this.adultMeal = adultMeal;
        this.kidsMeal = kidsMeal;
        this.drinks = drinks;
        this.dessert = dessert;
        this.date = date;
    }
    public Event(){

    }

    public abstract int registerEvent();
    public abstract Boolean booking(int bookingId);
    public abstract Event confirmedBooking(Boolean booking);
}
