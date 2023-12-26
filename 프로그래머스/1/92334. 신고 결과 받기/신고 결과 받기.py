def solution(id_list, report, k):
    report = set(report)
    dic = {i:{"who":set(), "mail":0} for i in id_list}
    for i in report:
        i = i.split()
        dic[i[1]]["who"].add(i[0])
        
    for i in dic:
        if len(dic[i]["who"])>=k:
            for who in dic[i]["who"]:
                dic[who]["mail"]+=1
    
    answer = [i["mail"] for i in dic.values()]
    return answer