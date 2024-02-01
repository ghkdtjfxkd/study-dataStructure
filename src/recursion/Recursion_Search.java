package recursion;

public class Recursion_Search {
    public static void main(String[] args) {

    }

    // 순차 탐색 sequential search

    int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }// 암시적 매개변수



    int search2(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == data[begin]) {
            return begin;
        } else
            return search2(data, begin + 1, end, target);
    }// 매개변수의 명시화


    int search3(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == data[begin]) {
            return begin;
        } else
            return search3(data, begin, end-1, target);
    }// 다른 버젼

    int search4(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else{
            int middle = (begin + end) / 2;
            if(data[middle] == target){
                return middle;
            }
            int index = search4(data , begin ,middle -1, target);
            if(index != -1){
                return index;
            }else return search4(data, middle + 1 , end , target);
        }
    }// 다른 버젼


}
