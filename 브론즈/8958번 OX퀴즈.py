t = int(input())
for i in range(t):
    lst = list(input())
    res = 0
    a = 0
    for j in range(len(lst)):
        if j > a or j == 0:
            cnt = 0
            if lst[j] == "O":
                while lst[j] == "O":
                    cnt += 1
                    res += 1*cnt
                    j += 1
                    a = j 
                    if j == len(lst):
                        break 
    print(res)