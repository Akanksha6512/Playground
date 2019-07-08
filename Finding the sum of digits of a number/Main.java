#include <stdio.h>
int main() {
	int n,sum=0,temp=0;
  scanf("%d",&n);
  while(n!=0)
  {
    temp = n%10;
    sum+=temp;
    n/=10;
  }
  printf("%d",sum);//Type your code
	return 0;
}