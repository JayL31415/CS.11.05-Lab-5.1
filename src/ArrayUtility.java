public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }



    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        double avg = (double) sum / array.length;
        return Math.floor(avg * 100) / 100;

    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximum(int[] array){
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

    public static int evenCount(int[] array) {
                int count = 0;
                for (int num : array) {
                    if (num % 2 == 0) {
                        count++;
                    }
                }
                return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int number : array) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String string : array) {
            if (str.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                result.append(array[i]);
                if (i < array.length - 1) {
                    result.append(", ");
                }
            }
            return result.toString();
        }


    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastLetter = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastLetter;

    }

    public static void shiftLeft(int[] array) {
        int firstLetter = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstLetter;
    }



    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }


}
