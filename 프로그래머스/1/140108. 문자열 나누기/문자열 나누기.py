def solution(s):
    answer = 0
    first = ""
    cnt1 = 0
    cnt2 = 0
    
    for i in s:
        if first == "":
            first = i
            cnt1 += 1
            continue
        if first == i:
            cnt1 += 1
        else:
            cnt2 += 1
            
        if cnt1 == cnt2:
            answer += 1
            first = ""
            cnt1 = 0
            cnt2 = 0
    if first != "":
        answer += 1
    return answer