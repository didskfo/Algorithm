from collections import deque
def solution(priorities, location):
    answer = 0
    deq = deque(enumerate(priorities))
    while deq:
        lo, pri = deq.popleft()
        if any(pri < priority for lo, priority in deq):
            deq.append((lo, pri))
        else:   
            answer += 1
            if lo == location:
                return answer