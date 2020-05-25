public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }
    public void eatHeartily() {
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }
    }
    public void addMoney(double amount) {
        if (amount > 0) {
            if ((this.balance + amount <= 150)) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }

        }
    }
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
