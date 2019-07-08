#include <stdio.h>

int main()
{ 
  int max = -1;
  int a,b,c;
  scanf("%d,%d,%d",&a,&b,&c);
  if(max<a)
    max = a;
  if(max<b)
    max = b;
  if(max<c)
    max = c;
  printf("%d",max);
    // type your code here
}