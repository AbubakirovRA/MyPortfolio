# 12. Для натурального n создать словарь индекс-значение,
# состоящий из элементов последовательности 3n + 1.
# Для n = 6: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}

def create_dict(n):
    i = 1
    Dict = {}
    while i <= n:
        Dict[i] = 3*i+1
        i += 1
    return Dict

print(create_dict(6))




# Dictionary

# Examples of create:
# Dict = {}                                     --    Creating an empty Dictionary
# Dict = dict({1: 'Java', 2: 'T', 3:'Point'})   --    Creating a Dictionary with dict() method
# Dict = dict([(1, 'Devansh'),(2, 'Sharma')])   --    Creating a Dictionary with each item as a Pair

# Examples of access:
# Employee = {"Name": "John", "Age": 29, "salary":25000,"Company":"GOOGLE"}
# print("Name : %s" %Employee["Name"])          -- Name : John
# print("Age : %d" %Employee["Age"])            -- Age : 29
# print("Salary : %d" %Employee["salary"])      -- Salary : 25000
# print("Company : %s" %Employee["Company"])    -- Company : GOOGLE

# Adding elements to dictionary one at a time
# Dict[0] = 'Peter'
# Dict[2] = 'Joseph'
# Dict[3] = 'Ricky'
# print("\nDictionary after adding 3 elements: ")
# print(Dict)                                       -- {0: 'Peter', 2: 'Joseph', 3: 'Ricky'}

# # Adding set of values with a single Key. The Emp_ages doesn't exist to dictionary
# Dict['Emp_ages'] = 20, 33, 24
# print("\nDictionary after adding 3 elements: ")
# print(Dict)                                      -- {0: 'Peter', 2: 'Joseph', 3: 'Ricky', 'Emp_ages':(20, 33, 24)}

# # Updating existing Key's Value
# Dict[3] = 'JavaTpoint'
# print("\nUpdated key value: ")
# print(Dict)                                      -- {0: 'Peter', 2: 'Joseph', 3: 'JavaTpoint', 'Emp_ages':(20, 33, 24)}


