import os

# CURRENT DIRECTRY FILE PATH
this_file_path = os.path.abspath(__file__)
#CURRENT DIRECTORY PATH
BASE_DIR = os.path.dirname(this_file_path)
#ENTIRE PROJECT DIRECTORY PATH
ENTIRE_PROJECT_DIR =  os.path.dirname(BASE_DIR)
email_txt = os.path.join(BASE_DIR,"templates","email.txt")
content = ""
with open(email_txt,'r') as f:
    content = f.read()

print(content.format(name='Justin'))