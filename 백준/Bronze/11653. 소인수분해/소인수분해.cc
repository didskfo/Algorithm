#include "iostream"

using namespace std;

int main() {
    int a;
    cin >> a;
    while (a != 1) {
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                cout << i << endl;
                a /= i;
            }
        }
    }
    return 0;
}