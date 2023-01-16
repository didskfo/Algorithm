#include <iostream>

using namespace std;

int main() {
    while(1) {
        int a, b;
        cin >> a;
        cin >> b;
        if (a == 0 && b == 0) {
            break;
        }
        cout << a + b << endl;
    }
    return 0;
}