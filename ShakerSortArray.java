public class ShakerSortArray {
    public static int[] array = {7, 2, 3, 15, 5, 0, 8, 1, 9, 99, 84, 56, 71, 63, 48};

    public static void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int temp;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            left++;
            for (int i = right; i >= left; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (Integer i : array) System.out.print(i + " ");

        System.out.println();
        System.out.println("Array is sorted!");
    }

    public static void main(String[] args) {
        sort(array);
    }
}
