import itertools
import math

def primenumber(x):
    for i in range(2, int(math.sqrt(x)+1)):
    	if x % i == 0:	
        	return False
    return True	

def solution(nums):
    answer = 0
    npr = itertools.combinations(nums, 3)
    for a, b, c in list(npr):
        if primenumber(a+b+c):
            answer+=1
    return answer