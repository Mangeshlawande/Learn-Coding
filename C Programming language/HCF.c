#include <stdio.h>
// #include <conio.h>

void main()
{
    int a, b, i;
    printf("Enter two numbers :\n");
    scanf("%d%d",&a,&b);
    for(i = a<b ? a:b; i>0; i--)
    {
        if(a%i==0 && b%i ==0)
        {
            printf("The HCF of %d and %d is: %d",a,b,i);
            break;
        }
    }
    getch();
}