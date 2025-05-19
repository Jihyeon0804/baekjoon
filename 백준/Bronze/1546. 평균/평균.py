n = int(input())
lst = list(map(int, input().split()))
max = max(lst)
for i in range(n):
        lst[i] = lst[i]/max*100
print(sum(lst)/n)