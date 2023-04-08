#include "iostream"
#include "algorithm"

using namespace std;
int card[500001];
int n, m, num;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> card[i];
    }
    sort(card, card+n);
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> num;
        cout << upper_bound(card, card+n, num) - lower_bound(card, card+n, num) << " ";
    }
    return 0;
}