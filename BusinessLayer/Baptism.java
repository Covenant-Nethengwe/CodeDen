package BusinessLayer;

import java.util.zip.DataFormatException;

import PresentationLayer.*;
import DataAccessLayer.*;

public class Baptism extends Event{

    @Override
    public int registerEvent() {
        View view = new View();
        DataHandler handler = new DataHandler();
        String EventDet = view.registerEventData();
        addEvent(EventDet[0],EventDet[1]);
        int eventId = handler.getEventID();
        return eventId;
    }

    @Override
    public Boolean booking(int bookingId) {
        int statusInt = getBookingStatus(bookingId);
        if (statusInt == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Event confirmedBooking(Boolean booking) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double calculateTotal(Event typeOfEvent) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}