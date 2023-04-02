# Показать вторую цифру трёхзначного числа

def data_request():
    while True:
        try:
            num = int(input('Enter a three-digit integer '))
            if num > 99 and num < 1000:
                return num
        except ValueError:
            print("Your enters wrong! One more pls!")


num = data_request()
print('second digit of entered integer = ', num // 10 % 10)
