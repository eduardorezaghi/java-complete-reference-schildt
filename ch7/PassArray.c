#include <stdio.h>

// PassArray.c - Pass an array to a function
// Compile with: gcc -o PassArray PassArray
// Run with: ./PassArray

void vaTest(int v[], int size) {
    printf("Number of args: %d Contents: ", size);
    
    for (int i = 0; i < size; i++) {
        printf("%d ", v[i]);
    }
    
    printf("\n");
}

int main() {
    // Notice how we can pass an array to a function
    int n1[] = {10};
    int n2[] = {1, 2, 3};
    int n3[] = {};
    
    int size1 = sizeof(n1) / sizeof(n1[0]);
    int size2 = sizeof(n2) / sizeof(n2[0]);
    int size3 = sizeof(n3) / sizeof(n3[0]);
    
    vaTest(n1, size1); // 1 arg
    vaTest(n2, size2); // 3 args
    vaTest(n3, size3); // 0 args
    
    return 0;
}