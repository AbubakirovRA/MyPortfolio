# 23. Найти произведение пар чисел в списке. 
# Парой считаем первый и последний элемент, второй и предпоследний и т.д. 
# Пример: [2, 3, 4, 5, 6] => [12, 15, 16]; [2, 3, 5, 6] => [12, 15] 

list = [1, 4, 7, 3, 7, 8, 3]
def sum_of_pairs(list):
    final_list = []
    i = 0
    length = len(list) - 1
    while i < len(list) / 2:
        final_list.append(list[i] * list[length])
        i += 1
        length -= 1
    return final_list
print(sum_of_pairs(list))
