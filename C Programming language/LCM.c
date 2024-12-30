#include <stdio.h>
#include <conio.h>

void main()
{
    int x,y,i;
    printf("Enter Two Number :\n");
    scanf("%d%d", &x,&y);

    for (int i = x>y ? x:y; i < x*y; i++)
    {
       if(i%x==0 && i%y==0)
       {
        printf("The LCM of Numbers is : %d",i );
        break;
       }
    }
    
    getch();
}