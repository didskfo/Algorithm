import sys
input = sys.stdin.readline

def merge_sort(arr):
    if len(arr) == 1:
        return arr
    
    mid = (len(arr)+1)//2
    
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    
    l, r = 0, 0
    arr2 = []
    while l < len(left) and r < len(right):
        if left[l] < right[r]:
            arr2.append(left[l])
            ans.append(left[l])
            l+=1
        else:
            arr2.append(right[r])
            ans.append(right[r])
            r+=1
    while l < len(left):
        arr2.append(left[l])
        ans.append(left[l])
        l+=1
    while r < len(right):
        arr2.append(right[r])
        ans.append(right[r])
        r+=1
        
    return arr2
            
n, k = map(int, input().split())
a = list(map(int, input().split()))
ans = []
merge_sort(a)

if len(ans) >= k:
    print(ans[k-1])
else:
    print(-1)