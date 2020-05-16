{
  package Counter;

  my $damage = 0;
  my $name = "Anastasia";

  sub attack {
    $damage++;
    print "$name: $damage\n"
  }

  sub recover {
    $damage = 0;
    print "$name: recover\n"
  }
}

Counter::attack;
Counter::attack;
Counter::recover;
Counter::attack;
