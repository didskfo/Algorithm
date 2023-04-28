#include "iostream"
#include "cmath"
#include "vector"
#include "algorithm"

using namespace std;

int cnt[8001];
int main() {
    int n;
    cin >> n;
    int arr[n];
    vector<int> v;
    int max = 0;
    double sum = 0;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        sum += arr[i];
        if (arr[i] >= 0)
            cnt[arr[i]]++;
        else
            cnt[abs(arr[i]) + 4000]++;
    }
    sort(arr,arr+n);
    int avg, cen, most, range;
    avg = round(sum / n);
    cen = arr[n/2];
    for (int i = 0; i < 8001; i++) {
        if (cnt[i] > max) {
            max = cnt[i];
        }
    }
    for (int i = 0; i < 8001; i++) {
        if (max == cnt[i]) {
            if (i <= 4000) {
                v.push_back(i);
            } else {
                v.push_back((i-4000)*(-1));
            }
        }
    }
    sort(v.begin(), v.end());
    if (v.size() == 1) {
        most = v[0];
    } else {
        most = v[1];
    }
    range = arr[n-1] - arr[0];
    cout << avg << "\n" << cen << "\n" << most << "\n" << range << "\n";
    return 0;
}