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
        // ≈сли массив пустой или из одного элемента, то ничего не далаем.
        if (arr.length < 2) return;
        // »наче (в массиве больше одного элемента) выполн€ем сортировку.
        sort(arr, 0, arr.length - 1);
    }

    // ¬ параметрах передаетс€ массив и диапазон индексов, в котором нужно провести сортировку элементов.
    // leftBorder - индекс массива, определ€ющий начало диапазона сортировки.
    // rightBorder - индекс массива, определ€ющий конец диапазона сортировки.
    private static void sort(int[] arr, int leftBorder, int rightBorder) {
        // «адаем в качестве опорного случайный элемент из заданного диапазона.
        int pivot = arr[leftBorder + (int) (Math.random() * (rightBorder - leftBorder + 1))];
        // ”станавливаем указатели на переданные границы.
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        // ¬ыполн€ем операции пока указатели не прошли через весь диапазон.
        while (leftMarker <= rightMarker) {
            // ƒвигаем левый указатель вправо до элемента большего или равного опорному.
            // “аким образом слева от указател€ остаютс€ элементы меньше опорного.
            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }
            // ƒвигаем правый указатель влево до элемента меньшего или равного опорному.
            // “аким образом справа от указател€ остаютс€ элементы больше опорного.
            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }
            // ≈сли указатели установлены на разные элементы, мен€ем их местами и двигаем указатели.
            // ≈сли указатели установлены на один элемент, то только двигаем их.
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
        // Ќа выходе из цикла левый указатель находитс€ правее правого.
        // “аким образом определ€ютс€ два непересекающихс€ диапазона:
        //  от leftBorder до rightMarker - элементы меньше опорного (pivot)
        //  от leftMarker до rightBorder - элементы больше опорного
        // ≈сли в данных диапазонах есть больше одного элемента,
        // то рекурсивно выполн€ем в них сортировку.
        if (rightMarker > leftBorder) {
            sort(arr, leftBorder, rightMarker);
        }
        if (leftMarker < rightBorder) {
            sort(arr, leftMarker, rightBorder);
        }
    }
}
