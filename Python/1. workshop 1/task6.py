# Выяснить является ли число чётным

def Even(num):
    if num % 2 == 0:
        return True
    else:
        return False

def request_number(message):
    print(message)
    while True:
        try:
            num = int(input('enter integer '))
            return num
        except ValueError:
            print('Your entered wrong! Try one more, pleace!')

if Even(request_number('Hey! This is an even parity check of the entered digit.')):
    print('Yes! The number is even')
else:
    print('Wrong! The number is not even!')