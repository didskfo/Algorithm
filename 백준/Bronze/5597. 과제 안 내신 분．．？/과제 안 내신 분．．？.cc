#include <iostream>

using namespace std;

int main() {
    int stu[31] = {1};
    for (int i = 0; i < 28; i++) {
        int a;
        cin >> a;
        stu[a] = 1;
    }
    for (int i = 0; i < 31; i++) {
        if (stu[i] == 0) {
            cout << i << endl;
        }
    }
    return 0;
}