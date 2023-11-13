def getMyDivisor(n):
    num = 0
    for i in range(1, int(n**(1/2)) + 1):
        if (n % i == 0):
            num += 1
            if ( (i**2) != n) : 
                num += 1
    
    return num

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        num = getMyDivisor(i)
        if num % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer