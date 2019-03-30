package binaryseach;

/**
 * Created by AYuraga on 2019-03-30.
 */
public class BinarySeachExample {
    public static int[] sortArray(int numbers[]) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }

    public static int seach(int numbers[], int c) {
        int low = 0;
        int high = numbers.length - 1;

        sortArray(numbers);

        while (low <= high) {
            int mid = (low + high)/2;
            int guess = numbers[mid];
            if (guess == c) {
                return mid;
            }
            if (guess > c) {
                high = mid - 1;
            }
            if (guess < c) {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int numbers[] = {5, 4, 7, 2, 4, 9, 6, 7};
        System.out.println(seach(numbers, 7));
    }
}
