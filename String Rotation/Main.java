str1=input()
str2=input()
if(len(str1)==len(str2)):
  str1=str1+str1
  if(str2 in str1):
    print("Yes")
  else:
    print("No")
else:
  print("No")