# Для натурального N создать список из N членов последовательности:
# Для N = 5: 1, -3, 9, -27, 81 и т.д.
def sequence(n):
    i = 0
    while i < n:
        if i % 2 == 0:
            print(-(-3**i), end="  ")
        else:
            print(-3**i, end = "  ")
        i += 1
sequence(9)
