#include "iostream"
#include "deque"

using namespace std;

int main() {
    int n, m, cnt = 0, num, idx;
    cin >> n >> m;
    deque<int> d;
    for (int i = 1; i <= n; i++) {
        d.push_back(i);
    }
    while (m--) {
        cin >> num;
        for (int i = 0; i < d.size(); i++) {
            if (d[i] == num) {
                idx = i;
                break;
            }
        }
        if (idx < d.size() - idx) {
            while (true) {
                if (d.front() == num) {
                    d.pop_front();
                    break;
                }
                cnt++;
                d.push_back(d.front());
                d.pop_front();
            }
        } else {
            while (true) {
                if (d.front() == num) {
                    d.pop_front();
                    break;
                }
                cnt++;
                d.push_front(d.back());
                d.pop_back();
            }
        }
    }
    cout << cnt << "\n";
    return 0;
}