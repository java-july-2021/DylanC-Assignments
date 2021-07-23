public class BankAccountTest{
    public static void main (String[] args){
        BankAccount DylansAccount = new BankAccount();

        DylansAccount.addChecking(500);
        DylansAccount.addSaving(500);

        DylansAccount.withdrawlChecking(700);
        DylansAccount.withdrawlSaving(300);

        System.out.println(DylansAccount.availableCheckingFunds());
        System.out.println(DylansAccount.availableSavingFunds());    
    
        System.out.println(totalFunds);
    }
}