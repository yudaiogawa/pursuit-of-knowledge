# Hello Docker

## Build Docker Image

```zsh
# Build
% docker image build -t example/echo:latest .

# Check
% docker image ls | grep example/echo
```

## Run Docker Container

```zsh
# Run
% docker container run -d -p 49152:8080 example/echo:latest

# Check
% docker container ls

# GET Request
% curl http://localhost:49152
Hello Docker World!! ;)
```

## Stop Docker container

```zsh
% docker container stop $(docker container ls --filter "ancestor=example/echo" -q)
```
