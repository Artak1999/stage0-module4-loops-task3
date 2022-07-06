package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n = 0, m = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(n);
            int sum = n + m;
            n = m;
            m = sum;
        }
    }
}
