import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException, LoginException, NoSuchAlgorithmException {
        DB_CONNECT db = new DB_CONNECT();
        db.DB_Connect();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Choose IIN or LOGIN:register enter 1 IIN enter 2 LOGIN ");
        int c = sc.nextInt();
        Menu menU=new Menu(c);
        menU.makeChoose();
    }

}