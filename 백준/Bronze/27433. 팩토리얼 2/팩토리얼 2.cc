#include "iostream"

using namespace std;

long int fac(long int a) {
    if (a <= 1) {
        return 1;
    } return a * fac(a-1);
}

int main() {
    long int n, ans;
    cin >> n;
    ans = fac(n);
    cout << ans << "\n";
    return 0;
}