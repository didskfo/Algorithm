#include <iostream>

using namespace std;

int main() {
    int black[6] = {1, 1, 2, 2, 2, 8};
    int white[6];
    int res[6];
    for (int i = 0; i < 6; i++) {
        cin >> white[i];
        res[i] = black[i] - white[i];
    }
    for (int i : res) {
        cout << i << " ";
    }
    return 0;
}
