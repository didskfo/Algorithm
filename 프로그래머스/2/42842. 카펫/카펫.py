def solution(brown, yellow):
    answer = []
    cnt = (brown - 4) // 2

    yellow_div = [i for i in range(1, yellow + 1) if yellow % i == 0]

    for i in yellow_div:
        j = yellow // i

        w, h = max(i, j), min(i, j)
        if w * h == yellow and w + h == cnt:
            answer.append(w + 2)
            answer.append(h + 2)
            break;

    return answer