import sys 
input = sys.stdin.readline 

n = int(input())
lst = list(map(int, input().split()))
m = int(input())
res = list(map(int, input().split()))
dic = {}
for num in lst:
    if num in dic:
        dic[num] += 1
    else:
        dic[num] = 1

for i in res:
    result = dic.get(i)
    if result == None:
        print(0, end=" ")
    else:
        print(result, end=" ")