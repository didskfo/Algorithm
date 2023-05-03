#include "iostream"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    int idx;
    int arr[10001] = {0};
    for (int i = 0; i < n; i++) {
        cin >> idx;
        arr[idx]++;
    }
    for (int i = 0; i < 10001; i++) {
        for (int j = 0; j < arr[i]; j++) {
            cout << i << "\n";
        }
    }
    return 0;
}