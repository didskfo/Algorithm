import sys 
input = sys.stdin.readline 

lst = []
cnt = 0

while 1:
    try:
        num_lst = input()
        if num_lst == -1:
            break 
        else:
            num_s = num_lst.split()
            for i in num_s:
                if cnt != 0:
                    print(i)
                    # i = int(str(i)[::-1])
                    # lst.append(i)
                cnt += 1
    except EOFError:
        break 
# lst.remove(0)
# ans = sorted(lst)
# for i in ans:
#     print(i)