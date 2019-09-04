# Django

Building Django environment.

Setup

```bash
$ docker-compose run web django-admin.py startproject mysite .
```

Run

```bash
$ docker-compose up -d
```

Create 'polls' application.

```bash
$ docker-compose run web python3 manage.py startapp polls
```

## Projects

- [Polls](polls)
  - [Tutorial | Django](https://docs.djangoproject.com/ja/2.2/intro/tutorial01/)
