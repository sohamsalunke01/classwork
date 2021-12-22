n=int(input("Enter a number:"))
s=0
m=n
while m>0:
    d=m%10
    s+=d**3
    m//=10
if n==s:
    print(n,"is an Armstrong number")
else:
    print(n,"is an Not Armstrong number")