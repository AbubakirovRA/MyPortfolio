# Написать программу преобразования десятичного числа в двоичное.

# Рассуждения
# При двоичной записи каждый бит двоичного числа принимает только два значения: 0 и 1.
# Таким образом, содержание бита, т.е. (0 либо 1), несет только информацию о том, 
# включен бит, или нет.
# Основная же ИНФОРМАЦИЯ О ЧИСЛОВОМ ЗНАЧЕНИИ содержится в ПОЗИЦИИ бита, 
# точно так же как и в десятичной системе.
# Это значит, что от позиции бита зависит какое число он отображает.
# Так как значений всего два, 
# то отображаемое число равно два в степени номер бита (номер позиции):
# номер позиции:    7    6    5    4    3    2    1    0
# значение бита:    1    1    1    1    1    1    1    1
# формула бита:    2**7 2**6 2**5 2**4 2**3 2**2 2**1 2**0
# Десятичное
# значение числа:  128   64   32   16    8    4    2    1

# Таким образом, любое число можно представить как сумму чисел, кратных 2-м.
# Если число нечетное, то добавляем нулевой бит, равный единице.
# Таким образом, нечетное число всегда будет имет включенным нулевой бит в 1.
# Пример:
# Отобразим число 50

# номер позиции:    7    6    5    4    3    2    1    0
# значение бита:    0    0    1    1    0    0    1    0
# формула бита:    2**7 2**6 2**5 2**4 2**3 2**2 2**1 2**0
# Десятичное
# значение числа:   0    0    32   16   0    0    2    0
# То есть включены биты 5, 4 и 1, остальные выключены:
# двоичное представление 50: 00110010


# def get_bin(n): # способ, "изобретенный" мной, через логарифм по основанию 2
#     if n == 0:
#         return 0
#     last_bin = trunc(log2(n))
#     bin_index = []
#     while last_bin >= 0:
#         if n == 0 and last_bin == 0:
#             bin_index.append(0)
#             break
#         elif n == 0 and last_bin != 0:
#             bin_index.append(0)
#             last_bin -=1
#             continue          
#         if last_bin == trunc(log2(n)):
#             bin_index.append(1)
#         else:
#             bin_index.append(0)
#             last_bin -=1
#             continue
#         n = n - 2**last_bin
#         last_bin -=1
#     return " ".join(map(str,bin_index))

# from math import *
# n = int(input('enter Decimal: '))
# print(get_bin(n))

def get_bin(n): # обычный перевод через остаток от деления
    
    bin_index = []
    while n > 0:
        bin_index.append(n%2)
        n = n//2
    bin_index = list(reversed(bin_index))
    return " ".join(map(str,bin_index))

n = int(input('enter Decimal: '))
print(get_bin(n))