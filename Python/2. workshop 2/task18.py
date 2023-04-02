# 18. Реализовать алгоритм перемешивания списка.
import random

def get_list(n):
    list = [random.randint(0, n+1) for i in range(n+1)] # использование генератора списка для заполнения
    return list

def get_mix(list):
    for i in range(len(list)):
        temp = list[i]
        j = random.randint(i, len(list)-1)
        list[i] = list[j]
        list[j] = temp
        i += 1
    # random.shuffle(list) # встроенный функционал
    return list

list = get_list(20)
print(list)
print(get_mix(list))