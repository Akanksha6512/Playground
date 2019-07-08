#include <stdio.h>
int main() {
  int n,n1,count=0,temp=0,sum=0;
  scanf("%d",&n1);
  n = n1;
  while(n!=0)
  {
    count++;
    n/=10;
  }
  n = n1;
  while(n!=0)
  {
    temp = n%10;
    sum = sum + (temp*temp*temp);
    //printf("\n%d\n%d\n%d\n",temp,sum,count);
    n/=10;
  }
  //printf("%d",sum);
  if(sum == n1)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}