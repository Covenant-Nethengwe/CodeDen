package BusinessLayer;



import java.util.Date;

import DataAccesLayer.DataHandler;
public class Graduation extends Event{

    DataHandler datahandler =  new Datahandler();
    
    @Override
    public int registerEvent() {View view = new View();
        DataHandler handler = new DataHandler();
        String EventDet = view.registerEventData();
        addEvent(EventDet[0],EventDet[1]);
        int eventId = handler.getEventID();
        return eventId;
    }

    @Override
    public Boolean booking(int bookingId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Event confirmedBooking(Boolean booking) {
        if(booking == false){

            int dateDiff = handler.date - Date.UTC(date);

            if (datDiff<= 15) {

                System.out.println("UNCOMFIRMED Event ID :"handler.eventId +"has been cancelled...");
                
            }
            else{

                int bookingId;
                Baptism.booking(Integer bookingId);

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