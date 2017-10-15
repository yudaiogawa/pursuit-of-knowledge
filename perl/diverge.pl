use strict;
use warnings;

# number

my $diverge_number = 256;

if ($diverge_number >= 512) {
    print "greater than equal to 2 ** 9\n";
} elsif ($diverge_number == 256) {
    print "2 ** 8\n";
} else {
    print ".....oh...\n"
}

# string

my $diverge_string_lower = "perl";
my $diverge_string_upper = "PERL";

if ($diverge_string_lower eq "perl") {
    print "$diverge_string_lower is lower case\n";
}

if ($diverge_string_upper ne "perl") {
    print "$diverge_string_upper is not lower case\n"
}

if ($diverge_string_lower gt $diverge_string_upper) {
    print "$diverge_string_lower is greater than $diverge_string_upper\n";
}
