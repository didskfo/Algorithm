#include "iostream"
#include "queue"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    queue<int> q;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    while (q.size() > 1) {
        q.pop();
        int a = q.front();
        q.pop();
        q.push(a);
    }
    cout << q.front();
    return 0;
}