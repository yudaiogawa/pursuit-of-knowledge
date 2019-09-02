#! python3

import requests, sys, webbrowser, bs4

print('Googling...')

res = requests.get('https://www.google.com/search?q=' + ''.join(sys.argv[1:]))
res.raise_for_status()

soup = bs4.BeautifulSoup(res.text, 'html.parser')
anchors = soup.select('.kCrYT a')

num_open = min(5, len(anchors))
for i in range(num_open):
  webbrowser.open('https://www.google.com' + anchors[i].get('href'))
