import requests
import os
import shutil
from download_util import download_file
from download_util import download_file_slower



THIS_FILE_PATH =  os.path.abspath(__file__)
BASE_DIR = os.path.dirname(THIS_FILE_PATH)
DOWNLOAD_DIR = os.path.join(BASE_DIR,"downloads")
os.makedirs(DOWNLOAD_DIR,exist_ok=True)
download_img_path = os.path.join(DOWNLOAD_DIR,"1.jpg")
#url = "https://cdn.mos.cms.futurecdn.net/ntFmJUZ8tw3ULD3tkBaAtf.jpg"
url = "https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg"
r = requests.get(url,stream=True)
r.raise_for_status()
with open(download_img_path,'wb') as df:
    df.write(r.content)

# dl_filename = os.path.basename(url)
# new_dl_path = os.path.join(DOWNLOAD_DIR,dl_filename)
# with requests.get(url,stream=True) as r:
#     with open(new_dl_path,'wb') as file_obj:
#         shutil.copyfileobj(r.raw, file_obj)

download_file(url,DOWNLOAD_DIR)
#download_file_slower(url)