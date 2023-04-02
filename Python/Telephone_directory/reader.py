def find_data(search_data):
    d = {}
    with open('dictionary.txt', 'r', encoding='utf-8') as file:
        d = {i.split(" ")[0]: " ".join(i.replace("\n", "").split(" ")[1:]) for i in file}    
    return d[search_data]

