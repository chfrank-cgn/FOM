#include <stdio.h>

int main () {

	int array[8][8] = { 0 };
	int i,j;

	for (i=0; i<8; i++) {
		for (j=0; j<8; j++) {
			printf("%i", array[i][j]);
		}
		printf("\n");
	}
	printf("\n");

	for (i=0; i<8; i++) {
		array[i][i] = 1;
	}

	for (i=0; i<8; i++) {
		for (j=0; j<8; j++) {
			printf("%i", array[i][j]);
		}
		printf("\n");
	}

}
