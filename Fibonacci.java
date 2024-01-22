package jProj.accJava.semana1;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci.fibo(i) + " ");
        }        
    }
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
