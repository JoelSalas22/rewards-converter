public class RewardValue {
    private final double cashValue;
    private double milesValue;

    // Refactor
    public static final double MILES_TO_CASH_RATE = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

    }

    public RewardValue(int milesValue) {
       this.cashValue =  converToCash(milesValue);
    }

    private static double converToMiles(double cashValue) {
        return (int) (cashValue/MILES_TO_CASH_RATE);
    }

    private static double converToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }

    // Getters and Setters

    public double getCashValue(double miles) {
        return cashValue;
    }

    // refactor
    public double getMilesValue() {
        return converToMiles(this.cashValue);
    }

}