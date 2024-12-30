#include <stdio.h>
#include <conio.h>

void main()
{
    printf("Star Patterns in C :\n");

    // int i, j ; 
    // for (i=0 ; i< 5; i++){
    //     for (j=0; j<5; j++){
    //         if(j<5-i)
    //         {
    //         printf("*");
    //         }
    //         else
    //         {
    //             printf(" ");
    //         }
    //     }
    //     printf("\n");
    // }
    

    //  int i, j ; 
    // for (i=0 ; i< 5; i++){
    //     for (j=0; j<5; j++){
    //         if(j>i)
    //         {
    //         printf("*");
    //         }
    //         else
    //         {
    //             printf(" ");
    //         }
    //     }
    //     printf("\n");
    // }

    //  int i, j ; 
    // for (i=0 ; i< 5; i++){
    //     for (j=0; j<5; j++){
    //         if(j<5-i)
    //         {
    //         printf("*");
    //         }
    //         else
    //         {
    //             printf(" ");
    //         }
    //     }
    //     printf("\n");
    // }


    
     int i, j ; 
    for (i=0 ; i< 5; i++){
        for (j=0; j<5; j++){
            if(j<=i)
            {
            printf("%d",i+1);
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    getch();
}