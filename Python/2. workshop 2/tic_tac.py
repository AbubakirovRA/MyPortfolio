# import os
# def cls():
#     os.system('cls' if os.name == 'nt' else 'clear')

# def draw_board():
#     cls()
#     board = list(range(10))
#     print('    number of cell         Game board')
#     print('    -------------        -------------')
#     for i in range(3):
#         print(f'    | {board[0+i*3]} | {board[1+i*3]} | {board[2+i*3]} |        |   |   |   |')
#         print('    -------------        -------------')

# def request_number(title):
#     while True:
#         try:
#             num = int(input(title))
#             if 0 < num < 10:
#                 return num
#         except ValueError:
#             print('         Your entered wrong! One more!)')

# def init_game():
#     cls()
#     print('             ---------------------')
#     print('             ______HI, THERE!____')
#     print('             This is TIC-TAC Game!')
#     print('             ---------------------')
#     print()
#     print('             ______RULES__________')
#     print('The game is played by two players: Player1 and Player2.\nThe first move is made by the player who plays for X\nWho goes first is determined by tossing a coin.')
#     print()
#     print('Field cells are numbered from 1 to 9.\nTo put your symbol (X or O) in a cell,\njust enter the number of cell')
#     print()
#     import random
#     if input('Do Yoy want to play game? ').lower() == 'y':
#         return random.randint(1, 2)
#     else:
#         return -1

# init_game()
# draw_board()

# print(request_number('   enter number of cell from 0 to 9 '))

from fractions import Fraction
from tkinter import Y
x = Fraction(1, 3)
y = Fraction(1, 2)
sum = x / y
print(sum)