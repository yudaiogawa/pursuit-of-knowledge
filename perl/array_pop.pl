use strict;
use warnings;

my @num_array = (10, 20, 30);

# 単一の値は $ で取り出す

print $num_array[1];

print $num_array[-1];

# 複数の値は @ で取り出す

print @num_array[1..2];

print "最後のインデックス: $#num_array\n";

print @num_array[1..$#num_array];
