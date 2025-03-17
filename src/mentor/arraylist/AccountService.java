package mentor.arraylist;

import java.util.ArrayList;

public class AccountService {
    public void moneyTransfer(BankAccount bankAccountFrom, BankAccount bankAccountTo, int money) throws Exception {
        if (bankAccountFrom.getAmount()< money) throw new Exception();
        if (!bankAccountFrom.isActive() && !bankAccountTo.isActive()) throw new Exception();
        int amountLeft = bankAccountFrom.getAmount()-money;
        bankAccountFrom.setAmount(amountLeft);
        int amountGot = bankAccountTo.getAmount() + money;
        bankAccountTo.setAmount(amountGot);
    }
    public void returnIfInactive(ArrayList<BankAccount> accountsList) {
        for (BankAccount bankAccount: accountsList) {
            if (!bankAccount.isActive()) {
                System.out.println(bankAccount);
            }
        }
    }
    public void returnAccountById (ArrayList<BankAccount> accountsList, String id) {
        for (BankAccount bankAccount: accountsList) {
            if (bankAccount.getID().equals(id)) {
                System.out.println(bankAccount);
            }
        }
    }
}
