def new_file():
    name_file = input('enter name file ')+'.txt'
    with open(name_file, 'w', encoding='utf-8') as file:
        file.write('')
    return name_file
