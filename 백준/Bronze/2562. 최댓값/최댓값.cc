#include <iostream>

using namespace std;

int main() {
    int max = 0;
    int idx = 0;
    for (int i = 0; i < 9; i++) {
        int a;
        cin >> a;
        if (a > max) {
            max = a;
            idx = i+1;
        }
    }
    cout << max << endl;
    cout << idx << endl;
}