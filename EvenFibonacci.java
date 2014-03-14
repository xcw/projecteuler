package euler;


public class EvenFibonacci
{

    private int generateEvenFibonacci()
    {
        int evenFibonacci = 2;

        int sum = 2;

        int head = 1;
        int tail = 2;

        int fibonacci = tail + head;

        while (true)
        {
            if (fibonacci % 2 == 0)
            {
                evenFibonacci = fibonacci;
                if (evenFibonacci > 4000000)
                {
                    break;
                }
                System.out.println(fibonacci);
                sum += evenFibonacci;
            }

            head = tail;
            tail = fibonacci;

            fibonacci = tail + head;

        }

        System.out.println("The sum of all even Fibonacci numbers below 4 million: " + sum);
        return sum;
    }


    public static void main(String[] args)
    {

        EvenFibonacci ef = new EvenFibonacci();
        System.out.println();
        ef.generateEvenFibonacci();
    }

}
