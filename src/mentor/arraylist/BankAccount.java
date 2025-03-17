package mentor.arraylist;

public class BankAccount {
    private String ID;
    private String name;
    private int amount;
    private boolean isActive;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
