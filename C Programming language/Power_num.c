#include <stdio.h>
#include <conio.h>

void main()
{
    // 4 power 3 = 64
    // 2pow(7) = 128;
    int c=0,  p=0, s=1;
    printf("Enter a coefficient :");
    scanf("%d", &c);
    printf("Enter a Power:");
    scanf("%d", &p);
for(int i = 1; i<=p; i++){
    s = s*c;
}
printf("The %d power of(%d) is: %d " , c,p,s );
    getch();
}