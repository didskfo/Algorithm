def solution(babbling):
    answer = 0
    babb = ["aya", "ye", "woo", "ma"]
    for i in babbling:
        for j in babb:
            if j*2 not in i:
                i = i.replace(j, " ")
        if i.strip() == "":
            answer+=1
    return answer