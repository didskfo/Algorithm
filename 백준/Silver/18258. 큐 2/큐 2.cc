#include "iostream"
#include "queue"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    queue<int> q;
    int n, num;
    string str;
    cin >> n;
    while (n--) {
        cin >> str;
        if (str == "push") {
            cin >> num;
            q.push(num);
        } else if (str == "pop") {
            if (!q.empty()) {
                cout << q.front() << "\n";
                q.pop();
            } else {
                cout << -1 << "\n";
            }
        } else if (str == "size") {
            cout << q.size() << "\n";
        } else if (str == "empty") {
            if (q.empty()) {
                cout << 1 << "\n";
            } else {
                cout << 0 << "\n";
            }
        } else if (str == "front") {
            if (!q.empty()) {
                cout << q.front() << "\n";
            } else {
                cout << -1 << "\n";
            }
        } else {
            if (!q.empty()) {
                cout << q.back() << "\n";
            } else {
                cout << -1 << "\n";
            }
        }
    }
    return 0;
}