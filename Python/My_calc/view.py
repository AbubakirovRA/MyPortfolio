from fractions import Fraction
import controller

def view_data(data):
    print(data)
    if input('Want more computing?  (y/any key) ').lower() == 'y':
        controller.button_click()

def get_value():
    while True:
        try:
            value = input('value = ')
            if value.find('/') != -1:
                return Fraction(value)
            elif value.find('j') != -1:
                return complex(value)
            else:
                return int(value)
        except ValueError:
            print('Check entered value!')

def get_math_action():
    while True:
        math_action = input('math_action ')
        if math_action == '+':
            return math_action
        elif math_action == '-':
            return math_action
        elif math_action == '*':
            return math_action
        elif math_action == '/':
            return math_action
        print('Check entered value!')

