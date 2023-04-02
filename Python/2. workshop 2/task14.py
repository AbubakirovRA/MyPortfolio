#14. Подсчитать сумму цифр в вещественном числе.

def sum_float_digits(num):
    digits_string = str(num).replace('.','')
    all_digits = int(digits_string)
    sum = 0
    while all_digits > 0:
        sum += all_digits % 10
        all_digits //= 10
    return sum

from decimal import Decimal
number = Decimal(input('Enter float number: '))
print(f'Sum of digits of entered float number is: {sum_float_digits((number))}')


