package BusinessLayer;

import BusinessLayer.Event;

public class Party extends Event {

    @Override
    public int registerEvent() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Boolean booking(int bookingId) {View view = new View();
        DataHandler handler = new DataHandler();
        String EventDet = view.registerEventData();
        addEvent(EventDet[0],EventDet[1]);
        int eventId = handler.getEventID();
        return eventId;
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
