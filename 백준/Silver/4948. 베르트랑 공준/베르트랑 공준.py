import math 
import sys 
input = sys.stdin.readline 

def is_prime(x):
    if x == 0 or x == 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True 

prime_list = []

for i in range(2, 246912):
    if is_prime(i):
        prime_list.append(i)
        
while 1:
    n = int(input())
    cnt = 0
    if n == 0:
        break 
    else:
        for i in prime_list:
            if n < i <= 2*n:
                cnt += 1
        print(cnt)