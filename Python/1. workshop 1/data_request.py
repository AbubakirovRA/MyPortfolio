def data_request():
    while True:
        try:
            num=int(input('enter integer '))
            return num
        except ValueError:
            print('You entered not integer! One more!')
num = data_request()


