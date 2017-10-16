use strict;
use warnings;

open (my $txt_in, "<", "./txt_files/input.txt") or die("ERROR: $!");

while (<$txt_in>) {
    print $_;
}

close($txt_in);
