def solution(keymap, targets):
    answer = []
    for target in targets:
        cnt = 0
        ok = True
        for al in target:
            idx = 101
            for key in keymap:
                if key.find(al) != -1:
                    idx = min(idx, key.find(al))
            if idx == 101:
                ok = False
                break
            else:
                cnt += idx+1
        if ok:
            answer.append(cnt) 
        else:
            answer.append(-1)
    return answer