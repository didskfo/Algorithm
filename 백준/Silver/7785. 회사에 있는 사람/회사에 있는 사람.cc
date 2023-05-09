#include "iostream"
#include "set"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string name, check;
    int n;
    cin >> n;
    set<string> s;
    for (int i = 0; i < n; i++) {
        cin >> name >> check;
        if (check == "enter") {
            s.insert(name);
        } else {
            s.erase(name);
        }
    }
    for (auto i = s.rbegin(); i != s.rend(); i++) {
        cout << *i << "\n";
    }
    return 0;
}