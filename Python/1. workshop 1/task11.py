# Дано число из отрезка [10, 99]. Показать наибольшую цифру числа
import random
n = random.randint(10, 99)
print(n)

if n//10 > n % 10:
    print(n//10)
elif n//10 < n % 10:
    print(n % 10)

if n//10 == n % 10:
    print('numbers are equal ')

