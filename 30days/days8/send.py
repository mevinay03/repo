import requests
import sys
from datetime import datetime

from formatting import format_msg

def send(name=None,website=None):
    if name==None:
        msg = format_msg(my_name=name, my_website="solns.in")
    else:
        msg = format_msg(my_name=name,my_website=website)
        # send the message
        r = requests.get("http://httpbin.org/json/")
        print(r)
        if r.status_code != 200:
            return r
        else:
            return "There was an error"

if __name__ == "__main__":
    print(sys.argv)
    name = "unknown"
    if len(sys.argv) > 1:
        name = sys.argv[1]
    res = send(name)
    print(res)
