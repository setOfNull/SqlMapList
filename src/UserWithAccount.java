import java.math.BigDecimal;

public class UserWithAccount {
    private int id;
    private String login;
    private String email;
    private String account_number;
    private BigDecimal currency;

    public UserWithAccount() {
    }

    @Override
    public String toString() {
        return "UserWithAccount {" +
                "Login='" + login + '\'' +
                ", Email='" + email + '\'' +
                ", Account Number='" + account_number + '\'' +
                ", Currency=" + currency +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }
}
