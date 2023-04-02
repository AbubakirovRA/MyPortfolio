def write_to_file(name):
    print('enter the string for writing \nor empty line to close and press enter')
    with open(name, 'w', encoding='utf-8') as file:
        while (line :=input()) != '':
            file.write(f'{line}\n')

