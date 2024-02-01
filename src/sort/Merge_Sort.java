package sort;

import java.util.Arrays;

public class Merge_Sort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 8, 2, 3, 7, 9};
        System.out.println(Arrays.toString(arr));

        merge(arr, 0, 4, 8);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] data, int p, int q, int r) {
        int i = p, j = q + 1, k = p;
        int tmp[] = new int[data.length];

        // 배열을 나눌 때 두 배열은 각각 정렬이 되어 있어야 한다.
        while (i <= q && j <= r) {
            if (data[i] <= data[j]) {
                tmp[k++] = data[i++];
            } else {
                tmp[k++] = data[j++];
            }
        }
        // 두 배열 중 하나의 배열은 새 배열에 정렬을 끝내면 while 문을 빠져나온다.

        while (i <= q) {
            tmp[k++] = data[i++];
        }
        while (j <= r) {
            tmp[k++] = data[j++];
        }
        // 남아 있는 배열을 새 배열에 넣는 과정. 두 while문 중에서 하나의 while문만 실행된다.

        for (i = p; i <= r; i++) {
            data[i] = tmp[i];
        }
        // 새 배열(임시 배열) 데이터를 다시 기본 배열에 데이터를 옮겨주는 과정

    }
}

