#include <stdio.h>
#include <math.h>

int main() {

	float x0, x1, epsilon, residual;
	x0 = 0.0; x1 = 0.0; epsilon = 0.000005; residual = 0.0;
	int k = 0;

	/*
	 * Newtonverfahren - f(x) = x^2 - 2*x - 0.15
	 */
	printf("k\tX0\tX1\tResiduum\n");

	do {
		x0 = x1;
		x1 = x0 - (((x0 * x0) - (2 * x0) - 0.15) / ((2 * x0) - 2));
		residual = fabs(x0 - x1);
		k++;

		printf("%i\t%.5f\t%.5f\t%.5f\n",k,x0,x1,residual);

	} while (fabs(residual) > epsilon);

	return 0;
}
