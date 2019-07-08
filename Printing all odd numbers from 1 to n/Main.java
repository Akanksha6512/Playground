#include <stdio.h>
int main() {
	int n,i;
  scanf("%d",&n);
  printf("%d\n",1);
  for(i=3;i<=n;i++)
  {
    if(i%2 != 0)
    {
      printf("%d\n",i);
    }
  }//Type your code
	return 0;
}