package Ex;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrValue = new int[n];
        for (int i = 0; i < n; i++) {
            arrValue[i] = scanner.nextInt();
        }
    }

    public static int outputValues(int[] array) {
        int result = 0, tempResult = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 2 || array[i] == 3) {
                temp = 0;
            } else {
                switch (array[i]) {
                    case 4:
                        temp += 1;
                        break;
                    case 5:
                        tempResult += 1;
                        temp += 1;
                        break;
                }
            }
            if (temp == 7) {
                if (result < tempResult) {
                    result = tempResult;
                }
            }

        }
        if (result == 0) {
            return -1;
        } else {
            return result;
        }
    }
}