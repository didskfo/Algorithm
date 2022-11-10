from itertools import permutations
from math import factorial

n, k = map(int, input().split())
lst = [i for i in range(1, n+1)]
ans = list(permutations(lst, k))
print(int(len(ans) / factorial(k)))