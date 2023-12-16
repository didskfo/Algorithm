def solution(s, skip, index):
    answer = ''
    alphabet = sorted(set("abcdefghijklmnopqrstuvwxyz")-set(skip))
    al_len = len(alphabet)
    
    for i in s:
        answer += alphabet[(alphabet.index(i)+index)%al_len]
    return answer