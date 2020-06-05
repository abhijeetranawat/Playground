n=int(input())
lst=list(map(int,input().split()))
jump=int(input())
lst1=[]
for i in range(-1,n,jump):
  lst1.append(i)
leng=len(lst1)
for j in range(1,leng):
  for k in range(lst1[j],lst1[j-1],-1):
    print(lst[k],end=" ")
if(lst1[leng-1]<n):
  for h in range(n-1,lst1[leng-1],-1):
    print(lst[h],end=" ")