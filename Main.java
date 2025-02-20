import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;

		do {
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			switch (choice) {
				case 1: // Tea
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;

			}

		} while (choice != 3);
		findAveragePrice(inventory, inventory.length);
	}

	public static double findAveragePrice(CaffeinatedBeverage[] inventory, int count) {
		double total = 0;
		for (int i = 0; i < count; i++) {
			// double accu = 0;
			// accu = accu + inventory[i].getPrice();
			// accu = (accu / inventory.length);
			// return accu;
			total += inventory[i].getPrice();
		}
		return total / count;
	}
}