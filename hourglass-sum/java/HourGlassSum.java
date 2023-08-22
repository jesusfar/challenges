import java.util.List;

public class HourGlassSum {
    public static int hourglassSum(List<List<Integer>> arr) {
        int row = 0;
        int col = 0;
        int skip = 0;
        int sum = 0;
        int maxSum = -63;

        while (row < 4) {
            while (col < 4) {
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        skip++;
                        if (skip == 4 || skip == 6) {
                            continue;
                        }
                        sum += arr.get(i).get(j);
                    }
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = 0;
                skip = 0;
                col++;
            }
            col = 0;
            row++;
        }

        return maxSum;
    }
}
