# Generated by Django 5.0.6 on 2024-05-20 17:27

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('courseApp', '0011_studentreg_comleted_remove_course_prerequisites_and_more'),
    ]

    operations = [
        migrations.RenameField(
            model_name='studentreg',
            old_name='comleted',
            new_name='completed',
        ),
    ]
