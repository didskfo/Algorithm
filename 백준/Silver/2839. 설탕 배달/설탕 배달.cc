#include "iostream"

using namespace std;

int main() {
    int n;
    cin >> n;
    int answer = 0;
    if (n % 5 == 0) {
        answer = n / 5;
        cout << answer << "\n";
    } else {
        while (n > 0) {
            n -= 3;
            answer++;
            if (n % 5 == 0) {
                answer += n/5;
                cout << answer << "\n";
                break;
            } else if (n == 1 || n == 2) {
                cout << -1 << "\n";
                break;
            } else if (n == 0) {
                cout << answer << "\n";
                break;
            }
        }
    }

    return 0;
}