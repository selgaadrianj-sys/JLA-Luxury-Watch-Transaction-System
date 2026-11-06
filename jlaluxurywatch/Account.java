package jlaluxurywatch;

public class Account {
    public static final String ADMIN = "Admin";
    public static final String CASHIER = "Cashier";

    private String username;
    private String password;
    private String role;
    private String fullName;

    public Account(String username, String password, String role, String fullName) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getFullName() { return fullName; }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean checkPassword(String typedPassword) {
        return password.equals(typedPassword);
    }
}
