# 32. Дана последовательность чисел. 
#     Получить список неповторяющихся элементов исходной последовательности
#     Пример: [1, 2, 3, 5, 1, 5, 3, 10] => [1, 2, 3, 5, 10]

list1 = [1, 4, 8, 10, 3, 4, 7, 1, 1, 4 , 5, 1, 2]

# выдает отсортированный список неповторяющих элементов
# -----------------------------------------------------
# list2 = sorted(list1)
# for i in reversed(range(len(list2)-1)):
#     if list2[i+1] > list2[i]:
#         continue
#     elif list2[i] == list2[i+1]:
#         list2.remove(list2[i])
# print(f'{list1} => {list2}')

# способ выдает список с сохранением очередности 
# элементов исходного списка (как в примере)
# --------------------------------------------
list2 = []
for i in range(len(list1)):
    if i == 0:
        list2.append(list1[i])
        continue
    for j in range(len(list2)):
        if list1[i] == list2[j]:
            break
        elif j == len(list2) - 1:
            list2.append(list1[i])
print(f'{list1} => {list2}')


