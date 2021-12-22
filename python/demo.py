
try:
    y=int(input("Enter any number1:"))
    s=int(input("Enter any number2:"))
    z=y/s
except NameError:
    print("Invalid input !!!! \nPlease enter valid number..!!!\n")
except ZeroDivisionError:
    print("Invalid input...!!!!\nPlease enter value other than zero...!!!")
else:
    print(y,"/",s,"=",z)
