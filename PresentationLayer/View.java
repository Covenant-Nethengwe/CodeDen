import java.util.*;
import java.text.SimpleDateFormat;



public class View {
    public String UserReg()
    {
        // returns a string to be split into customer details
        // for the Customer table
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------WELCOME TO DELICIOUS CATERING-------------------------");
        System.out.println("Please enter you FIRST name:");
        String fName = sc.nextLine();
        System.out.println("Please enter your LAST name:");
        String lName = sc.nextLine();
        System.out.println("Please enter your phone number (e.g. 0712234567):");
        String phone = sc.nextLine();
        System.out.println("Please enter your email address:");
        String email = sc.nextLine();
        String result = fName + "," + lName + "," + phone + "," + email;
        sc.close();
        return result;

    }

    public int UserLogin()
    {
        // Returns the Email(user name) and Email(password) of the customer if customer exists
        // Retutns -1 should the customer not exist
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------WELCOME BACK TO DELICIOUS CATERING-------------------------");
        System.out.println("------------------------THANK YOU FOR YOUR CONTINUED SUPPORT------------------------");
        System.out.println("Please Enter your USERNAME number (note:cellphone number is your username):");
        String uName = sc.nextLine();
        if (uName) {
            
        }
        System.out.println("Please enter PASSWORD (note: email is your password):");
        String pass = sc.nextLine();
        sc.close();


    }

    public List <String> registerEventData()
    {
        List<String> lst = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Adrress ID");
         int addressId = sc.nextInt();

        System.out.println("Enter the number of kids");
        int noOfKids = sc.nextInt();

        System.out.println("Enter the number of Adults" );
        int noOfAdults = sc.nextInt();

        System.out.println("Enter event type");
        String type = sc.nextLine();

        System.out.println("Enter theme");
        String theme = sc.nextLine();

        System.out.println("Enter kids meal");
        String kidsMeal = sc.nextLine();

        System.out.println("Enter Adult Meal");
        String adultMeal = sc.nextLine();

        System.out.println("Enter your Drink(s)");
        String drinks = sc.nextLine();

        System.out.println("Enter your Desert(s)");
        String desert = sc.nextLine();

        System.out.println("Enter the date of the event");
        System.out.println("dd-mm-yyyy");
        String date1 = sc.nextLine();
        Date date=new SimpleDateFormat("dd-MM-yyyy").parse(date1);  
        System.out.println(date);
        sc.close();
       String EventDet= addressId+","+ noOfKids+","+noOfAdults+","+type+","+theme+","+kidsMeal+","+adultMeal+","+drinks+","+desert+","+date;
        lst.add(EventDet);
       // collect data 
        // add data to list 
        // return list
       
    }

    public int bookingData()
    {
        // ask for booking id
        System.out.println("Enter your booking ID");
        Scanner sc = new Scanner();
        int bookingId = sc.getInt();
        return bookingId;
    }
}
