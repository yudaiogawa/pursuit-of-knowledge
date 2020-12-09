from django.urls import path
from . import views

urlpatterns = [
    path('sess/<str:sess_name>/', views.sess, name='sess'),
    path('', views.index, name='index')
]
