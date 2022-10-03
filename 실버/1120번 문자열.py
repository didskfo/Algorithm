# a, b = map(str, input().split())
# cnt = 0

# if len(a) == len(b):
#     for i in range(len(a)):
#         if a[i] != b[i]:
#             cnt += 1
#     print(cnt)

# elif a in b:
#     print(0)

# else:
#     ans = []
#     for i in range(len(b)-len(a)):
#         for j in range(len(a)):
#             if a[j] != b[i+j]:
#                 cnt += 1
#             ans.append(cnt)
#     print(min(ans))

a, b = map(str, input().split())
ans = []

for i in range(len(b)-len(a)+1):
    cnt = 0
    for j in range(len(a)):
        if a[j] != b[i+j]:
            cnt += 1
    ans.append(cnt)
print(min(ans))