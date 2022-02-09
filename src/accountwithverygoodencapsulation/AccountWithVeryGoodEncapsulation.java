
package accountwithverygoodencapsulation;

/**
 *
 * @author pawelstradomski
 */
public class AccountWithVeryGoodEncapsulation {

    public AccountWithVeryGoodEncapsulation(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public int getAccountBalance()
    {
        return this.accountBalance;
    }
    public void deposit(int amountToDeposit)
    {
        if(amountToDeposit > 0)
        {
            this.accountBalance += amountToDeposit;
        }
        else
        {
            throw new IllegalArgumentException("Kwota do wplaty - amountToDeposit musi byc wieksza od zera");
        }
    }
    public void withdraw(int amountToWithdraw)
    {
        if(amountToWithdraw <= 0) throw new IllegalArgumentException("Kwota do wyplaty - amountToWithdraw musi byc wieksza od zera");
        if(accountBalance - amountToWithdraw > 0)
        {
            this.accountBalance -= amountToWithdraw;
        }
        else
        {
            throw new RuntimeException("Nie masz pieniedzy na koncie");
        }
        
    }
    private final int accountNumber;
    private int accountBalance;
    
    

    
    public static void main(String[] args) {
        AccountWithVeryGoodEncapsulation kontoBankowe = new AccountWithVeryGoodEncapsulation(611020);
        kontoBankowe.deposit(150);
        kontoBankowe.withdraw(45);
        System.out.println("Twoj stan konta" + " " +kontoBankowe.getAccountBalance());
    }
    
}
