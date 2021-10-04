import java.util.Scanner;

class pattern11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            char x = 'A';
            for(int j = 1; j <= i; j++)
            {
                System.out.printf("%c", x++);
            }
            System.out.println();
        }
    }
}