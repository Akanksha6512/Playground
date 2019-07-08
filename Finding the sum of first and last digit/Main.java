#include <stdio.h>
int main() {
	int n,sum=0,temp=0,count=0,n1,x=0;
  scanf("%d",&n1);
  n = n1;
  while(n!=0)
  {
    sum = n;
    temp = n%10;
    //sum+=temp;
    n/=10;
    //count+=1;
  }
  x = n1 % 10;
  x = x + sum;
  //y = n1 % 10^
  printf("%d",x);//Type your code
	return 0;
}