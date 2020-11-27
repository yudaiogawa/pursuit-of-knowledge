from django.shortcuts import render


def index(req):
    return render(req, 'talk_session/index.html')
