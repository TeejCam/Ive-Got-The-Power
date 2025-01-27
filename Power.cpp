#include <iostream>
using namespace std; 


    long int naivePower(long int x, long int n)
    {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return x * naivePower(x, n-1);
    }

    long int unoptimizedDCPower(long int x, long int n)
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

    long int optimizedDCPower(long int x, long int n)
    {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        long int temp = optimizedDCPower(x, n/2);
        if(n % 2 == 0){
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    int main()
    {
        long int result = (2, 1000000);
        cout << result;
    }