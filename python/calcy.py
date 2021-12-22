print("__________*Simple Calculator*___________")
def switch():
    a=int(input("Enter 1st number\n:"))
    b=int(input("Enter 2nd number\n:"))
    s=int(input("please select operations:\n1-Addition\n2-Substraction\n3-Multiplication\n4-Division\n:"))

    if s==1:
        print("Addition is:")
        print(a+b)
    elif s==2:
        print("Substraction is:")
        print(a-b)
    elif s==3:
        print("Multiplication is:")
        print(a*b)
    elif s==4:
        print("Division is:")
        print(a/b)
switch()