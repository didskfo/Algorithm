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
    int n;
    long long int num;
    cin >> n;
    for (int q = 0; q < n; q++) {
        cin >> num;
        while (true) {
            if (is_prime(num)) {
                break;
            } else {
                num++;
            }
        }
        cout << num << endl;
    }
    return 0;
}