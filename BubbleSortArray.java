public class BubbleSortArray {
    public static int[] array = {7, 2, 3, 15, 5, 0, 8, 1, 9, 99};

    public static void bubbleSort(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array is sorted!");
    }

    public static void main(String[] args) {
        bubbleSort(array);
    }
}
