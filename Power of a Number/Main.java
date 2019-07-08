#include <stdio.h>
#include<math.h>
int main()
{
  int b,exp;
  scanf("%d %d",&b,&exp);
  if(exp<0)
    printf("Wrong input");
  else
  {
    b = pow(b,exp);
    printf("%d",b);
  }
  
  	//Your code here       
    return 0;
}