import sys 
input = sys.stdin.readline 

s = int(input())
lst = list(map(int, input().split()))
n = int(input())
status = [] 
for i in range(n):
    status.append(list(map(int, input().split())))

for i in status:
    if i[0] == 1:
        for j in range(s):
            if (j + 1) % i[1] == 0: 
                lst[j] = int(not lst[j]) 
    else:
        for j in range(s):
            if (j + 1) == i[1]: 
                plus = j + 1 
                minus = j - 1   
                lst[j] = int(not lst[j]) 

                while True:
                    if minus >= 0 and plus < s: 
                        if lst[minus] == lst[plus]: 
                            lst[minus] = int(not lst[minus])  
                            lst[plus] = int(not lst[plus])  
                        else:  
                            break 
                    else: 
                        break 

                    minus -= 1 
                    plus += 1 

count = 0  
while count < s:

    print(lst[count], end=" ")
    if count % 20 == 19:
        print()
    count += 1