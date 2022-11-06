n = int(input())

def func(num):
    for i in range(num+1):
        str_num = str(i)
        hap = i 
        for j in range(len(str_num)):
            hap += int(str_num[j])
        if hap == num:
            return i 
    return 0

print(func(n))