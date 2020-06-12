# Oracle on Docker

[oracle/docker-images](https://github.com/oracle/docker-images)

## Edition

Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

## Requirements

* Docker
* Docker Compose

## Getting Started

clone oracle official repository.

```zsh
% git clone https://github.com/oracle/docker-images.git
```

download the oracle binary and move to suitable place.

```zsh
[foobar@baz] /path/to/my/docker-images/OracleDatabase/SingleInstance/dockerfiles
% mv ~/downloads/oracle-xe-11.2.0-1.0.x86_64.rpm.zip ./11.2.0.2
```

Build image.

```zsh
[foobar@baz] /path/to/my/docker-images/OracleDatabase/SingleInstance/dockerfiles
% ./buildDockerImage.sh -v 11.2.0.2 -x
```

#### Build/Run

```zsh
% docker-compose up -d --build
```
