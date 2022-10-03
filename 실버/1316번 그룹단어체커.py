import sys 
input = sys.stdin.readline 

n = int(input())
cnt = 0
for _ in range(n):
    word = input()
    error = 0
    for i in range(len(word)-1):
        if word[i] != word[i+1]:
            dword = word[i+1:]
            if dword.count(word[i]) > 0:
                error += 1
    if error == 0:
        cnt += 1
print(cnt)