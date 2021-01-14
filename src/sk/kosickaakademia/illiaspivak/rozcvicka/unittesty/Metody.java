package sk.kosickaakademia.illiaspivak.rozcvicka.unittesty;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Metody {
    public static int fibonacciSum (int n){
        if(n<1)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int n0 = 1;
        int n1 = 1;
        int n2;
        int sum = 2;
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            sum=sum+n2;
            n0=n1;
            n1=n2;
        }
        return sum;
    }
    public static int getFactorial(int f) {
        if(f<0) return 0;
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static int reverseNumber(int number) {
        if (number < 0) {
            return -reverseNumber(-number);
        }
        int answer = 0;
        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            answer = answer * 10 + digit;
        }
        return answer;
    }
}
