
public class HealthStation {

        private int totalWeighings;

    public int weigh(Person person) {
        totalWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int tempWeight = person.getWeight();
        person.setWeight(tempWeight + 1);
    }

    public int weighings() {
        return totalWeighings;
    }

}
