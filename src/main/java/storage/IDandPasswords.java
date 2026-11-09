package storage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {
    
    HashMap<String, String> loginInfo = new HashMap<>();
    
    public IDandPasswords(){
        loginInfo.put("Student","progaming62");
        loginInfo.put("Teacher","password");
        loginInfo.put("admin","admin");
    }
    
    public Map<String, String> getLoginInfo() {
        return Collections.unmodifiableMap(loginInfo);
    }
}
