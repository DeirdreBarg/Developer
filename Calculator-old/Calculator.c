#include </Users/deirdrebarg/Documents/Developer/libcs50-11.0.2/src/cs50.h>
#include <stdio.h>
#include <string.h>

// Gets valid opperation from user
string getValidOperation() {

    string operation;
    bool doesNeedPrompt = true ;    
    string validMessage = "This is a Valid operation\n"; 

    // Getting a valid opperation
    while (doesNeedPrompt) {
        operation = get_string("What Operation: ");
        if (strcmp("+", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false;
        }
        else if (strcmp("-", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false;
        }
        else if (strcmp("x", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false;
        }
        else if (strcmp("/", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false;
        }
        else if (strcmp("sq", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false; 
        }
        else if (strcmp("ex", operation) == 0 ) {
            printf("%s", validMessage);
            doesNeedPrompt = false; 
        }
        else {
            printf("this is not a valid operation\n");
        } 
    }

    return operation;
}

void performOperation(string operation, int x, int y) {    
    // Doing the opperation
    if (strcmp("+", operation) == 0) {
        printf("%d\n", x + y);
    }else if (strcmp("-", operation) == 0) {
        printf("%d\n", x - y);
    }else if (strcmp("/", operation) == 0) {
        printf("%d\n", x / y); 
    }else if (strcmp("x", operation) == 0) {
        printf("%d\n", x * y);
    }
}


int main(void)
{
    // Intro message
    printf("Welcome to my first Calculator. You can use + , - , x , / , sq = square root , ex = exponent\n ");

    // string operation = getValidOperation();

    // Getting x and y values
    int x = get_int("x: ");
    int y = get_int("y: ");

    // performOperation(operation, x, y);
    performOperation(getValidOperation(), x, y);

    // TODO: What order is things going to happne in???
  }
