#include <stdio.h>
int main() {
  int n,temp,fact,sum=0,n1;
  scanf("%d",&n1);
  n = n1;
  while(n!=0)
  {
    temp = n % 10;
    fact = 1;
    while(temp != 1)
    {
      fact = fact * temp;
      temp--;
    }
    sum+=fact;
    n/=10;
  }
  if(sum ==  n1)
  {
    printf("Yes");
  }
  else
    printf("No");
	//Type your code
	return 0;
}