import java.util.Scanner;
public class Note_Count
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int note[]={1000,500,200,100,50,20,10,5,2,1};
            System.out.print("Enter Amount: ");
            int amt = sc.nextInt();

            int t_notes =0,count =0;
            System.out.println("Note count:");

            for(int i=0;i<10;i++)
            {
                count=amt/note[i];
                if(count!=0)
                {
                    System.out.println(note[i]+"\t: "+count);
                }
                t_notes=t_notes+count;
                amt=amt%note[i];
            }
        }
}
