
public class SavingsAccount {
    static double annualinterestrate;
    private double savingbalance;
    
    public SavingsAccount(){
        annualinterestrate=0;
        savingbalance=0;
    }
    public void SavingsAccount(double intrate,double savbal){
        annualinterestrate=intrate;
        savingbalance=savbal;
    }
    public double calculatemonthlyinterest(){
        double intrate = (savingbalance*annualinterestrate)/12;
        savingbalance=savingbalance+intrate;
        return intrate;
    }
    public static void modifyinterestrate(double newintrate){
        annualinterestrate=newintrate;
        
        
    }
    public void setSavingsBalance(double newBal) {
        savingbalance = newBal;
    }
     public double getSavingsBalance() {
        return savingbalance;
    }
    public double getAnnualInterestRate() {
        return annualinterestrate;
    }

    static class modifyinterestrate {

        public modifyinterestrate() {
        }
    }
        

}
