#include<stdio.h>
int main()
{
  int n[3],sum=0;
  for(int i=0;i<3;i++)
  {
    scanf("%d",&n[i]);
    sum+=n[i];
  }
  sum/=3;
  printf("%d",sum);
  
  //Type your code here
  return 0;
}