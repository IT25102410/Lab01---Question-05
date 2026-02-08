class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }
    
    int multiply(int a, int b) {
        return a * b;
    }

     int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);

        
        int sumA = calc.add(4, 7);
        int squareA = calc.square(sumA);

        int sumB = calc.add(8, 3);
        int squareB = calc.square(sumB);

        int result2 = calc.add(squareA, squareB);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
