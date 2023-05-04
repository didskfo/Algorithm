#include "iostream"
#include "algorithm"
#include "vector"

using namespace std;

bool comp(string s1, string s2) {
    if (s1.length() == s2.length()) {
        return s1 < s2;
    }
    return s1.length() < s2.length();
}

int main() {
    int n;
    cin >> n;
    vector<string> arr;
    string str;
    for (int i = 0; i < n; i++) {
        cin >> str;
        if (find(arr.begin(), arr.end(), str) == arr.end()) {
            arr.push_back(str);
        }
    }
    sort(arr.begin(), arr.end(), comp);
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << "\n";
    }
    return 0;
}