#include <stdio.h>
#include <conio.h>

void main()
{
    int r,b=1;
    printf("Enter a Number :");
    scanf("%d",&r);
    for(int i = 1; i<=r; i++){
        b = b*i;  
    }
     printf("factorial of %d is : %d",r,b);

    getch();
}