# Определить номер четверти плоскости, в которой находится точка с координатами Х и У, причем X ≠ 0 и Y ≠ 0
def request_number(message):
    print(message)
    while True:
        try:
            num =int(input('enter integer '))
            return num
        except ValueError:
            print('Your entered wrong! Try one more!')

def quarter_number(x, y):
    if x == 0 and y == 0:
        return 'It is zero point'
    elif x > 0 and y > 0:
        return 1
    elif x < 0 and y > 0:
        return 2
    elif x < 0 and y < 0:
        return 3
    elif x > 0 and y < 0:
        return 4

x = request_number('Now, enter the X value')
y = request_number('Now, enter the Y value')

print('Number of quarter = ', (quarter_number(x, y)))