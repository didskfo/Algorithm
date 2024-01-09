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
