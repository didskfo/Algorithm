from itertools import permutations

def solution(k, dungeons):
    answer = -1
    for p in permutations(dungeons, len(dungeons)):
        cnt = 0
        ph = k
        for dungeon in p:
            if ph >= dungeon[0]:
                cnt += 1
                ph -= dungeon[1]
        if answer < cnt:
            answer = cnt
    return answer