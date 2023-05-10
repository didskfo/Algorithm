#include "iostream"
#include "map"
#include "string"

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, m;
    cin >> n >> m;
    map<string, int> mp_1;
    map<int, string> mp_2;
    string str;
    int num = 1;
    while (n--) {
        cin >> str;
        mp_1.insert(pair<string, int>(str, num));
        mp_2.insert(pair<int, string>(num, str));
        num++;
    }
    while (m--) {
        cin >> str;
        if (isdigit(str[0])) {
            int key = stoi(str);
            auto item = mp_2.find(key);
            cout << item->second << "\n";
        } else {
            auto item = mp_1.find(str);
            cout << item->second << "\n";
        }
    }
    return 0;
}