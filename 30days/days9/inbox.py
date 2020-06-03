import imaplib
import email

host = 'imap.gmail.com'

def get_inbox(username='viinay.code@gmail.com',password='9585847686'):
    mail = imaplib.IMAP4_SSL(host)
    mail.login(username,password)
    mail.select("inbox")
    _, search_data = mail.search(None, 'UNSEEN')
    my_messages = []
    for num in search_data[0].split():
        #print(num)
        email_data = {}
        _, data = mail.fetch(num,'(RFC822)')
        _, b = data[0]
        email_message = email.message_from_bytes(b)
        #print(email_message)
        for header in ['subject','to','from','date']:
            print("{} : {}".format(header, email_message[header]))

        for part in email_message.walk():
            if part.get_content_type() == "text/plian":
                body = part.get_payload(decode=True)
                print(body.decode())
                email_data['body'] = body.decode()
            elif part.get_content_type() == "text/html":
                html_body = part.get_payload(decode=True)
                email_data['html_body'] = html_body.decode()
        my_messages.append(email_data)
    return my_messages

if __name__ == "__main__":
    print(get_inbox())
