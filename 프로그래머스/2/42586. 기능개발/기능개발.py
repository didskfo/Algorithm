def solution(progresses, speeds):
    answer = []
    
    while progresses:
        
        for i, spd in enumerate(speeds):
            progresses[i] += spd
            
        cnt = 0
        
        while progresses and progresses[0] >= 100:
            progresses.pop(0)
            speeds.pop(0)
            # del progresses[0], speeds[0]
            cnt += 1
        
        if cnt > 0:
            answer.append(cnt)
    return answer