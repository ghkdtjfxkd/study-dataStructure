package sort;

public class Quick_Sort {

    void quickSort(int[] data, int p, int r) {

        if(p<r){
            int q = partition(data, p, r); // 분할, pivot 위치
            quickSort(data, p , q -1); // 왼쪽 부분배열 정렬
            quickSort(data, q + 1 , r); // 오른쪽 부분 배열 정렬
        }
    }

    static int partition (int[] data,int p ,int r){
        // pivot 위치 return
        return -1;
    }
}
