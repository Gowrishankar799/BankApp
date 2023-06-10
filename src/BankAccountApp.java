import java.util.UUID;

public class BankAccountApp implements BankAccountImplement{


    private String name;
    private String accountNo;
    private double balance;
    private String password;
     
    final double rateOfInterest = 0.6;


// Argument (or) Parameterised Constructor
     public BankAccountApp(String name,double balance,String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }
    //Default Constructor
    public BankAccountApp() {
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String fetchBalance(String password) {
        if (this.password.equals(password)) {
            String s = "Your account balance : " + this.balance;
            return s;
        } else {
            String s = "Passwrod is incorrect.";
            return s;
        }
    }

    @Override
    public double addMoney(double balance) {
         this.balance+=balance;
         return this.balance;
    }

    @Override
    public String withdrawMoney(String password,double money) {
         if(this.password.equals(password)){
             if(this.balance>=money){
                 this.balance-=money;
                return "Money has been withdrawn and your account balance is "+ this.balance;
             }
             else {
                 return "Insufficient funds in your account";
             }
         }

        return "Password is not correct";
    }

    @Override
    public String changePassword(String password , String nepassword) {
         if(this.password.equals(password)){
             this.password = nepassword;
             return "New password is set";
         }
         else
             return "password is incorrect";
    }

    @Override
    public double moneyInterest(int year) {
         return (this.balance*year*this.rateOfInterest)/100;

    }
}
