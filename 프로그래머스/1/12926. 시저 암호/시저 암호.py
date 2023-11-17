def solution(s, n):
    answer = ''
    lst = list(s)
    for i in lst:
        if i == " ":
            answer += " "
            continue
        if 65 <= ord(i) <= 90:
            if ord(i)+n > 90:
                answer += chr(ord(i)+n-26)
            else:
                answer += chr(ord(i)+n)
        elif 97 <= ord(i) <= 122:
            if ord(i)+n > 122:
                answer += chr(ord(i)+n-26)
            else:
                answer += chr(ord(i)+n)
    return answer