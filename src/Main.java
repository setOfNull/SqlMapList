import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "n550490162";
    static final String QUERY = "SELECT login, email, account_number, currency FROM users join users_account on users.id=users_account.id";



    public static void main(String[] args) {

        List<UserWithAccount> accountNumber = new ArrayList<>();
        HashMap<String, BigDecimal> mapp = new LinkedHashMap<>();

        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = conn.createStatement();
        ) {

            ResultSet rs= stmt.executeQuery(QUERY);
            while(rs.next()){
                UserWithAccount user = new UserWithAccount();
                user.setLogin(rs.getString(("login")));
                user.setEmail(rs.getString(("email")));
                user.setCurrency(rs.getBigDecimal(("currency")));
                user.setAccount_number(rs.getString(("account_number")));
                System.out.println(user);
                accountNumber.add(user);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        for(UserWithAccount userWithAccount: accountNumber){
            String login = userWithAccount.getLogin();
            BigDecimal currency = userWithAccount.getCurrency();

            mapp.put(login, currency);
            System.out.println("Login: " + login + " Currency: " + currency);
        }
    }
}
