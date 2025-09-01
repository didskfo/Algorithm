#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    if (N == 1) {
        cout << 9;
        return 0;
    }
    int num = 3;
    int res = 3;
    for (int i = 1; i < N; i++) {
        res += num-1;
        num = res;
    }
    cout << res * res;
    return 0;
}