def solution(sizes):
    answer = 0
    width_max = 0
    height_max = 0
    for size in sizes:
        width, height = size
        width_max = max(width_max, width, height)
        height_max = max(height_max, min(width, height))
    answer = width_max*height_max
    return answer