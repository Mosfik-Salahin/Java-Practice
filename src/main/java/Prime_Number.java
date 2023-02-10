public class Prime_Number {
    public static void main(String[] args)
        {
            int i =0;
            int num =0;
            String prime_num = "";

            for (i = 2; i<=100; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num == 0)
                    {
                        counter = counter + 1;
                    }
                }
                    if (counter ==2)
                    {
                    prime_num = prime_num + i + ", ";
                    }
            }
            System.out.println("Prime numbers from 2 to 100 are:");
            System.out.println(prime_num);
        }
}