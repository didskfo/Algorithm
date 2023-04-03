#include "iostream"
#include "algorithm"

using namespace std;

int main() {
    int x, y, w, h;
    cin >> x >> y >> w >> h;
    int tmp1 = min(w-x, h-y);
    int tmp2 = min(x, y);
    cout << min(tmp1, tmp2);
    return 0;
}