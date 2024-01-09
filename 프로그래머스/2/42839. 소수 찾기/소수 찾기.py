import math
from itertools import permutations

def is_prime(x):  
    for i in range(2, int(x**0.5)+1):
        if x % i == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    num = list(numbers)
    num_lst = []
    for i in range(1, len(num)+1):
        num_lst += list(permutations(num, i))
    lst = []
    for i in num_lst:
        lst.append(int(''.join(i)))
    lst = list(set(lst))
    
    for i in lst:
        if i <= 1:
            continue
        elif is_prime(i):
            answer += 1
    
    return answer

# def solution(numbers):
#     answer = 0
#     n = list(numbers)

#     a = []
#     for i in range(1, len(n)+1):
#         a += list(permutations(n, i))   #경우의 수 반환

#     b = []
#     for i in a:
#         b.append(int(''.join(i)))   
#     b = list(set(b))    #경우의 수를 int형으로 담은 배열 b 선언

#     for i in b:
#         if i <= 1:
#             continue    #1 이하면 무시
#         elif is_prime(i):   # 소수면
#             answer += 1     # answer 증가

#     return answer