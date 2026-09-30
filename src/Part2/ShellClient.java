package Part2;

public class ShellClient {
    public static void main(String[] args) {

        String[] letters = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "R", "O", "C", "K", "S"};

        System.out.println("--------------");
        System.out.print("initial ");
        Shell.show(letters);

        Shell.sort(letters);

        System.out.print("Sorted: ");
        Shell.show(letters);
        System.out.println("Check: " + Shell.isSorted(letters));

        System.out.println();

        Integer[] numbers = {40, 12, 1, 9, 85, 23, 4, 7, 18, 2};

        System.out.println("--------------");
        System.out.print("Initial: ");
        Shell.show(numbers);

        Shell.sort(numbers);

        System.out.print("Sorted: ");
        Shell.show(numbers);
        System.out.println("Check: " + Shell.isSorted(numbers));
    }
}