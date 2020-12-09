from django.shortcuts import render


def index(req):
    return render(req, 'talk_session/index.html')


def sess(req, sess_name):
    return render(req, 'talk_session/sess-room.html', {'sess_name': sess_name})
