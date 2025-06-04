package InterviewPreparation;

public class CandleProblem {
    public static void main(String[] args) {
        int initialCandles = 7;
        int candlesBurned = 4;
        int candlesProduced = 1;

        int candlesLeft = initialCandles;
        while (candlesLeft >= candlesBurned) {
            int remainingCandlesAfterBurn = candlesLeft - candlesBurned;
            candlesLeft = remainingCandlesAfterBurn + candlesProduced;
        }

        System.out.println("Candles left burning at the end: " + candlesLeft);
    }
}
