package DataAccessLayer;

import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class DataHandler {
    Connection con;
    //You can use this method for calculating the total
    public String[] cusDisplayEvent(String eventId) throws SQLException, InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        con = new DatabaseConnection().con();
        String[] event = new String[10];
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM event WHERE eventId ='" + eventId + "'";
            ResultSet rs = st.executeQuery(sql);
            boolean found = false;
            if (rs.next()) {
                String type, theme, adultMeal, kidsMeal, drinks, dessert;
                Date date;
                int noOfKids, noOfAdults;
                double price;

                type = rs.getString("type");
                theme = rs.getString("theme");
                adultMeal = rs.getString("adultMeal");
                kidsMeal = rs.getString("kidsMeal");
                drinks = rs.getString("drinks");
                dessert = rs.getString("dessert");
                noOfKids = rs.getInt("noOfKids");
                noOfAdults = rs.getInt("noOfAdults");
                price = rs.getDouble("price");
                date = rs.getDate("date");

                event[0] = type;
                event[1] = theme;
                event[2] = adultMeal;
                event[3] = kidsMeal;
                event[4] = drinks;
                event[5] = dessert;
                event[6] = String.format("%d", noOfKids);
                event[7] = String.format("%d", noOfAdults);
                event[8] = String.format("%f", price);
                event[9] = String.format("%t", date);
                found = true;

            } else if (!found) {
                System.out.println("\n Invalid Event ID. Try Again");
                return null;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        con.close();
        return event;
    }

    public Integer getEventID()
    {
        ResultSet rs;
        con = new DatabaseConnection().con();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT TOP 1 eventId FROM event ORDER BY eventId DESC";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        con.close();
        return rs.getInt("evenId");
    }
    //Display for raheal
    public List<String> rahealDisplay() throws SQLException, InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        con = new DatabaseConnection().con();
        List<String> lst = new ArrayList<String>();
        try {
            String sql = "SELECT * FROM event";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String type, theme, adultMeal, kidsMeal, drinks, dessert;
                Date date;
                int noOfKids, noOfAdults,eId;
                double price;

                eId = rs.getInt("eventId");
                type = rs.getString("type");
                theme = rs.getString("theme");
                adultMeal = rs.getString("adultMeal");
                kidsMeal = rs.getString("kidsMeal");
                drinks = rs.getString("drinks");
                dessert = rs.getString("dessert");
                noOfKids = rs.getInt("noOfKids");
                noOfAdults = rs.getInt("noOfAdults");
                price = rs.getDouble("price");
                date = rs.getDate("date");
                
                String line = eId+","+type+","+theme+","+adultMeal+","+kidsMeal+","+drinks+","+dessert+","+noOfKids+","+noOfAdults+","+price+","+date;
                lst.add(line);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        con.close();
        return lst;
    }
    PreparedStatement ps;
    //Adding an event to the database
    public void addEvent(String type,LocalDate date, int noOfKids, int noOfAdults, String theme, String adultMeal, String kidsMeal,
            String dessert, double price, String streetName, String city, String pCode) throws SQLException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {

            con = new DatabaseConnection().con();
            try {
                
                String sqlEvent = "INSERT INTO event (type,date,noOfKids,noOfAdults,theme,adultMeal,kidsMeal,drinks,dessert,price)"+
                                  "VALUES (?,?,?,?,?,?,?,?,?,?)";                  
                ps = con.prepareStatement(sqlEvent);
                ps.setString(1, type);
                DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
                String strDate = df.format(date);
                ps.setString(2, strDate);
                ps.setInt(3, noOfKids);
                ps.setInt(4, noOfAdults);
                ps.setString(5, theme);
                ps.setString(6, adultMeal);
                ps.setString(7, kidsMeal);
                ps.setString(8, dessert);
                ps.setDouble(9, price);
                ps.setString(10, type);
                ps.execute();
    
                String sqlAddress ="INSERT INTO address (street,city,postalCode) VALUES (?,?,?)";
                ps = con.prepareStatement(sqlAddress);
                ps.setString(1, streetName);
                ps.setString(2, city);
                ps.setString(3, pCode);
                ps.execute();
    
                con.close();
            } catch (Exception e) {
                System.out.println("Exception Thrown");
                System.out.println(e.toString());
            }

        }
    //To validate a booking
    public void verify(int eId) throws SQLException, InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        con = new DatabaseConnection().con();

        try {
            String sql = "UPDATE booking SET status = 1 WHERE eventId = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, eId);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Integer getBookingStatus(int bookingID)
    {
        ResultSet rs;
        con = new DatabaseConnection().con();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT Status FROM Booking WHERE BookingId ='" + bookingID + "'";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        con.close();
        return rs.getInt("Status");
    }
}
