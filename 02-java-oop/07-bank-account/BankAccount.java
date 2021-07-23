public class BankAccount{
    private double checkingBalance;
    private double savingBalance;
    public static double numOfAccounts =0;
    public static double totalFunds = 0;

    public double availableCheckingFunds(){
        return this.checkingBalance;
    }

    public double availableSavingFunds(){
        return this.savingBalance;
    }

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingBalance = 0;
        numOfAccounts ++;
    }

    public void addChecking(int addFunds){
        this.checkingBalance += addFunds;
        totalFunds += addFunds;
    }

    public void addSaving(int addFunds){
        this.savingBalance += addFunds;
        totalFunds += addFunds;
    }

    public void withdrawlChecking (int withdrawl){
        if(checkingBalance < withdrawl){
            withdrawl = 0;
            System.out.println("Insufficient Funds");
        }
        this.checkingBalance -= withdrawl;
        totalFunds -= withdrawl;
    }

    public void withdrawlSaving(int withdrawl){
        if(savingBalance < withdrawl){
            withdrawl = 0;
            System.out.println("Insufficient Funds");
        }
        this.savingBalance -= withdrawl;
        totalFunds -= withdrawl;
    }

}