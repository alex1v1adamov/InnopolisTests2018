package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class QuickSortUnit {

    private static void printArray(Integer[] array) {
        Arrays.stream(array).forEach(i -> {
            if (i < 10) System.out.print(i + "  ");
            else System.out.print(i + " ");
        });
        System.out.println();
    }

    private static void quickSort(Integer[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex, array);
    }

    private static void doSort(int start, int end, Integer[] array) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, array);
        doSort(cur + 1, end, array);
    }

    public static void main(String[] args) {

        Integer ARRAY_LENGTH = 20;
        Integer[] array = new Integer[ARRAY_LENGTH];

        Random random = new Random();
        for (int i = 0; i < ARRAY_LENGTH; i++) array[i] = random.nextInt(100);

        printArray(array);
        quickSort(array);
        printArray(array);
    }
}