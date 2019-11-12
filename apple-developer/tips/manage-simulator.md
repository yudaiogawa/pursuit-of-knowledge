# Manage Simulator

シミュレータは `$HOME/Library/Developer/CoreSimulator/` に居ます。

<br>

#### Checking Simulators

```bash
xcrun simctl list
```

#### Checking disk usage statistics

```bash
du -sh $HOME/Library/Developer/CoreSimulator/*
```

#### Delete unavailable simulator

```bash
xcrun simctl delete unavailable
```
