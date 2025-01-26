package org.example;

public class Power {

    public long naivePower(long x, long n)
    {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return x * naivePower(x, n-1);
    }

    public long unoptimizedDCPower(long x, long n)
    {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(n % 2 == 0){
            return unoptimizedDCPower(x, n / 2) * unoptimizedDCPower(x, n / 2);
        } else {
            return x * unoptimizedDCPower(x, n / 2) * unoptimizedDCPower(x, n / 2);
        }
    }

    public long optimizedDCPower(long x, long n)
    {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        long temp = optimizedDCPower(x, n/2);
        if(n % 2 == 0){
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args)
    {
        Power power = new Power();

        long result = power.naivePower(3, 10000);
        System.out.println(result);
    }
}