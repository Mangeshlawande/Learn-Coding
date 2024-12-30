#include <iostream>
using namespace std;

bool isPrime(int num) {
    if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
    for (int i = 2; i * i <= num; i++) { // Check for factors up to the square root of num
        if (num % i == 0) return false; // Found a factor, so it's not prime
    }
    return true; // No factors found, so it's prime
}

void printPrimes(int n) {
    for (int i = 2; i <= n; i++) { // Start from 2 as 1 is not prime
        if (isPrime(i)) {
            cout << i << "\n"; // Print the prime number
        }
    }
    cout << endl; // New line after printing all primes
};

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    printPrimes(n);
    return 0;
}