#include "iostream"
#include "cmath"

using namespace std;

bool is_prime(long int a) {
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
    ios::sync_with_stdio(false);
    int arr[200000];
    long int n;
    int cnt;
    int idx = 0;
    for (long int i = 2; i <= 246912; i++) {
        if (is_prime(i)) {
            arr[idx++] = i;
        }
    }
    while (true) {
        cin >> n;
        cnt = 0;
        if (n == 0) {
            break;
        }
        for (long int j = 0; j < idx; j++) {
            if (arr[j] > n && arr[j] <= 2*n) {
                cnt++;
            }
        }
        cout << cnt << "\n";
    }
    return 0;
}