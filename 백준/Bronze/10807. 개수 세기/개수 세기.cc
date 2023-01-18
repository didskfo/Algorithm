#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int cnt = 0;
    int arr[n];
    int idx = 0;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        arr[idx] = a;
        idx++;
    }
    int v;
    cin >> v;
    for (int i = 0; i < n; i++) {
        if (arr[i] == v){
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}