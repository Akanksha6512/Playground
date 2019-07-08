#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  a = pow(a,2);
  b = pow(b,2);
  a = a+b;
  a = sqrt(a);
  printf("%.2f",a);
  //Type your code here
  return 0;
}