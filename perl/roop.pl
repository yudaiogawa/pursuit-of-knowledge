use strict;
use warnings;

# while

my $total = 0;
my $count = 1;

while ($count <= 10) {
    $total += $count;
    $count++;
}

$count--;

print "1..$count total is $total\n";

# for

for (my $count = 0; $count <= 10; $count++) {
    print "count = $count\n";
}

# foreach - array

my @oss = qw(unix linux mac windows);

foreach my $os (@oss) {
    print "os = $os\n";
}

# foreach - hash


my %oss = ("unix" => "AT&T", "linux" =>"Linus Torvalds", "mac" => "Steve Jobs", "windows" => "Bill Gates");

foreach my $key (keys %oss) {
    print "$key ... $oss{$key}\n";
}

# for - foreach

for (@oss) {
    print "os = $_\n";
}

for (keys %oss) {
    print "$_ ... $oss{$_}\n";
}
