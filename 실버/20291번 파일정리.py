import sys 
input = sys.stdin.readline 

n = int(input())
file = dict()
for _ in range(n):
    extend = (input().split("."))[1]
    if not extend in file:
        file[extend] = 1 
    else:
        file[extend] += 1 

sorted_file = sorted(file.items())

for key, value in sorted_file:
    print(key.rstrip(), value)