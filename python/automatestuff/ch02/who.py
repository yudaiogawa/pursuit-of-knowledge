while True:
  print('Who are you?')
  name = input()
  if name != 'Bob':
    continue

  print('Hello Bob. password?')
  password = input()
  if password == 'passwd':
    break

print('Authentication success.')
