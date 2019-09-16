# echo

## Build Docker Image

```bash
# Build
$ docker image build -t example/echo:latest .

# Check
$ docker image ls | grep example/echo
```

## Run Docker Container

```bash
# Run
$ docker container run -d -p 49152:8080 --name example-echo example/echo:latest

# Check
$ docker container ls

# GET Request
$ curl http://localhost:49152
Hello Docker World!! ;)
```

## Stop Docker container

```bash
$ docker container stop $(docker container ls --filter "ancestor=example/echo" -q)
```

## Run Docker Compose

```bash
$ docker-compose up -d --build
```