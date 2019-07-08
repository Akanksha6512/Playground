#include <stdio.h>
int main() {
	int n,i,j=3;
  scanf("%d",&n);
  printf("%d\n",1);
  for(i=1;i<n;i++)
  {
    if(j%2 != 0)
    {
      printf("%d\n",j);
      j++;
    }
    j++;
  }//Type your code
	return 0;
}