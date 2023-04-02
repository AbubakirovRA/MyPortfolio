# 22. Найти расстояние между точками в пространстве 2D/3D

#  Расстояние между двумя точками на плоскости расчитывается по следующей формуле:
# double d= Math.Sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
# Формула расстояния между точками на плоскости

# где x1 и y1 координаты первой точки, а x2 и y2 координаты второй точки.

# Расстояние между двумя точками в трехмерном пространстве расчитывается по следующей формуле:
# double d= Math.Sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) + (z2-z1)*(z2-z1))
# Формула расстояния между точками в трехмерном пространстве

# где x1, y1 и z1 координаты первой точки, а x2, y2 и z2 координаты второй точки.

from math import *

def Distance(x1, y1, z1, x2, y2, z2):
    return sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1))

def request_number(message):
    print(message)
    while True:
        try:
            num = float(input('enter float or integer '))
            return num
        except ValueError:
            print('Your entered wrong! Try one more!')

x1 = request_number('Now, enter the x1 argument')
x2 = request_number('Now, enter the x2 argument')
y1 = request_number('Now, enter the y1 argument')
y2 = request_number('Now, enter the y2 argument')
z1 = request_number('Now, enter the z1 argument')
z2 = request_number('Now, enter the z2 argument')

print('A distance between entered points = ', (round(Distance(x1, y1, z1, x2, y2, z2), 2))) # round(x, n) — данные х округляет до n знаков после точки