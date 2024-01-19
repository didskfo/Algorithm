from collections import deque 

def solution(prices):
    answer = []
    prices_que = deque(prices)
    
    while prices_que:
        price = prices_que.popleft()
        cnt = 0
        
        for p in prices_que:
            cnt += 1
            if price > p:
                break
        answer.append(cnt)
    return answer