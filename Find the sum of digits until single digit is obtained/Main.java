#include<stdio.h>
void main()
{
 int n,sum=0;
  scanf("%d",&n);
  while(n>=0)
  {
    if(n==0)
    {
      if(sum/10 == 0)
        break;
      else
      {
        n = sum;
        sum = 0;
      }
    }
    sum+=n%10;
    n/=10;
  }
  printf("%d",sum);
}