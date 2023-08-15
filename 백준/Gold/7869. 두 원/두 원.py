import sys 
input = sys.stdin.readline
import math

x1, y1, r1, x2, y2, r2 = map(float, input().split())

if math.sqrt(math.pow((x2-x1), 2)+math.pow((y2-y1), 2)) > r1+r2:
    ans = 0
elif math.sqrt(math.pow((x2-x1), 2)+math.pow((y2-y1), 2)) <= abs(r1-r2):
    ans = math.pi * (math.pow(min(r1,r2), 2))
else:
    d = math.sqrt(math.pow((x2-x1), 2)+math.pow((y2-y1), 2))
    a = math.acos((d*d+r1*r1-r2*r2)/(d*r1*2))*2
    b = math.acos((d*d+r2*r2-r1*r1)/(d*r2*2))*2
    ans = (a * r1 * r1 + b * r2 * r2 - r1 * r1 * math.sin(a) - r2 * r2 * math.sin(b)) * 0.5
    
print("%0.3f" %ans)