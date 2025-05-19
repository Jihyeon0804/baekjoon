a = 1000-int(input())
coins = [500, 100, 50, 10, 5, 1]
cnt = 0
for coin in coins:
    cnt += a//coin
    a %= coin
    continue
print(cnt)
    
    