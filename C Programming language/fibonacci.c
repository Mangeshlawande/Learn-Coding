#include <stdio.h>
#include <conio.h>

int main()
{
    int r , a = -1, b = 1 , c, i;
    printf("Enter a range :");
    scanf("%d", &r);

    for(i = 0; i<r; i++) {
        c = a+b;
        printf("%d ",c);
        a = b;
        b = c;

    }
    return 0;
}

/*Enter a range :5
0 1 1 2 3 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :1
0 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :2
0 1 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :3
0 1 1 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :4
0 1 1 2 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :5
0 1 1 2 3 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :6
0 1 1 2 3 5 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :7
0 1 1 2 3 5 8 
PS C:\Users\mange\Desktop\TIME\Coding sikho\C Programming language> cd "c:\Users\mange\Desktop\TIME\Coding sikho\C Programming language\" ; if ($?) { gcc intro.c -o intro } ; if ($?) { .\intro }
Enter a range :8
0 1 1 2 3 5 8 13 */