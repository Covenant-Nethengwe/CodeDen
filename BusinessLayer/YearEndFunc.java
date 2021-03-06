package BusinessLayer;

import BusinessLayer.Event;

public class YearEndFunc extends Event 
{

    @Override
    public int registerEvent() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Boolean booking(int bookingId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    
    public Event confirmedBooking(Boolean booking) {if(booking == false){

        int dateDiff = handler.date - Date.UTC(date);

        if (datDiff<= 15) {

            System.out.println("UNCOMFIRMED Event ID :"handler.eventId +"has been cancelled...");
            
        }
        else{

            Baptism.booking(int bookingId);

        }
    }
    else{
        return event;
    }

    }

    @Override
    public double calculateTotal(Event typeOfEvent) {
        if(theme==true)
        {
            Price = Price + BThemePrice;
        }else{BThemePrice=0.0;}

        if(handler.noOfAdults>40){
            Price = Price - (0.15*Price);
        }

        return Price;
        
    }
    
}