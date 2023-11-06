def solution(nums):
    answer = 0
    dic = {}
    for i in set(nums):
        dic[i] = 0
    for i in nums:
        dic[i] += 1
    if len(dic) >= len(nums)/2:
        answer = len(nums)/2
    else:
        answer = len(dic)
    return answer