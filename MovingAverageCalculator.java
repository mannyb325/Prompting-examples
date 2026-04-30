import java.util.ArrayList;
import java.util.List;

/**
 * A utility class that calculates the moving average of a list of numbers.
 *
 * <p>A moving average smooths out data by averaging each group of consecutive
 * values within a fixed-size "window" that slides across the data.</p>
 */
public class MovingAverageCalculator {

    /**
     * Calculates the moving average of a list of numbers.
     *
     * <p>For each position in the list (up to the last valid window),
     * this method sums the values in the window and divides by the window size.</p>
     *
     * @param data       the list of numbers to process (must not be null or empty)
     * @param windowSize the number of elements to include in each average (must be positive
     *                   and no greater than the size of {@code data})
     * @return a new list containing one average per window position
     * @throws IllegalArgumentException if {@code windowSize} is less than or equal to 0,
     *                                  or if {@code windowSize} is greater than {@code data.size()}
     */
    public static List<Double> movingAverage(List<Double> data, int windowSize) {

        // Validate: window size must be a positive number
        if (windowSize <= 0) {
            throw new IllegalArgumentException("Window size must be positive");
        }

        // Validate: window size cannot be larger than the data itself
        if (windowSize > data.size()) {
            throw new IllegalArgumentException("Window size must not be greater than data length");
        }

        // This list will hold all the computed averages
        List<Double> averages = new ArrayList<>();

        // Slide the window from the start to the last valid position
        // (len(data) - window_size + 1) positions total, same as in Python
        for (int i = 0; i <= data.size() - windowSize; i++) {

            // Sum up all values in the current window
            double sum = 0.0;
            for (int j = i; j < i + windowSize; j++) {
                sum += data.get(j);
            }

            // Compute the average for this window and add it to results
            double avg = sum / windowSize;
            averages.add(avg);
        }

        return averages;
    }

    /**
     * Demonstrates how to use {@code movingAverage} with a sample dataset.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Sample data matching the Python example: [1, 2, 3, 4, 5, 6]
        List<Double> data = new ArrayList<>();
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        data.add(5.0);
        data.add(6.0);

        int windowSize = 3;

        // Calculate the moving averages
        List<Double> result = movingAverage(data, windowSize);

        // Print the result — expected output: [2.0, 3.0, 4.0, 5.0]
        System.out.println("Data:        " + data);
        System.out.println("Window size: " + windowSize);
        System.out.println("Averages:    " + result);
    }
}
