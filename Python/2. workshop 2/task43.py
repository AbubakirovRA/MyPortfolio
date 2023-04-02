# 43. Дана последовательность чисел.
#     Получить список уникальных элементов заданной последовательности.

# вариант, написаный колхозным способом
# ------------------------------------
def get_unique(data):
    i = 0
    exception_index = []
    while i < len(data):
        if i == len(data) - 1:
            break
        exception_index = check_element(data, data[i], i)
        if exception_index == []:
            i +=1
            continue
        else:
            data = [i for i in data if data.index(i) not in exception_index]
            # for n in sorted(exception_index, reverse=True):
            #     del data[n]
            i = 0
            continue
    return data

def check_element(data, element, count):
    i = count +1
    exception_index = []
    while i < len(data):
        if i == len(data)-1:
            if data[i] == element:
                exception_index.append(count)
                exception_index.append(i)
                return exception_index
            else:
                return exception_index
        elif data[i] == element:
            exception_index.append(count)
            exception_index.append(i)
        i +=1

data = [1, 4, 8, 10, 3, 4, 7, 1, 1, 4 , 5, 1]
print(f'{data}  =>  {get_unique(data)}')

# С сохранением порядка из первоначального списка
# более короткая альтернатива 
# отличается предварительным проектированием алгоритма на бумаге :-)
# -----------------------------------------------------------------
list2=[]
for i in range(len(data)):
    for j in range(len(data)):
        if j == i:
            if j == len(data)-1:
                list2.append(data[i])
            continue      
        elif data[i] == data[j]:
            break
        elif data[i] != data[j]:
            if j == len(data)-1:
                list2.append(data[i])

print(f'{data} => {list2}') 


# ______________________________________
# Получение количества уникальных элементов

# list_d = [100, 3, 100, "c", 100, 7.9, "c", 15]
# number_of_elements = len(list_d)
# number_of_unique_elements = len(set(list_d))
# print("Number of elements in the list: ", number_of_elements)
# print("Number of unique elements in the list: ", number_of_unique_elements)