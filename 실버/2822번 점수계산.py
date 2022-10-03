import sys 
input = sys.stdin.readline

lst = []
hap = 0
big = []
res = []
for _ in range(8):
    lst.append(int(input()))

sorted_lst = sorted(lst, reverse=True)

for i in range(5):
    big.append(sorted_lst[i])

for i in big:
    hap += i
    res.append(lst.index(i))
    
res.sort()

print(hap)
for i in res:
    print(i+1, end=" ")