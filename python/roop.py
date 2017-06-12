#!/usr/local/bin/python
# coding: utf-8

# range
for i in range(10):
    print i

# reversed
chars = ['i', 'a', 'd', 'u', 'Y']
for char in reversed(chars):
    if char != 'i':
        print char ,
    else:
        print char

# enumerate
months = ['12months', 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
for num, month in enumerate(months):
    print num, ':', month

# itertools
import itertools
commons = ('RGB', 'signal', '栄養バランス')
colors = ('red', 'yellow', 'green')
for common, color in itertools.product(commons, colors):
    print '%s >>> %s' % (common, color)
