# 33. Задана натуральная степень k. 
# Сформировать случайным образом список коэффициентов 
# (значения от 0 до 100) многочлена и записать в файл многочлен степени k. 
# *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0.

def polynom():
    import random
    index = []
    rnd = 0
    while True:
        try:
            k = int(input('enter k value '))
            if k == 0:
                print('polynomial must have more than one member')
                continue
            break
        except ValueError:
            print('Wrong enter')
    for i in range(0, k+1):
        if i == 0:
            rnd = random.randint(0, 0)
            if rnd == 0:
                index.append('')
            else:
                index.append(str(rnd))
        elif i == 1:
            rnd = random.randint(0, 100)
            if rnd == 0:
                index.append('')
            else:
                index.append(f'{str(rnd)}*x ')
        else:
            index.append(f'{str(random.randint(0, 100))}*x^{i} ')
            string = f'{str(index[k])}+ '
            if i == k + 1:
                rnd = random.randint(1, 100)
            else:
                rnd = random.randint(0, 100)
                if rnd == 0:
                    index.append('')
                else:            
                    index.append(f'{str(rnd)}*x^{i} ')
    if index[k] == '':
        string = ''
    else:
        string = f'{str(index[k])}+ '
    for j in reversed(range(k)):
        if j == 0:
            if str(index[j])=='':
                string += ''
            else:
                string += str(index[j])
        else:
            string += str(index[j]) + '+ '
            if str(index[j])=='':
                string += ''
            else:
                string += str(index[j]) + '+ '
    if index[0] == '':
        string[:-3]
    string = string + ' = 0'
    return string

# def new_file(name_file):
#     with open(name_file, 'w', encoding='utf-8') as file:
#         file.write(polynom())
#     return name_file

def new_file(name_file):
    with open(name_file, 'w', encoding='utf-8') as file:
        while (line :=input('Any key - to continue, n -to stop ')) != 'n':
            file.write(f'{polynom()}\n')

name_file = input('enter name file ')+'.txt'
new_file(name_file)