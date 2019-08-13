# String

# -- Single quote ----

print('single')


# -- Double quotes ----

print("double")


# -- Triple quotes ----

txt = """
# Major Diatonic
IM7 / IIm7 / IIIm7 / IVM7 / V7 / VIm7 / VIIm7(b5)
"""
print(txt)


# -- Concat ----

py = 'py'
th = 'th'
on = 'on'
txt = py + th + on + ' ;)'
print(txt)

txt += '\n'
txt += 'Python is a programming language that lets you work quickly and integrate systems more effectively.'
print(txt)

txt = '7' * 3
print(txt)


# -- Cast ----

pi = 3.14
print('Pi: ' + str(pi))


# -- Replace ----

txt = 'python'
print(txt.replace('o', '0'))


# -- Split ----

txt = 'python_programming'
print(txt.split('_'))


# -- Fill ----

a = '10'
b = '101'

print(a.rjust(8, '1'))
print(b.rjust(8, '1'))

print(a.zfill(8))
print(b.zfill(8))


# -- Search ----

txt = 'Python is a programming language that lets you work quickly and integrate systems more effectively.'
word_1 = 'Python'
word_2 = 'python'
print(txt.startswith(word_1))
print(txt.startswith(word_2))

print('a' in txt)
print('z' in txt)


# -- Change upper case or lower case ----

sql = 'select * from python where id = 0'
print(sql.upper())
cmd = 'WHICH PYTHON3'
print(cmd.lower())


# -- Delete ----

txt = ',,,,python,,,,'
print(txt.lstrip(','))
print(txt.rstrip(','))
