package App;

public class App {
    public static void main(String[] args){
        Account account = new Account();

        Login login = new Login(account.getlogininfo());

    }
}
