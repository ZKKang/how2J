package javamiddle.javaexception.example;

public class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);

        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt > this.balance + overdraftProtection) {
            double deficit = amt - (this.balance + overdraftProtection);
            throw new OverdraftException("透支额度超标", deficit);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) {
        //开户存了1000块，拥有500的透支额度
        CheckingAccount a = new CheckingAccount(1000, 500);
        //存了1000
        a.deposit(1000);
        //查询余额
        System.out.println(a.getBalance());
        try {
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
        } catch (OverdraftException e) {
            System.err.println("透支超额:"+e.getDeficit());
            e.printStackTrace();
        }

    }
}
