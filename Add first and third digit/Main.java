#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d",&n);
  a = n%10;
  n/=10;
  n/=10;
  printf("%d",a+n);
  //Type your code here
  return 0;
}