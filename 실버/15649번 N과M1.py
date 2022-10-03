from itertools import permutations

n, m = map(int, input().split())
lst = [i for i in range(1, n+1)]
ans = list(permutations(lst, m))
for i in ans:
    for j in i:
        print(j, end=" ")
    print()