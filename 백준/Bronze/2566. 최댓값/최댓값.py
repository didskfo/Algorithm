import sys 
input = sys.stdin.readline 

num_lst = []
for _ in range(9):
    num_lst.append(list(map(int, input().split())))

max = -1 
idx_i = -1
idx_j = -1

for i in range(9):
    for j in range(9):
        if num_lst[i][j] > max:
            max = num_lst[i][j]
            idx_i = i+1
            idx_j = j+1

print(max)
print(idx_i, idx_j)