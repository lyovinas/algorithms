# ![java](java-logo.png) Реализации на Java алгоритмов из книги Адитья Бхаргава "Грокаем алгоритмы"

## Алгоритмы

| Название                          |
|:----------------------------------|
| [Бинарный поиск](#бинарный-поиск) |

  
---

## Бинарный поиск

Поиск элемента в отсортированном массиве.
Сложность: O(log(n))

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

**[⬆ Back to Top](#Алгоритмы)**

---
