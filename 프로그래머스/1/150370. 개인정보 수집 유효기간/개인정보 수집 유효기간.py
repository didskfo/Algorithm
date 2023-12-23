def solution(today, terms, privacies):
    answer = []
    dic = {}
    for i in terms:
        i = i.split()
        dic[i[0]] = int(i[-1])
    today = [int(j) for j in today.split(".")]
    num = 0
    
    for i in privacies:
        num += 1
        m = dic[i[-1]]
        i = i[:-2].split(".")
        i = [int(j) for j in i]
        if m >= 12:
            i[0] += m//12
            i[1] += m%12
        else:
            i[1] = i[1] + m
        if i[1] > 12:
            i[0] += i[1]//12
            i[1] = i[1]%12
        print(i)
            
        if today[0] > i[0]:
            answer.append(num)
        elif today[0] < i[0]:
            continue
        else:
            if today[1] > i[1]:
                answer.append(num)
            elif today[1] < i[1]:
                continue
            else:
                if today[2] >= i[2]:
                    answer.append(num)    
        
    return answer