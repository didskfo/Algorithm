t = int(input())
lst = []
for i in range(t):
    lst.append(input())
set_lst = list(set(lst))
sort_lst = []
for i in set_lst:
    sort_lst.append((len(i), i))
sort_lst = sorted(sort_lst)
for len, i in sort_lst:
    print(i)