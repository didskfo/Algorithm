#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    int C;
    for (int i = 0; i < T; i++) {
        cin >> C;
        vector<int> v;
        v.push_back(C/25);
        C %= 25;
        v.push_back(C/10);
        C %= 10;
        v.push_back(C/5);
        C %= 5;
        v.push_back(C);
        for (int num : v) {
            cout << num << " ";
        }
        cout << '\n';
    }
    return 0;
}