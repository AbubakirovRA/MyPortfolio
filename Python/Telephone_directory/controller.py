import view
import saver
import reader
import generator_data

def start_programm():
    user_choice = view.get_data('Enter your choice:\nfind value(f)\nadd value(a)\nimport data(i)\nexport data(e)\n:  ')
    if user_choice == 'f':
        view.view_data(reader.find_data(view.get_data('Enter data to search: ')), 'data')
    elif user_choice == 'a':
        saver.add_data(view.get_data('Enter data to add: '))
    elif user_choice == 'e':
        generator_data.export(view.get_data('Enter a file name to export to html format: '))
    elif user_choice == 'i':
        saver.save_data(view.get_data('Enter a file name for data import: '))