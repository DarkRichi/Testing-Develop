package App;

import java.util.HashMap;

public class Account {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    Account(){
        logininfo.put("Chetra","1");
        logininfo.put("Dara","2");

    }
    protected HashMap getlogininfo(){
        return logininfo;
    }
}
