import java.util.*;

public class FinancialForecasting {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of past values: ");
        int n = obj.nextInt();
        double pastValues[] = new double[n];
        for (int i = 0; i < n; i++) {
            pastValues[i] = obj.nextDouble();
        }

        int periodsToPredict = obj.nextInt();

        double futureValue = predictFutureValue(pastValues, periodsToPredict);
        System.out.println("Predicted future value: " + futureValue);
    }

    public static double predictFutureValue(double[] pastValues, int periodsToPredict) {
        if (periodsToPredict == 0) {
            return pastValues[pastValues.length - 1];
        }
        double growthRate = calculateGrowthRate(pastValues);

        double previousValue = predictFutureValue(pastValues, periodsToPredict - 1);
        System.out.println(previousValue * (1 + growthRate));
        return previousValue * (1 + growthRate);
    }

    public static double calculateGrowthRate(double[] pastValues) {
        int n = pastValues.length;
        if (n < 2) {
            return 0;
        }
        double totalGrowthRate = 0;
        for (int i = 1; i < n; i++) {
            double growthRate = (pastValues[i] / pastValues[i - 1]) - 1;
            totalGrowthRate += growthRate;
        }

        return totalGrowthRate / (n - 1);
    }
}
