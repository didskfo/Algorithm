#include "iostream"
#include "set"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n, m;
    cin >> n >> m;
    set<string> lis;
    set<string> see;
    set<string> s;
    string str;
    for (int i = 0; i < n; i++) {
        cin >> str;
        lis.insert(str);
    }
    for (int i = 0; i < m; i++) {
        cin >> str;
        see.insert(str);
    }
    for (auto i = lis.begin(); i != lis.end(); i++) {
        if (see.find(*i) != see.end()) {
            s.insert(*i);
        }
    }
    cout << s.size() << "\n";
    for (auto i = s.begin(); i != s.end(); i++) {
        cout << *i << "\n";
    }
    return 0;
}