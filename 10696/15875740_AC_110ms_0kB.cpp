#include <bits/stdc++.h>
using namespace std;

int f91(int n) {
    if (n >= 101) return n - 10;
    else return f91(f91(n + 11));
}

int main() {
    int n;
    while(scanf("%d", &n) == 1 && n != 0) {
        printf("f91(%d) = %d\n", n, f91(n));
    }
    return 0;
}
