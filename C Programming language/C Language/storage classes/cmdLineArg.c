/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

void f1(){
    auto n = 89;
    static int x = 6;
    x = x-2;
    printf("%d ",x+x-(-x));
}

 int h;// global variable
int main( int argc, char * argv[])
{
    for(int i = 1; i<argc;i++){// a[0] print file name 
    printf("%s ",argv[i]);
        
    }
    

    return 0;
}

// ==========================================================================================
/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

 int h;// global variable
int main( int argc, char * argv[])

{   
    int a[argc];
    int i, s=0;
    
    // for character array
    // for(int i = 1; i<argc;i++){// a[0] print file name 
    // printf("%s ",argv[i]);
    // }
    // for integer array;
        
    for(int i = 1; i<argc;i++){// a[0] print file name 
    
    a[i-1] = atoi(argv[i]);// type casting character to integer
    // printf("%d ",argv[i]);
    }
    for(int i = 0; i<argc-1; i++)
    {
        // printf("%d ",a[i]);
        s = s + a[i];
    } 
    printf("The sum of Numbers is: %d ", s);
    

    return 0;
}

// ==========================================================================================

// Certainly! Converting a character array (string) to an integer array in C without using predefined functions involves manually parsing each character and converting it to its integer representation. Here's a simple program that demonstrates this process:
// */


#include <stdio.h>

int main() {
    char charArray[] = "12345";  // Example character array
    int intArray[sizeof(charArray) - 1];  // Integer array to store converted values
    
    // Convert character array to integer array

    int i;
    for (i = 0; charArray[i] != '\0'; i++)
     {
        intArray[i] = charArray[i] - '0';  // Convert character to integer
    }
    
    // Print the integer array
    printf("Integer array: ");
    for (int j = 0; j < i; j++) {
        printf("%d ", intArray[j]);
    }
    printf("\n");
    
    return 0;
}


/*
### Explanation:

1. **charArray[]**: This is the character array (`char` array) that contains the characters representing digits ('0' to '9').

2. **intArray[]**: This is the integer array (`int` array) where we will store the converted integer values.

3. **Conversion Process**:
   - We loop through each character in `charArray` using an index `i`.
   - Inside the loop, `charArray[i]` gives us the current character.
   - We convert this character to its integer equivalent by subtracting the character '0' (`'0'` has ASCII value 48, so subtracting '0' from any digit character ('0'-'9') gives the corresponding integer value).
   - We store the resulting integer in `intArray[i]`.

4. **Printing the Integer Array**:
   - After conversion, we loop through `intArray` and print each integer.

### Notes:
- The program assumes the character array is null-terminated (`'\0'`).
- This approach works only for strings containing digits ('0'-'9'). Handling negative numbers or non-digit characters would require additional logic.
- This is a basic example; in practical scenarios, error handling (such as checking for non-digit characters) and more robust input validation would be necessary.

This method gives a fundamental understanding of how character-to-integer conversion works in C without relying on library functions like `atoi` or `sscanf`.
*/