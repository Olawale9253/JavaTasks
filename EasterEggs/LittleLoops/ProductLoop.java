public class ProductLoop{

    public static void main(String[] args) {

	int number = 1;

	int product = 1;

	while (number <= 10) {
	
	product = product * number;
	number++;
	}

	System.out.println(product);
    }
}
