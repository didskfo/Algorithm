#include <iostream>
using namespace std;

int main() {
    string N;
    int B, answer = 0;
    cin >> N >> B;
    for (int i = 0; i < N.length(); i++) {
        char cur = N[i];
        if (cur >= '0' && cur <= '9') {
            answer = answer*B + (cur-'0');
        } else {
            answer = answer*B + (cur-'A'+10);
        }
    }
    cout << answer;
    return 0;
}