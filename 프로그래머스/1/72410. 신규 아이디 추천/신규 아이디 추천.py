def solution(new_id):
    new_id = new_id.lower()
    string = ""
    for i in new_id:
        if i.isalpha() or i.isdigit() or i == "-" or i == "_" or i == ".":
            if i == "." and len(string) > 0 and string[-1] == ".":
                continue
            string += i
    if string[0] == "." and len(string) == 1:
        string = ""
    else:
        if string[0] == ".":
            string = string[1:]
        if string[-1] == ".":
            string = string[:-1]
    if len(string) == 0:
        string = "a"
    if len(string) >= 16:
        string = string[:15]
        if string[0] == ".":
            string = string[1:]
        if string[-1] == ".":
            string = string[:-1]
    while len(string) < 3:
        string += string[-1]
    
    print(string)
    return string