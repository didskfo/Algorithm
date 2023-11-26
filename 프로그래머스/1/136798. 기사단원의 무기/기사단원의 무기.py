def getMyDivisor(n):
    cnt = 0
    for i in range(1, int(n**(1/2)) + 1):
        if (n % i == 0):
            cnt += 1
            if ( (i**2) != n) : 
                cnt += 1    
    return cnt

def solution(number, limit, power):
    answer = 0
    lst = [i for i in range(1, number+1)]
    for i in lst:
        cnt = getMyDivisor(i)
        if cnt > limit:
            answer += power
        else:
            answer += cnt
    return answer