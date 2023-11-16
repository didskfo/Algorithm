def solution(s):
    answer = ''
    check = 0
    for i in range(len(s)):
        if s[i] == ' ':
            check = 0
            answer += " "
            continue 
        check += 1
        if check % 2 == 0:
            answer += s[i].lower()
        else:
            answer += s[i].upper()
    return answer