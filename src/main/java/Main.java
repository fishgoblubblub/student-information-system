import storage.IDandPasswords;
import ui.LoginPage;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args){
        HashMap<String, String> loginInfo = new HashMap<>();
        IDandPasswords idandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(new java.util.HashMap<>(idandPasswords.getLoginInfo()));
    }
}
