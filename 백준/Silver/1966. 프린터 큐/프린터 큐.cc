#include "iostream"
#include "queue"

using namespace std;

int main() {
    int t, n, m, wei, cnt;
    cin >> t;
    while (t--) {
        cnt = 0;
        queue<pair<int, int> > q;
        priority_queue<int> pq;
        cin >> n >> m;
        for (int i = 0; i < n; i++) {
            cin >> wei;
            q.push(make_pair(i, wei));
            pq.push(wei);
        }
        while (!q.empty()) {
            int idx = q.front().first;
            int val = q.front().second;
            q.pop();
            if (pq.top() == val) {
                pq.pop();
                cnt++;
                if (idx == m) {
                    cout << cnt << endl;
                    break;
                }
            } else {
                q.push(make_pair(idx, val));
            }
        }
    }
    return 0;
}