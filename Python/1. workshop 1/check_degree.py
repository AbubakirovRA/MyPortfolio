# Проверка, является ли число степенью двойки (распространенная задача в программировании)
# from https://streletzcoder.ru/yavlyaetsya-li-chislo-stepenyu-dvoyki/

#-----------------------------
# n = 0
# print(bin(n+1))
# print(bin(n))
# if (n)&(n-1) ==0:
#     print('yes')
# else:
#     print('No')

#----------------------------
# from math import *
# def check_degree(n):
#     if (n > 1):
#         return bool(int(log2(n)) == log2(n)) # если число является степенью двойки, тогда его логарифм по основанию два
#     else:                                    # log2(n) - натуральное целое число, если нет, то это дробное число. Выражение
#         return False                         # int(log2(n) - принудительно отбрасывает дробную часть.
# n = int(input('enter natural number '))
# print(check_degree(n))