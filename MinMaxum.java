#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

/*int compar (const void * a, const void * b)
{
   return ( *(int*)a - *(int*)b );
}*/
int main() {
    long int *arr = malloc(sizeof(int) * 5),sum=0,min=0,temp;
    for(int arr_i = 0; arr_i < 5; arr_i++){
       scanf("%ld",&arr[arr_i]);
    }
    
    //qsort(arr,  5,sizeof(int), compar);
    for(int i = 0; i < 5; i++){
        for(int j=0;j<5;j++)
        {
            if(arr[i]<arr[j])
            {
            temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            
        }
    }
    /*for(int arr_i = 0; arr_i < 5; arr_i++){
        
       //printf("%ld",arr[arr_i]);
    }*/
     for(int arr_i = 1; arr_i < 5; arr_i++){
         min+=arr[arr_i-1];
       sum+=arr[arr_i];
    }
    printf("%ld %ld",min,sum);
    return 0;
}


