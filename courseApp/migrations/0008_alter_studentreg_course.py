# Generated by Django 5.0.6 on 2024-05-17 08:12

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('courseApp', '0007_alter_course_scheduleid'),
    ]

    operations = [
        migrations.AlterField(
            model_name='studentreg',
            name='course',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='studentReg', to='courseApp.course'),
        ),
    ]
