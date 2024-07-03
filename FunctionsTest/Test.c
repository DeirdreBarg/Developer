#include <stdio.h>
#include <assert.h>



// Given a number
// return 0 if even and 1 if odd
int isEven(int num) {
    return (num % 2 != 0);
}


// Given a list of numbers, return how many are even
// size is the number of numbers in nums
int numberOfEven(int nums[], int size) {    
    int counter = 0;
    for(int i = 0; i < size; i++) {        
        if (nums[i] % 2 == 0) 
        {
            counter++;
        }  
    }
    return counter;
}

// Given a list of numbers, return how many values of k there are
// size is the number of numbers in nums
int numberOfNumber(int nums[], int k, int size) {
    int counter = 0;
    for (int i = 0; i < size; i++) {
        int value = nums[i];
        if (value == k)
        {
            counter++;
        } 
    }
    return counter;
}

void pointerExample() {

    int x = 10;
    int *ptr = &x;

    printf("Value of x: %d\n", x);  // Output: Value of x: 10
    printf("Address of x: %p\n", (void*)&x);  // Output: Address of x: some_address
    printf("Value of ptr: %p\n", (void*)ptr);  // Output: Value of ptr: some_address (should be same as address of x)
    ptr++;
    printf("Value of ptr after add: %p\n", (void*)ptr);  // Output: Value of ptr: some_address (should be same as address of x)
    printf("Dereferencing ptr: %d\n", *ptr);  // Output: Dereferencing ptr: 10 (should be same as value of x)
}

// Given a list of numbers, return a list that is a reverse of the original list
// nums: array of numbers
// 
int reverseList(int nums[], int size) {
    return 0;
}


int main(void) {
    assert(isEven(8) == 0);
    assert(isEven(13) == 1);
    
    int myArray[5] = {1, 2, 3, 4, 5};    
    assert(numberOfEven(myArray, 5) == 2);
    assert(numberOfNumber(myArray, 3, 5) == 1);

    int myArray2[5] = {1, 2, 2, 3, 7};
    assert(numberOfNumber(myArray2, 2, 5) == 2);

    // new assertion here
    assert(numberOfNumber(myArray2, 5, 5) == 0);


    int myArray3[9] = {1, 2, 2, 3, 7, 4, 4, 4, 4};
    assert(numberOfNumber(myArray3, 4, 8) == 3);

    pointerExample();
}