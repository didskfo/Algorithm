#include "iostream"
#include "set"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n, m;
    cin >> n >> m;
    set<string> s;
    string str;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        cin >> str;
        s.insert(str);
    }
    for (int i = 0; i < m; i++) {
        cin >> str;
        if (s.find(str) != s.end()) {
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}