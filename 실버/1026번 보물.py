# b 재배열함
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a = sorted(a)
b = sorted(b)
b = list(reversed(b))
ans = 0
for i in range(n):
    ans += a[i]*b[i]
print(ans)

# b 재배열 안하고 풀기
# n = int(input())
# a = list(map(int, input().split()))
# b = list(map(int, input().split()))
# ans = 0
# for i in  range(n):
#     s += min(a)*max(b)
#     a.pop(a.index(min(a)))
#     b.pop(b.index(max(b)))
# print(ans)