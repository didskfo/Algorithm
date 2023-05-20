#include "iostream"
#include "cmath"

using namespace std;

bool is_prime(long long int a) {
    if (a == 0 || a == 1) {
        return false;
    }
    for (int i = 2; i < (int)sqrt(a)+1; i++) {
        if (a % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    long long int n, m;
    cin >> n >> m;
    for (long long int i = n; i <= m; i++) {
        if (is_prime(i)) {
            cout << i << "\n";
        }
    }
    return 0;
}