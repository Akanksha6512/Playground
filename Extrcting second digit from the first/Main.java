#include <stdio.h>
int main() {
	int n,sum=0,temp=0,count=0,n1,x;
  scanf("%d",&n1);
  n = n1;
  while(n!=0)
  {
    temp = n%10;
    sum+=temp;
    n/=10;
    count+=1;
  }
  x = count - 2;
  while(x!=0)
  {
    n1 = n1 /10;
    x--;
  }
  //n1 = n1 / (10^x);
  //printf("%d\n%d\n",n1,count);
  n1 = n1 % 10;
  printf("%d",n1);//Type your code
	return 0;
}