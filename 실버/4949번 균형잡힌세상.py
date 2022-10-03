while True:
    a = input()
    if a == ".":
        break
    lst = []
    res = True 
    for i in a:
        if i == '(' or i == '[':
            lst.append(i)
        elif i == ')':
            if len(lst) == 0 or lst[-1] == '[':
                res = False 
                break 
            elif lst[-1] == '(':
                lst.pop()
        elif i == ']':
            if len(lst) == 0 or lst[-1] == '(':
                res = False 
                break 
            elif lst[-1] == '[':
                lst.pop()
    
    if len(lst) == 0 and res == True:
        print("yes")
    else:
        print("no")