#include "iostream"
#include "cmath"

using namespace std;

int main() {
    int s, e;
    cin >> s >> e;
    bool b;
    for (int i = s; i <= e; i++) {
        b = true;
        if (i == 1) {
            b = false;
        } else {
            for (int j = 2; j <= ::sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
        }
        if (b) {
            cout << i << endl;
        }
    }
    return 0;
}

// 시간초과