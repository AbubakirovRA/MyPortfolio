def read_line():
    name_file = input('enter name file ')+'.txt'
    with open(name_file, 'r', encoding='utf-8') as file:
        lines = file.read().splitlines()
    return lines