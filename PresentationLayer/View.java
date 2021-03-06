import java.util.*;

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

    public ArrayList<String> registerEventData()
    {
        List<String> lst = new ArrayList<>();
        // collect data 

        // add data to list 
        // return list
    }

    public int bookingData()
    {
        // ask for booking id
        int bookingId; // = sc.getInt();
        
    }
}
