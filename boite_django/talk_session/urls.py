from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='index'),
    path('sess/<str:sess_name>/', views.sess, name='sess'),
]
