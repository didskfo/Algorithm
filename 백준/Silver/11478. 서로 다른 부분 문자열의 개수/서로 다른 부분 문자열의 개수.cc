#include "iostream"
#include "set"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string str;
    string substring;
    cin >> str;
    set<string> res;
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < str.length(); j++) {
            substring = str.substr(i, j);
            res.insert(substring);
        }
    }
    cout << res.size();
    return 0;
}