import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{5, -2, 0, 12, 5, -9, 16, 2})));
        System.out.println(Arrays.toString(selectionSort(new int[]{95, 32, 18, 0, -5, -9})));
        System.out.println(Arrays.toString(selectionSort(new int[]{95, -9})));
        System.out.println(Arrays.toString(selectionSort(new int[]{95})));
        System.out.println(Arrays.toString(selectionSort(new int[0])));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
