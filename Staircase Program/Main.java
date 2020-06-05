lst=[1,2,3,5]
n=int(input())
if(n<=len(lst)):
  print(lst[n-1])
else:
  for i in range(4,n):
    lst.append(lst[i-1]+lst[i-2])
  print(lst[n-1])