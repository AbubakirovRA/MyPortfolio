def head():
    print('+', '- '*4, sep=' ', end='')

def body():
    print('|', '  '*4, sep=' ', end='')

def cells(num, f):
    while num > 0:
        f()
        num -=1
    if (f==head):
        print('+')
    else:
        print('|')

def grid(col, row):
    count=row
    while count > 0:
        cells(col, head)
        for i in range (0, 4):
            cells(col, body)
        count -=1
    cells(col, head)

col = int(input('input numbers of columns: '))
row = int(input('input numbers of rows: '))
grid(col, row)