import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountApp bank = new BankAccountApp("venu",1000,"abc123");
        System.out.println(bank.fetchBalance("abc123"));
        System.out.println(bank.addMoney(100));
        System.out.println(bank.changePassword("abc123","abc1233"));
        System.out.println(bank.fetchBalance("abc1233"));
        System.out.println(bank.getAccountNo());
        System.out.println(bank.withdrawMoney("abc1233",100));
        System.out.println("add Numbner of years of interest");
       // int years = sc.nextInt();
       //System.out.println(bank.moneyInterest(years));


    }
}
