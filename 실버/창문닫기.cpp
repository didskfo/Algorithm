#include "iostream"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    long long int n;
    int cnt = 0;
    cin >> n;
    int num = 1;
    while (num * num <= n) {
        cnt++;
        num++;
    }
    cout << cnt;
    return 0;
}