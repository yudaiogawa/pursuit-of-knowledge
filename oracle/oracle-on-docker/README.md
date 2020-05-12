# Oracle on Docker

## Requirements

* Docker
* Docker Compose

## Oracle Database

[oracle/docker-images](https://github.com/oracle/docker-images)

#### Edition

Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

#### Build/Run

```bash
$ docker load -i images/oracle-db-11.2.0.2-xe.tar
$ docker-compose up -d --build
```
