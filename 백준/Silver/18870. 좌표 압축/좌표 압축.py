n = int(input())
lst_1 = list(map(int, input().split()))
lst_2 = sorted(set(lst_1))

dic = {lst_2[i] : i for i in range(len(lst_2))}

for i in lst_1:
    print(dic[i], end=" ")