import DataAccessLayer.*;

;public class UserAuthentication {
    public void RegisterUser()
    {
        // Registers user in the database
        View view = new View();
        DataHandler handler =  new DataHandler();
        String[] userData = view.UserReg().split(",");
        handler.addCustomer(userData[0], userData[1], userData[2], userData[3]);
    }

    public int UserLogin()
    {
        // Logs User in
        // returns CustomerID if validation goes well
        // returms -1 otherwise
        View view = new View();
        return view.UserLogin();
    }   
}
