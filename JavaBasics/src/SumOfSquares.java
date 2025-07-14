public class SumOfSquares {
    public static void main(String args[]) {
        int n, a, b, c, d, e, f, g, h, v1, v2, v3, v4, sum;
        n = 30;
        a = (n * (n + 1) * (2 * n + 1)) / 6;
        n = 7;
        b = (n * (n + 1) * (2 * n + 1)) / 6;
        v1 = a - b;
        n = 82;
        c = (n*(n+1)*(2*n+1))/6;
        n = 81;
        d = (n*(n+1)*(2*n+1))/6;
        v2 = c-d;
        n = 100;
        e = (n*(n+1)*(2*n+1))/6;
        n = 88;
        f = (n*(n+1)*(2*n+1))/6;
        v3 = e-f;
        n = 41;
        g = (n*(n+1)*(2*n+1))/6;
        n = 26;
        h = (n*(n+1)*(2*n+1))/6;
        v4 = g-h;
        sum = v1+v2+v3+v4;
        System.out.println("Sum of value = "+sum);

    }
}