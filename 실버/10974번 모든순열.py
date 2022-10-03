from itertools import permutations

n = int(input())
lst = [i for i in range(1, n+1)]

res = list(permutations(lst, n))

for i in res:
    for j in i:
        print(j, end=" ")
    print()