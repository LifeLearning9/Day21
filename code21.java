import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine().trim();
       int length=0;
       for(int i=s.length()-1;i>=0;i--)
       {
           if(s.charAt(i)==' ')
           break;
           else
            length++;
       }
       
       System.out.println(length);
        }
}
