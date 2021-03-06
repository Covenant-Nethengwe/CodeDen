package BusinessLayer;

import java.util.zip.DataFormatException;

import BusinessLayer.*;
import DataAccessLayer.DataHandler;

public class Baptism extends Event{

    @Override
    public int registerEvent() {
        View view = new View();
        DataHandler handler = new DataHandler();
        List<String> lst = view.registerEventData();
        addEvent(lst[0],lst[1]);
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