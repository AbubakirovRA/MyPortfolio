import controller as c

def add_data(add_data):
    with open('dictionary.txt', 'a', encoding = 'utf-8') as file:
        file.write(f'{add_data}\n')
    if input('Continue?  (y/any key) ').lower() == 'y':
        c.start_programm()

def save_data(save_data):
    return 1


