# Написать программу замену элементов массива на противоположные

def get_Array(min_bound, max_bound, len):
    import random
    Array = [random.randint(min_bound, max_bound) for i in range(len)]
    return Array

def get_opposite_array(Array, len):
    opp_arr = [- Array[i] for i in range(len)]
    return opp_arr

def request_num(message):
    print(message)
    while True:
        try:
            num = int(input('enter integer digit '))
            return num
        except ValueError:
            print('Your entered wrong! Try one more, pleace!')

len = request_num('Enter the array length')
min_bound = request_num('Enter Min bound')
max_bound = request_num('Enter Max bound')
Array = get_Array(min_bound, max_bound, len)

print('source array: ', Array)
print('opposite array: ', get_opposite_array(Array, len))