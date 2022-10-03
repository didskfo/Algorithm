import sys 
input = sys.stdin.readline 

n = int(input())
lst = []
for _ in range(n):
    lst.append(int(input()))
dic = {x : lst.count(x) for x in set(lst)}
sorted(dic)
freq = []
for i in dic:
    if dic[i] == max(dic.values()):
        freq.append(i)
print(sorted(freq)[0])