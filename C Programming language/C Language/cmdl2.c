// first compile the code then enter arguments through commands;
//  cmdl2 11  22 33 


#include<stdio.h>
#include<stdlib.h>
// #include<conio.h>


void main(int argc, char *argv[]){
    int i, s,t,u;
    
    s = atoi(argv[1]);
    t = atoi(argv[2]);
    u = atoi(argv[3]);
    
    
    if(s>t && s> u)
    {
        printf("%d is greater. ",s);
    }
    else if(t>s && t>u)
    {
        printf("%d is greater. ",t);
    }
    else
    {
        printf("%d is greater. ",u);
    }
    getch();
}