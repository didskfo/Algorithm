def solution(cards1, cards2, goal):
    idx1, idx2 = 0, 0
    for i in range(len(goal)):
        if idx1 < len(cards1) and goal[i] == cards1[idx1]:
            idx1 += 1
            continue
        if idx2 < len(cards2) and goal[i] == cards2[idx2]:
            idx2 += 1
            continue
        return "No"
    return "Yes"