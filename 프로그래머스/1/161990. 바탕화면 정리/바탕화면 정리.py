def solution(wallpaper):    
    min_x = 51
    min_y = 51
    max_x = -1
    max_y = -1
    
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[0])):
            if wallpaper[i][j] == "#":
                min_x = min(min_x, j)
                min_y = min(min_y, i)
                max_x = max(max_x, j+1)
                max_y = max(max_y, i+1)
    answer = [min_y, min_x, max_y, max_x]
    return answer