def solution(k, score):
    answer = []
    record = []
    for i in score:
        if len(record) >= k:
            if min(record) < i:
                record.sort()
                record[0] = i
                answer.append(min(record))
            else:
                answer.append(min(record))
        else:
            record.append(i)
            answer.append(min(record))
    return answer