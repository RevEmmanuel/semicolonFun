package classTask.Level2;

public class Level2 {

    public static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        int[] sortedBothArrays = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                sortedBothArrays[k++] = array1[i++];
            } else {
                sortedBothArrays[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            sortedBothArrays[k++] = array1[i++];
        }
        while (j < array2.length) {
            sortedBothArrays[k++] = array2[j++];
        }
        return sortedBothArrays;
    }

    public static int convertToInt(int newNumber) {
        int sum = 0;
        int counter = 0;
        for (int length = String.valueOf(newNumber).length(); length != 0; newNumber /= 10) {
            int r = newNumber % 10;
            int decimal = r * (int) Math.pow(2,  counter);
            sum += decimal;
            counter++;
            length--;
        }
        return sum;
    }

    public static double[] productOfAllElements(double[] initialList) {
        double[] result = new double[initialList.length];
        for (int i = 0; i < result.length; i++) {
            double multiply = 1;
            for (int j = 0; j < initialList.length; j++) {
                if (i == j) continue;
                multiply *= initialList[j];
            }
            result[i] = multiply;
        }
        return result;
    }

    public static int nonRepeatingNumber(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int digit = numbers[i];
            boolean exists = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (digit == numbers[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result = digit;
                break;
            }
        }
        return result;
    }

    public static int[] rightRotate(int[] digits) {
        int[] result = new int[digits.length];
        result[0] = digits[digits.length - 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }

    public static int[] rearrangePositiveNegative(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return digits;
    }


}
