# 16. Задать список из n чисел последовательности (1+1/n)**n
# и вывести на экран их сумму

def sequence(n):
    list=[]
    i = 1
    sum = 0
    while i <= n:
        list.append(round((1+1/i)**i, 2))
        sum = sum + round((1+1/i)**i, 2)
        i += 1
    return list, sum

print(sequence(5))