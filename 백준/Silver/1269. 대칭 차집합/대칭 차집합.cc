#include "iostream"
#include "algorithm"
#include "vector"
#include "set"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, m;
    cin >> n >> m;
    set<int> A;
    set<int> B;
    set<int> res;
    int num;
    for (int i = 0; i < n; i++) {
        cin >> num;
        A.insert(num);
    }
    for (int i = 0; i < m; i++) {
        cin >> num;
        B.insert(num);
    }
    for (auto i = A.begin(); i != A.end(); i++) {
        if (B.find(*i) == B.end()) {
            res.insert(*i);
        }
    }
    for (auto i = B.begin(); i != B.end(); i++) {
        if (A.find(*i) == A.end()) {
            res.insert(*i);
        }
    }
    cout << res.size();
    return 0;
}