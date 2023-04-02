# Реализовать алгоритм задания случайных чисел. 
# Без использования встроенного генератора псевдослучайных чисел
# https://habr.com/ru/post/499490/

from math import *
def rnd(m1, m2):
    import time
    seed = time.time()
    seed = seed * 1103515245 + 12345
    return trunc(((seed/65536) % 32768)%(m2-m1+1)+m1)                    # реализация rand в C
    # return trunc(((seed * 73129 + 95121) % 100000)%(m2-m1+1)+m1)        # PRNG — Pseudo-random Numbers Generator — синонимом линейного конгруэнтного метода
                                                                        # PRNG алгоритмы похожи на реализацию rand в C и отличаются лишь константами
m1= int(input('enter start bound: '))
m2 = int(input('enter end bound: '))

print(rnd(m1, m2))
