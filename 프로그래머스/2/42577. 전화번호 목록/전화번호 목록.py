# def solution(phone_book):
#     answer = True
#     phone_book.sort()
#     for i in range(len(phone_book)-1):
#         if phone_book[i] == phone_book[i+1][:len(phone_book[i])]:
#             return False
#     return answer

def solution(phone_book):
    dic = {}
    for num in phone_book:
        dic[num] = 1
    for num in phone_book:
        tmp = ""
        for i in num:
            tmp += i
            if tmp in dic and tmp != num:
                return False
    return True
