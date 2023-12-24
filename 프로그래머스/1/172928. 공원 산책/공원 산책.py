def solution(park, routes):
    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == "S":
                x, y = j, i
    
    for route in routes:
        route = route.split(" ")
        check = True
        if route[0] == "S":
            if y+int(route[1]) >= len(park):
                continue
            for i in range(int(route[1])):
                if park[y+(i+1)][x] == "X":
                    check = False
                    continue
            if check:
                y += int(route[1])
        if route[0] == "N":
            if y-int(route[1]) < 0:
                continue
            for i in range(int(route[1])):
                if park[y-(i+1)][x] == "X":
                    check = False
                    continue
            if check:
                y -= int(route[1])
        if route[0] == "W":
            if x-int(route[1]) < 0:
                continue
            for i in range(int(route[1])):
                if park[y][x-(i+1)] == "X":
                    check = False
                    continue
            if check:
                x -= int(route[1])
        if route[0] == "E":
            if x+int(route[1]) >= len(park[0]):
                continue
            for i in range(int(route[1])):
                if park[y][x+(i+1)] == "X":
                    check = False
                    continue
            if check:
                x += int(route[1])
    answer = [y, x]
    return answer