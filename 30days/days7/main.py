def my_print(txt):
    print(txt)


msg_template = """Hello {name},\
Thank you for joining {website}. We are very \
happy to have you with us.\
""" #.formate(name="justin", website="cfe.sh")

def format_msg(my_name="justin", my_website="cfe.sh"):
    my_msg = msg_template.format(name=my_name, website=my_website)
    return my_msg