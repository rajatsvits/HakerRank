
#include<stdio.h>
#define MAX 100005
int main()
{
	int n,k,i,arr[MAX],modulus[200]={0},count=0;
	scanf("%d%d",&n,&k);
	for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	for(i=0;i<n;i++)
	{
		modulus[arr[i]%k]++;
	}
	for(i=0;i<=k/2;i++)
	{
		if(i == 0 && modulus[i] > 0)
		{
			count+=1;
		}
		else if(i == k-i && modulus[i] > 0)
		{
			count+=1;
		}
		else if(modulus[i] > modulus[k-i])
		{
			count+=modulus[i];
		}
		else
		{
			count+=modulus[k-i];
		}
	}
	printf("%d",count);
}
