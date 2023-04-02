# Найти корни квадратного уравнения Ax² + Bx + C = 0
# 1. Математикой
# 2. Используя дополнительные библиотеки*

def get_square_roots(a, b, c):
    d = b**2 - 4*a*c
    print('Discriminant  = ' + str(d))
    if d < 0:
        return 'No roots'
    elif d == 0:
        x = -b / (2 * a)
        return 'x = ' + str(x)
    else:
        return 'x1 = ' + str((-b + d ** 0.5) / (2 * a)), 'x2 = ' + str((-b - d ** 0.5) / (2 * a))

a, b, c = float(input('enter a value: ')), float(input('enter a value: ')), float(input('enter a value: '))

print(get_square_roots(a, b, c))