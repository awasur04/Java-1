public class Fitbyte {
    private int heartRate;
    private int age;

    public Fitbyte(int tAge, int tHeart) {
        this.age = tAge;
        this.heartRate = tHeart;
    }

    public double targetHeartRate(double percentOfMax) {
        Double maxHeart = 206.3 - (0.711 * this.age);
        return ((maxHeart - heartRate) * (percentOfMax) + heartRate);
    }
}
