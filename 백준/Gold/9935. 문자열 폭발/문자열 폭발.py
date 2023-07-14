str = input()
bomb = input()

char = bomb[-1]
stack = []
leng = len(bomb)

for i in str:
    stack.append(i)
    if i == char and ''.join(stack[-leng:]) == bomb:
        del stack[-leng:]
    
answer = ''.join(stack)

if answer == '':
    print('FRULA')
else:
    print(answer)