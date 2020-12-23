from django.urls import path
from talk_session import consumers

urlpatterns_ws = [
    path('sess/<slug:sess_name>/', consumers.SessConsumer.as_asgi()),
]
