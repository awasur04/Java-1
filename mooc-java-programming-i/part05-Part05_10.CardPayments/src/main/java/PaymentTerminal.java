
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            double change = payment - 2.5;
            money += 2.5;
            affordableMeals++;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            double change = payment - 4.3;
            money += 4.3;
            heartyMeals++;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
