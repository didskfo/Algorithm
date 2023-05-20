#include "iostream"
#include "map"
#include "string"
#include "algorithm"
#include "vector"
#include "utility"

using namespace std;

bool comp(pair<int, string> a, pair<int, string> b){
    if (a.first == b.first) {
        if (a.second.length() == b.second.length()) {
            return a.second < b.second;
        } else {
            return a.second.length() > b.second.length();
        }
    } else {
        return a.first > b.first;
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, m;
    string str;
    cin >> n >> m;
    map<string, int> words;
    while (n--) {
        cin >> str;
        if (str.length() >= m) {
            words[str]++;
        }
    }
    vector<pair<int, string> > sortedwords;
    for (auto a : words) {
        sortedwords.push_back(make_pair(a.second, a.first));
    }
    sort(sortedwords.begin(), sortedwords.end(), comp);
    for (auto a : sortedwords) {
        cout << a.second << "\n";
    }
    return 0;
}