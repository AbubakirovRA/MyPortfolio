# Написать программу получающую набор произведений чисел от 1 до N.
# Пример: пусть N = 4, тогда [ 1, 2, 6, 24 ]

def multiplication(n):
    list = []
    list.insert(0, 1)
    i = 1
    while i < n:
        list.append(list[i-1]*(i+1))
        i +=1
    return list

print(multiplication(5))
