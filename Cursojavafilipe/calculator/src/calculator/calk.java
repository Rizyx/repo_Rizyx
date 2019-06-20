package calculator;

public class calk {
	double num1;
	double num2;
	double result;
	double num3;

	calk(double num1, double num2, double num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	double soma() {
		return (this.num1 + this.num2);

	}

	double subtrai() {
		return (this.num1 - this.num2);

	}

	double multiplica() {
		return (this.num1 * this.num2) + this.num3;

	}

	double divide() {
		return (this.num1 / this.num2) + this.num3;

	}
}
