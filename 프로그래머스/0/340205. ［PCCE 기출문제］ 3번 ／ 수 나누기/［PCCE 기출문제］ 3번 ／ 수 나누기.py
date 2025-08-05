number = int(input())

answer = 0

while number > 0: # 숫자가 0보다 크면 계속 반복
    answer += number % 100
    number //= 100

print(answer)