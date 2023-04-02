# Строка содержит набор чисел. 
# Показать большее и меньшее число
# Символ-разделитель - пробел
# Преобразование строк в Питоне: https://www.pythonpool.com/convert-string-to-list-python/

str1="9 8 7 6 5 4 33 2 125 -1"
list1=list(str1.split())
list2=list(map(int,list1))
max = min = 0
for i in list2:
    if i > max:
        max = i
    elif i < min:
        min = i
print(min, max)
    


