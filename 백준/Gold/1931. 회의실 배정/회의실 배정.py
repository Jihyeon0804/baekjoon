n = int(input())
s = []
for i in range(n):
    one, two = map(int, input().split())
    s.append([one, two])
s = sorted(s, key=lambda a:a[0])
s = sorted(s, key=lambda a:a[1])
last = 0
cnt = 0
for i, j in s:
    if i >= last:
        cnt += 1
        last = j
print(cnt)