a = int(input())
b = int(input())
c = int(input())

num = list(str(a*b*c))

count = [0 for i in range(10)]

for j in num:
    count[int(j)] += 1

for s in count:
    print(s)