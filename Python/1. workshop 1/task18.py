# 18. Проверить истинность утверждения ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z

def test_the_phrase(x, y, z):
    return (not(x or y or z)) == (not x and not y and not z)

def request_value(message):
    print(message)
    while True:
        try:
            arg = input('enter boolean value (True or False) ')
            if arg == 'True':
                return True
            else:
                return False
        except ValueError:
            print('Your entered wrong! Try one more!')

x = request_value('Now, enter the X value ')
y = request_value('Now, enter the Y value ')
z = request_value('Now, enter the Z value ')
print('The phrase with X=', x, 'and Y=', y, 'and Z=', z, 'is: ')
print(test_the_phrase(x, y, z))