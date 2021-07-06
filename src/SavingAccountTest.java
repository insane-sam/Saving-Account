
public class SavingAccountTest {
    public static void main(String args[]){
        
    
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
    
        saver1.setSavingsBalance(2000.00);
    
        SavingsAccount.modifyinterestrate(0.04);
        saver1.calculatemonthlyinterest();
        System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());

    }     
}
