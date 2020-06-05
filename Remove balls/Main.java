n=int(input())
def ball(n):
  if(n==1 or n==2):
    return 1
  if(n==3):
    return 2
  return ball(n-1)+ball(n-3)
print(ball(n)%1000000007)