n = int(input())
lst = [2]
a = 3
while len(lst) < n:
    er = 0
    for i in range(2,a):
        if a % i == 0:
            continue
    lst.append(a)
    a += 1
            

print(lst)
print(lst[-1])