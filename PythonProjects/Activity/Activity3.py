# import
import random

# intro
name = input("Enter your Name: ")
print ("Hello", name)

# input
gnum = random.randint(1, 10)
print ("Try to guess the number ?")
num1 = int(input("> "))
if num1 > gnum:
    print("Lower")
else:
    print("Higher")

# condition
while num1 != gnum:
    num1 = int(input("> "))
    if num1 > gnum:
        print ("Lower")
    else:
        print ("Higher")
print ("Nice one! You guess the number (", gnum,")")

# Presented by Group 5 : MikNay