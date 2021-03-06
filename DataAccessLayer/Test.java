package DataAccessLayer;

import java.sql.SQLException;
import java.time.LocalDate;

public class Test{
    public static void main(String[] args) throws SQLException {
        try {
            DataHandler dh = new DataHandler();
            LocalDate ldt = LocalDate.parse("2020-03-12");
            dh.addEvent("wedding", ldt , 2, 5, "Black and gold", "sushi and lamb", "macarroni and mince", "pudding", 950000, "miami ave", "washington dc", "0121");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}