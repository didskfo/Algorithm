def solution(n, arr1, arr2):
    answer = []
    lst1 = []
    lst2 = []
    for i in arr1:
        lst1.append(format(i, 'b').zfill(n))
    for i in arr2:
        lst2.append(format(i, 'b').zfill(n))
    for i in range(n):
        num1 = lst1[i]
        num2 = lst2[i]
        wall = ""
        for j in range(n):
            if num1[j] == "1" or num2[j] == "1":
                wall += "#"
            else:
                wall += " "
        answer.append(wall)
    return answer