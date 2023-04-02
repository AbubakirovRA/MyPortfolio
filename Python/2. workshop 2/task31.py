# Составить список простых множителей натурального числа N
# https://www.pythonpool.com/prime-factorization-python/

import math

def prime_factors(num):
    while num % 2 == 0: #even number divisible
        print (2)
        num = num / 2
    for i in range(3, int(math.sqrt(num+1)), 2): #n became odd
        while num % i == 0:
            print (i)
            num = num / i
    if num > 2:
        print(int(num))

    # for i in range(2, num + 1):
    #     if num % i == 0:
    #         count = 1
    #         h = (i//2 + 1)
    #         for j in range(2, h):
    #             if i % j == 0:
    #                 count = 0
    #                 break
    #         if count == 1:
    #             print(i)

num = int(input("Enter the number for calculating the prime factors :\n"))
prime_factors(num)
