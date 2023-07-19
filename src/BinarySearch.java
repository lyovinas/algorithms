public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-5,-2,0,1,5,9,16,24}, 1));
        System.out.println(binarySearch(new int[]{-5,-2,0,1,5,9,16,24}, 2));
        System.out.println(binarySearch(new int[]{-5,-2,0,1,5,9,16,24}, 16));
        System.out.println(binarySearch(new int[]{-5,-2,0,1,5,9,16,24}, -3));
    }

    private static int binarySearch(int[] array, int k) {
        if (array.length == 0) return -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int x = array[middle];
            if (x == k) return middle;
            if (x < k) low = ++middle;
            else high = --middle;
        }
        return -1;
    }
}
