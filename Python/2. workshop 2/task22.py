# 22 Найти сумму чисел списка стоящих на нечетной позиции

list = [1, 3, 5, 7, 9, 4, 5]

def sum_odd(list):
    total = 0
    i = 0
    while i < len(list):
        if i % 2 != 0:
            total += list[i]
        i += 1
    return total

print(sum_odd(list))
