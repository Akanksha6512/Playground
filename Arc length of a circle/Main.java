#include<stdio.h>
int main()
{
  float ang,rad;
  scanf("%f %f",&ang,&rad);
  ang = ang/360*2*3.14*rad;
  printf("%.2f",ang);
  return 0;
}