from math import factorial
import sys
input = sys.stdin.readline 

n, k = map(int, input().split())
res = factorial(n) // (factorial(k)*factorial(n-k))
print(res%10007)