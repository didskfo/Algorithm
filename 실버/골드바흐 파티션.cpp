#include "iostream"

#define N 1000001

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    bool arr[N];
    for(int i=0; i<N; i++) {
        arr[i] = true;
    }
    arr[0] = arr[1] = false;

    for(int i=2; i*i<N; i++) {
        if(arr[i]) {
            for(int j=i*2; j<=N; j+=i) {
                arr[j] = false;
            }
        }
    }
    int n;
    int cnt;
    int num;
    int a, b;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> num;
        cnt = 0;
        for (int j = 0; j <= num/2; j++) {
            a = j;
            b = num-j;
            if (arr[a] && arr[b]) {
                cnt++;
            }
        }
        cout << cnt << "\n";
    }
    return 0;
}