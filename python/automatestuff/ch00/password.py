password_file = open('password.txt')
password = password_file.read()

print('Please enter your password >>> ', end='')

enter_password = input()
if enter_password == password:
  print('Authentication success :)')
  if len(password) == 8:
    print('[WARNING] Password is weak.')
else:
  print('Authentication failed ;(')
