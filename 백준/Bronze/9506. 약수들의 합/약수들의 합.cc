#include "iostream"
#include "string"

using namespace std;

int main() {
    int n = 0;
    int sum;
    string answer;
    while (n != -1) {
        cin >> n;
        if (n == -1) {
            break;
        }
        sum = 0;
        answer = to_string(n) + " = ";
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                answer += to_string(i);
                answer += " + ";
            }
        }
        if (n == sum) {
            answer = answer.substr(0, answer.length()-2);
            cout << answer << endl;
        } else {
            cout << n << " is NOT perfect." << endl;
        }
    }

    return 0;
}