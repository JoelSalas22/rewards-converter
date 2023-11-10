public class RewardValue {
    private double cash;
    private double miles;


    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    // Getters and Setters

    public double getCashValue(double miles) {
        this.cash = miles * (0.0035);
        return this.cash;
    }

    public double getMilesValue() {
        this.miles = (this.cash / 0.0035);
        return (int) this.miles;
    }

}