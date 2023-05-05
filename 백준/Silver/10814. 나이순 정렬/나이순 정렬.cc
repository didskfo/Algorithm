#include "iostream"
#include "algorithm"
#include "vector"
#include "string"

using namespace std;

bool comp(pair<int, string> a, pair<int, string> b) {
    return a.first < b.first;
}

int main() {
    int n;
    cin >> n;
    vector<pair<int, string> > vec;
    int age;
    string name;
    while (n--) {
        cin >> age >> name;
        vec.push_back(make_pair(age, name));
    }
    stable_sort(vec.begin(), vec.end(), comp);
    for (int i = 0; i < vec.size(); i++) {
        cout << vec[i].first << " " << vec[i].second << "\n";
    }
    return 0;
}