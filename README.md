# ![java](java-logo.png) Реализации на Java алгоритмов из книги Адитья Бхаргава "Грокаем алгоритмы"

## Алгоритмы

| Название                                  |
|:------------------------------------------|
| [Бинарный поиск](#бинарный-поиск)         |
| [Сортировка выбором](#сортировка-выбором) |

  
---

## Бинарный поиск

Поиск элемента в отсортированном массиве.
Осуществляется делением массива пополам.
Искомое значение сравнивается с элементом в середине массива, 
в зависимости от результата отбрасывается половина элементов 
и операции повторяются в оставшейся половине, пока не будет найден элемент 
или не закончится массив.  

Сложность по времени: O(log(n))

```java
public class BinarySearch {
    public static int binarySearch(int[] array, int k) {
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
```

**[⬆ Back to Top](#алгоритмы)**

---

## Сортировка выбором

Сортировка путем поиска минимального элемента, перестановки его в начало 
и повторения этих операций с оставшимися элементами, пока не останется один элемент.  

Сложность по времени: O($n^2$)

```java
import java.util.Arrays;

public class SelectionSort {
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
```

**[⬆ Back to Top](#алгоритмы)**

---

