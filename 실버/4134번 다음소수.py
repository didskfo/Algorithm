# n = int(input())
# for i in range(n):
#     a = int(input())
#     er = 0
#     if a > 1:
#         while 1:
#             for j in range(2,a):
#                 if a % j == 0:
#                     er += 1 

#             if er != 0:
#                 a += 1
#                 continue
#             else:
#                 print(a)          
#                 break

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

n = int(input())
for _ in range(n):
    a = int(input())
    while True:
        if is_prime(a):
            print(a)
            break 
        else:
            a += 1