#include "iostream"
#include "queue"

using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    queue<int> q;
    queue<int> res;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    while (!q.empty()) {
        for (int i = 0; i < k-1; i++) {
            q.push(q.front());
            q.pop();
        }
        res.push(q.front());
        q.pop();
    }
    cout << "<";
    while (!res.empty()) {
        if (res.size() == 1) {
            cout << res.front() << ">";
            res.pop();
        } else {
            cout << res.front() << ", ";
            res.pop();
        }
    }
    return 0;
}