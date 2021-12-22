import re
a="The book, has it's own_features..!!"
print(re.findall("^The.*!$",a))
print(re.findall("[oua]",a))
print(re.findall("b.{16}n",a))
def example():
    x = re.findall(r"\bit.*n\B", a)
    print(x)

    if x:
        print("Yes, there is at least one match!")
    else:
        print("No match")
example()
print(re.findall("\W|\w",a))
print(re.findall("[^oa et.,]|.!!\Z",a))
def plus():
    s="addition of a+b=20"
    d=re.findall("[+]",s)
    if d:
        print("+ is there")
    else:
        print("+ is NOT there")
plus()
g="time:11:30AM to 12:30PM"
print(re.findall("[0-5][0-3]",g))
print(re.findall("[a-zA-Z]",g))
print(re.findall("[0123]",g))
