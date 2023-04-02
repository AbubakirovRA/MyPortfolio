# Задать список из N элементов, заполненных числами из [-N, N]. 
# Найти произведение элементов на указанных позициях. 
# Позиции хранятся в файле file.txt в одной строке одно число

def get_list(n):
    list = [i for i in range(-n, n+1)] # использование генератора списка для заполнения
    return list

def read_file(file_name):
    with open(file_name, 'r', encoding='utf-8') as f:
        string_list = f.read().splitlines()
    return string_list

def get_multipli(file_name, n):
    positions = read_file(file_name)
    elements = get_list(n)
    multipli = 1
    for i in positions:
        try:
            multipli *= int(elements[int(i)])
        except IndexError:
            continue
    return multipli
        

file_name = input('enter filename: ')+'.txt'
n = int(input('enter N - digit: '))
print(f'multipli of elements for position: {get_multipli(file_name, n)}')