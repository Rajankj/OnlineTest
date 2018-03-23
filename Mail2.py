import smtplib,webbrowser,getpass
def get_mail():
    servicesAvailable=["hotmail", "gmail","yahoo", "outlook"]
    while True:
        mail_id=input("E-mail : ")
        if "@" in mail_id and ".com" in mail_id:
            symbol_pos = mail_id.find("@")
            dotcom_pos = mail_id.find(".com")
            sp = mail_id[symbol_pos+1:dotcom_pos]
            if sp in servicesAvailable:
                return mail_id , sp
                break
            else:
                print("we dont provide service for "+ sp)
                print("we provide service only for : hotmail/outlook,yahoo,gmail ")
                continue

        else:
            print("invalid E-mail ,Retype again ")
            continue
        
def set_smtp_domain(serviceProvider):
    if serviceProvider == "gmail" :
        return "smtp.gmail.com"
    elif serviceProvider == "outlook"  or serviceProvider == "hotmail":
        return "smtp.mail.outlook.com"
    elif serviceProvider == "yahoo" :
        return "smtp.mail.yahoo.com"
    

#user_mail,sp=get_mail()
#smtpDomain = set_smtp_domain(sp)
#print(user_mail)
#print ("your smtp domain is: "+ str(smtpDomain))
#print(sp)
print("Welcome you can send an email through this program")
print("please enter your E-mail and pssword : ")
e_mail,serviceProvider= get_mail()
password = getpass.getpass("Password : ")

while True :
    try :
        smtpDomain = set_smtp_domain(serviceProvider)
        connection=smtplib.SMTP(smtpDomain,587)
        connection.ehlo()
        connection.starttls()
        connection.login(e_mail,password)
    except :
        if serviceProvider=="gmail":
            print("Login unsuccessfull,there r two possible ways:")
            print("do u wnt to open a webpage from where u enable this option")
            answer=input("yes or no ? : ")
            if answer =="yes":
                webbrowser.open("https://myaccount.google.com/lesssecureapps")
            else:
                print("we dont open webpage for u")
            print("please retype youe E_mail and Password also")
            e_mail,serviceProvvider=get_mail()
            password=getpass.getpass("Password")
            continue
        else:
            print("login unsuccessfull")
            print("please retype youe E_mail and Password also")
            e_mail,serviceProvvider=get_mail()
            password=getpass.getpass("Password")
            continue
    else:
        print("login successfull : ")
        break
   
print("please type reciever's E_mail address")
recieverAddress,recieverSp = get_mail()
print("Now please type subject and message")
Subject = input("Subject : ")
Message = input("Message : ")
connection.sendmail(e_mail,recieverAddress,("SUbject : " +str(Subject) + "\n\n" + str(Message)))
print("E_mail send successfully ")
connection.quit()
    
            
    
