public interface BankAccountImplement {
    String fetchBalance(String password);
    double addMoney(double money);
    String withdrawMoney(String password, double money);
    String changePassword(String password,String nepassword);
    double moneyInterest(int years);
}
