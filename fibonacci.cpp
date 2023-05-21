#include <iostream>
using namespace std;

// Fibonacci sonlari uchun rekursiv funksiya
int fibonacci(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1 || n == 2) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int main() {
    int n;
    cout << "Fibonacci sonlari uchun tartib raqamini kiriting: ";
    cin >> n;

    cout << "Fibonacci sonlari: ";
    for (int i = 1; i <= n; i++) {
        cout << fibonacci(i) << " ";
    }

    return 0;
}
