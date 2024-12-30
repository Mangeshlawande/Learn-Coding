#include <stdio.h>
// #include<conio.h>

void main()
{
    int x[3][3], y[3][3], z[3][3], row, col;
    printf("Enter a row :\t");
    scanf("%d",&row);
    printf("Enter a column :\t");
    scanf("%d", &col);
    printf("Enter First Matrix :\n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            scanf("%d", &x[i][j]);
        }
    }

    printf("Enter Second Matrix :\n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            scanf("%d", &y[i][j]);
        }
    } 

    printf("The addition of two Matrix is:\n");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                z[i][j] = x[i][j] + y[i][j];
            }
        }

    for(int i =0; i<row; i++){
        for(int j = 0; j<col; j++){
            printf("%d\t", z[i][j]);
        }
        printf("\n");
    }

    getch();
}