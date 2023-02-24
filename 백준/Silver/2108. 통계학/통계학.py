import sys
input = sys.stdin.readline 
from collections import Counter 

n = int(input())
lst = []
for i in range(n):
    lst.append(int(input()))
lst.sort()
sum_ = sum(lst)

print(round(sum_/n))
print(lst[n//2])
max = Counter(lst).most_common()
if len(max) > 1:
    if max[0][1] == max[1][1]:
        print(max[1][0])
    else:
        print(max[0][0])
else:
    print(max[0][0])
print(lst[-1]-lst[0])