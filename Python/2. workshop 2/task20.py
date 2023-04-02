# Определить, присутствует ли в заданном списке строк, некоторое число

str_list = ['q', 'wqqq', 'e', 'r', 'rr1', 'tt', 'q2f', 'e', 't4t', 'y']
num = (input('enter number to find: '))

def check_enter(str_list, num):
    i = 0
    while i < len(str_list):
        characters = list(str_list[i])
        for j in characters:
            if j == num:
                return True
        i += 1
    return "None"

print(check_enter(str_list, num))