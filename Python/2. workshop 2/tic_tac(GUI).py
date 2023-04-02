# FROM https://zen.yandex.ru/media/id/610a882d9bd55331b745e454/krestikinoliki-na-python-za-15-minut-611b8975edb815714cbb3c8d
# Для начала работы нам потребуется библиотека kivy.
# Установить ее можно с помощью команды (Windows)
    # pip install kivy
# Либо с помощью команды (Linux, Python 3):
    # pip3 install kivy

from kivy.app import App # Kivy - это открытая Python библиотека для быстрой разработки приложений
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.gridlayout import GridLayout
from kivy.uix.button import Button
from kivy.config import Config
 
Config.set("graphics","resizable","0")  #  Мы установили размер окна 300х300
Config.set("graphics","width","300")    #  и указали что окно нельзя перерастягивать.
Config.set("graphics","height","300")
 
# Нам нужно, чтобы при каждом новом ходе 
# крестик сменялся ноликом и наоборот.

# Для этого создадим класс нашего приложения, и назовем его MainApp. 
class MainApp(App): # Оно должно наследоваться от класса kivy – App.
    def __init__(self): # и определим ее в функции (def __init__:). 
        super().__init__() # super() инициализирует родительский класс App
        self.switch = True # Внутри класса создадим переменную self.switch.

# Внутри класса мы также объявим 3 функции: tic_tac_toe, restart и build:

# tic_tac_toe: функция, которая будет исполнять всю логику приложения
# Для начала укажем снова глобальную переменную switch. 
# Как вы помните, она переключается в обратное положение каждый раз после нажатия кнопки, 
# чем символизирует переключение хода на другого игрока. 
# В этой функции аргумент arg будет как раз являться нашим конкретным button.

    def tic_tac_toe(self, arg):
        arg.disabled = True # При нажатии на кнопку, согласно с логикой приложения, мы должны выключить возможность нажать на нее второй раз.Для этого необходимо указать arg.disabled = True.
        arg.text = 'X' if self.switch else 'O' # Теперь проверим в каком положении стоит наш self.switch, и в зависимости от этого, определим переменную arg.text крестиком либо ноликом:
        # Фактически, выражение 'X' if self.switch else 'O' означает 'X' в случае если self.switch = True и 'O' в случае если self.switch = False.        
        self.switch = not self.switch # После этого, разумеется, мы должны переключить ход:
# Далее начнется самое сложное. 
# Нам необходимо задать все возможные координаты кнопок, которые дадут выигрыш: 
        coordinate = (
            (0,1,2), (3,4,5), (6,7,8), # X
            (0,3,6), (1,4,7), (2,5,8), # Y
            (0,4,8), (2,4,6),          # D
        )
 
        vector = lambda item: [self.buttons[x].text for x in item] # Также зададим и возможные вектора самих нажатых кнопок (в них будет храниться буквы 'X' либо 'O'). 
 
        color = [0,1,0,1]
 
        for item in coordinate:
            if vector(item).count('X') == 3 or vector(item).count('O') == 3:
                win = True
                for i in item:
                    self.buttons[i].color = color
                for button in self.buttons:
                    button.disabled = True
                break
# restart: перезапускает игру, 
# сброс значения кнопок и переменных до начального состояния 
    def restart(self, arg): # Добавим в функцию restart следующий код:
        self.switch = True # switch = True показывает, что ход снова возвращается к крестикам

# Далее мы проходимся в цикле по всем кнопкам, возвращая им цвет по умолчанию и стирая текст. 
# Модификатор disabled показывает, что теперь вы снова можете нажать на кнопку. 
        for button in self.buttons:
            button.color = [0,0,0,1]
            button.text = ""
            button.disabled = False

# build: определена App, но ее поведение нужно"перегрузить"
    def build(self):
        self.title = "Крестики-нолики" # self.title это название окна
 
        root = BoxLayout(orientation="vertical", padding=5) # объект BoxLayout, контейнер для кнопок
 
        grid = GridLayout(cols=3) # Также создадим переменную GridLayout, и укажем число колонок = 3
        self.buttons = [] # добавим внизу кнопочку Restart


# в цикле мы добавим в лист 9 объектов класса Button. 
# Каждый такой объект имеет цвет, размер шрифта и другие переменные. 
# При нажатии на такую кнопку вызывается метод tic_tac_toe. 
# В конце цикла не забываем добавить полученные в ходе тела цикла 
# кнопки в наш лист self.buttons, 
# кроме того, добавляем новый виджет в grid:
        for _ in range(9):
            button = Button(
                color = [0,0,0,1],
                font_size = 24,
                disabled = False,
                on_press = self.tic_tac_toe
            )
            self.buttons.append(button)
            grid.add_widget(button)
 
        root.add_widget(grid)
 
        root.add_widget(  # Также добавим виджет для кнопки Restart:
            Button(
               text = "Restart",
               size_hint = [1,.1],
               on_press = self.restart
            )
        )
 
        return root
 
 
if __name__ == "__main__":
    MainApp().run()