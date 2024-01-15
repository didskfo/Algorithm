def solution(numbers, target):
    global answer
    answer = 0
    def dfs(cnt, sum_num):
        global answer
        if cnt == len(numbers):
            if sum_num == target:
                answer += 1
            return answer
        dfs(cnt+1, sum_num+numbers[cnt])
        dfs(cnt+1, sum_num-numbers[cnt])
    dfs(0, 0)
    return answer

