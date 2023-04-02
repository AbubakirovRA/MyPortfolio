# В файле находится N натуральных чисел, записанных через пробел. 
# Среди чисел не хватает одного, чтобы выполнялось условие A[i] - 1 = A[i-1]. 
# Найти его.
def read_line():
    with open('task35.txt') as file:
        A = [int(x) for x in file.read().split()]
    return A

def skipped_digit(list1):
    list2=[]
    list1 = sorted(list1)
    for i in range(len(list1)-1):
        if list1[i+1] - list1[i] == 1:
            continue
        else:
            list2.append(list1[i+1] - 1)
    return list2

list1 = read_line()
print(skipped_digit(list1))