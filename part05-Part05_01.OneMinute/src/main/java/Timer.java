public class Timer {
    private int seconds;
    private int mSeconds;

    public Timer() {
        this.mSeconds = 0;
        this.seconds = 0;
    }

    public void advance() {
        this.mSeconds++;
        if (this.mSeconds >= 100) {
            this.mSeconds = 0;
            if (this.seconds < 60) {
                this.seconds++;
            } else {
                this.seconds = 0;
            }
        }
    }

    public String toString() {
        if (this.seconds < 10) {
            if (this.mSeconds < 10) {
                return "0" + this.seconds + ":0" + this.mSeconds;
            } else {
                return "0" + this.seconds + ":" + this.mSeconds;
            }
        } else {
            if (this.mSeconds < 10) {
                return this.seconds + ":0" + this.mSeconds;
            } else {
                return this.seconds + ":" + this.mSeconds;
            }
        }
    }
}
