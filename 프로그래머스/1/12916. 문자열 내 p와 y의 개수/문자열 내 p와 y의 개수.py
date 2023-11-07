def solution(s):
    num = 0
    s = s.lower()
    for i in range(len(s)):
        if s[i] == 'p':
            num += 1
        elif s[i] == 'y':
            num -= 1
    if num == 0:
        return True
    return False
