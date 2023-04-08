#include "iostream"
#include "climits"
#include "algorithm"
#include "utility"

using namespace std;

string arr[50];

string WB[8] = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
};
string BW[8] = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
};

int WB_cnt(int x, int y) {
    int cnt = 0;
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (arr[x+i][y+j] != WB[i][j]) {
                cnt++;
            }
        }
    }
    return cnt;
}

int BW_cnt(int x, int y) {
    int cnt = 0;
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (arr[x+i][y+j] != BW[i][j]) {
                cnt++;
            }
        }
    }
    return cnt;
}

int main() {
    int n, m;
    int min_val = INT_MAX;
    int cnt;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i + 8 <= n; i++) {
        for (int j = 0; j + 8 <= m; j++) {
            cnt = min(WB_cnt(i, j), BW_cnt(i, j));
            if (cnt < min_val) {
                min_val = cnt;
            }
        }
    }
    cout << min_val;
    return 0;
}