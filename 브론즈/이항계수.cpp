#include "iostream"

using namespace std;

int fac(int a) {
    int num = 1;
    for (int i = 1; i <= a; i++) {
        num *= i;
    }
    return num;
}

int main(){
    int n, k;
    cin >> n >> k;
    cout << fac(n) / (fac(k) * fac(n-k));
    return 0;
}