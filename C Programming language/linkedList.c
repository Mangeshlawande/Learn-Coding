#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct node
{ // node having data and next
    int data;
    struct node *next;
};
struct node *start = 0; // global declaration;
struct node *createNode()
{
    struct node *h1;
    h1 = (struct node *)malloc(sizeof(struct node));
    printf("Enter a data:");
    scanf("%d", h1->data);
    h1->next = 0;
    return h1;
};

int insertStart()
{
    struct node *k1;
    k1 = createNode();
    if (start = 0)
    {
        start = k1;
    }
    else
    {
        k1->next = start;
        start = k1;
    }
};
void insertEnd(){

};
void insertMiddle(){

};
void deleteStart(){

};

void deleteEnd(){

};

void deleteMiddle(){

};

void display()
{

    struct node *j1;
    j1 = start;
    while (j1 != 0)
    {
        printf("%d", j1->data);
        j1 = j1->next;
    }
};

void main()
{

    int ch;

    printf("\n1.Insert from start.");
    printf("\n2.Insert from End.");
    printf("\n3.Insert from Middle.");
    printf("\n4.Delete from start.");
    printf("\n5.Delete from End.");
    printf("\n6.Delete from Middle.");
    printf("\n7.Display .");
    printf("\n8.Exit .");
    while (1)
    {
        printf("\n\n Enter your choice : ");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            insertStart();
            break;
        case 2:
            insertEnd();
            break;
        case 3:
            insertMiddle();
            break;
        case 4:
            deleteStart();
            break;
        case 5:
            deleteEnd();
            break;
        case 6:
            deleteMiddle();
            break;
        case 7:
            display();
            break;
        case 8:
            exit(0);
            break;

        default:
            printf("Wrong Input !!!");
            break;
        }
    }
    getch();
}