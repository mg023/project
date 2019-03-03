
public class Login {
 
    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("mitali") && password.equals("test@123")) {
            return true;
        }
        return false;
    }
}