import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, -2, 9, 0, 3};
        quickSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{3,8,2,7,1};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr) {
        // ���� ������ ������ ��� �� ������ ��������, �� ������ �� ������.
        if (arr.length < 2) return;
        // ����� (� ������� ������ ������ ��������) ��������� ����������.
        sort(arr, 0, arr.length - 1);
    }

    // � ���������� ���������� ������ � �������� ��������, � ������� ����� �������� ���������� ���������.
    // leftBorder - ������ �������, ������������ ������ ��������� ����������.
    // rightBorder - ������ �������, ������������ ����� ��������� ����������.
    private static void sort(int[] arr, int leftBorder, int rightBorder) {
        // ������ � �������� �������� ��������� ������� �� ��������� ���������.
        int pivot = arr[leftBorder + (int) (Math.random() * (rightBorder - leftBorder + 1))];
        // ������������� ��������� �� ���������� �������.
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        // ��������� �������� ���� ��������� �� ������ ����� ���� ��������.
        while (leftMarker <= rightMarker) {
            // ������� ����� ��������� ������ �� �������� �������� ��� ������� ��������.
            // ����� ������� ����� �� ��������� �������� �������� ������ ��������.
            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }
            // ������� ������ ��������� ����� �� �������� �������� ��� ������� ��������.
            // ����� ������� ������ �� ��������� �������� �������� ������ ��������.
            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }
            // ���� ��������� ����������� �� ������ ��������, ������ �� ������� � ������� ���������.
            // ���� ��������� ����������� �� ���� �������, �� ������ ������� ��.
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = arr[leftMarker];
                    arr[leftMarker] = arr[rightMarker];
                    arr[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        // �� ������ �� ����� ����� ��������� ��������� ������ �������.
        // ����� ������� ������������ ��� ���������������� ���������:
        //  �� leftBorder �� rightMarker - �������� ������ �������� (pivot)
        //  �� leftMarker �� rightBorder - �������� ������ ��������
        // ���� � ������ ���������� ���� ������ ������ ��������,
        // �� ���������� ��������� � ��� ����������.
        if (rightMarker > leftBorder) {
            sort(arr, leftBorder, rightMarker);
        }
        if (leftMarker < rightBorder) {
            sort(arr, leftMarker, rightBorder);
        }
    }
}
