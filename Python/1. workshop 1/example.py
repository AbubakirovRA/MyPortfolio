import create_file
name = create_file.new_file()

import write_to_file
write_to_file.write_to_file(name)

import read_from_file
lines = read_from_file.read_line()
print(lines)
print(lines[0])
print(lines[1])

import find_string
print(find_string.find_str(lines[0], lines[1]))


