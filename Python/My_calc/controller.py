import calc_model
import view
import logger as lg

def button_click():
    value_a = view.get_value()
    lg.logger_a(value_a)

    math_action = view.get_math_action()
    lg.logger_math_action(math_action)

    value_b = view.get_value()
    lg.logger_b(value_b)

    calc_model.init(value_a, value_b)

    if math_action == '+':
        result = calc_model.sum()
    elif math_action == '-':
        result = calc_model.dif()
    elif math_action == '*':
        result = calc_model.mult()
    elif math_action == '/':
        result = calc_model.div()
        
    lg.logger_result(result)
    view.view_data(result)
