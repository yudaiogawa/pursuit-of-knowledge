#! python3

import webbrowser, sys, pyperclip

if len(sys.argv) > 1:
  addr = ' '.join(sys.argv[1:])
else:
  addr = pyperclip.paste()

webbrowser.open('https://www.google.com/maps/place/' + addr)
