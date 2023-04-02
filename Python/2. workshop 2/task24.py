# 24 В заданном списке вещественных чисел найдите разницу
# между максимальным и минимальным значением дробной части элементов.
# Пример: [1.1, 1.2, 3.1, 5, 10.01] => 0.19

def fractional_difference(list):
    min = max = list[0] - int(list[0])
    for i in list:
        dif = i - int(i)
        if  dif == 0:
            continue
        if dif > max:
            max = dif
        if dif < min:
            min = dif
    return max-min


list = [1.1, 1.2, 3.1, 5, 10.01]
print(round(fractional_difference(list), 2))

