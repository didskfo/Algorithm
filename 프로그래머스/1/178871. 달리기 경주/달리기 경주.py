def solution(players, callings):
    player = {name: i for i, name in enumerate(players)}
    
    for i in callings:
        win_idx = player[i]
        roser = players[win_idx-1]
        players[win_idx-1] = i
        player[i] = win_idx-1
        players[win_idx] = roser
        player[roser] = win_idx
        
    return players