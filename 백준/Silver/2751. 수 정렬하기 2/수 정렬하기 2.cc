#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int n;
    cin >> n;
    int num[n];
    int a;
    for (int i = 0; i < n; i++) {
        cin >> a;
        num[i] = a;
    }
    sort(num, num+n);
    for (int i = 0; i < n; i++) {
        cout << num[i] << '\n';
    }
    return 0;
}