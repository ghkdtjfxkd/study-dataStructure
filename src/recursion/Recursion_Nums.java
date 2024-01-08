package recursion;

public class Recursion_Nums {
    public static void main(String[] args) {

    }

    public static void func01(int k) {
        if(k <= 0 ){
            return;
        }
        else {
            System.out.println("hello");
            func01(k-1);
        }
    }

    private static int func02(int n) {
        if(n <= 0)  //n = 0 이라면 합은 0 이다.
            return 0;
        else {
            return n + func02(n-1);
        }
    }

    // factorial

    private static int factorial (int n) {
        if(n == 0)
            return 1;
        else {
            return n * factorial(n-1);
        }
    }

    // fibonacci

    private static int fibonacci (int n) {
        if(n < 2)
            return 0;
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Euclid Method

    private static double gcd01 (int m , int n) {
        if(m < n) {
            int tmp = m; n = tmp;
        }   // m 과 n 을 뒤바꾼다 swap
        if(m % n == 0)
            return  n;
        else {
            return gcd01(n, m % n);
        }
    }

    private static int gcd02 (int p , int q) {
        if(q == 0)
            return p;
        else {
            return gcd02(q, p % q);
        }
    }




}
