import controller as c

def view_data(data, title):
    print(f'{title}, {data}')
    if input('Continue?  (y/any key) ').lower() == 'y':
        c.start_programm()

def get_data(title):
    return input(title)
