from collections import defaultdict

def solution(genres, plays):
    answer = []
    dic1 = defaultdict(list)
    dic2 = defaultdict(int)
        
    for i, (genre, play) in enumerate(zip(genres, plays)):
        dic1[genre].append((i, play))
        dic2[genre] += play
    
    for (genre, total) in sorted(dic2.items(), key=lambda x:-x[1]):
        for (i, play) in sorted(dic1[genre], key=lambda x:-x[1])[:2]:
            answer.append(i)
    
    return answer