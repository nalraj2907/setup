import java.util.*;

class Vowel{
    public static void main (String[] ar){
         /*int c=0;

        String a="nAlraj";
        a=a.toLowerCase();
        for(int i=0 ; i<a.length() ; i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
                c++;
            }
        }
        System.out.print(c); 
*/
        //String a="nal raj";
        //System.out.println(a.replace(' ', '-'));
        
        //String a="nal raj ";
        //System.out.println(a.replace(" ", "" ));
        
        /* Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        StringBuilder b = new StringBuilder(n);
        System.out.println(System.identityHashCode(b));
        b.append("ram");
        System.out.println(b);
        System.out.println(System.identityHashCode(b));

     // string reverse
        String a="nalraj";
        StringBuffer sb=new StringBuffer(a);
        sb.reverse();
        System.out.println(sb);
      

        // delete  m to n  values
        String a="nalrajnuyfiguiyf";
        int n=6,m=a.length();
        StringBuffer sb=new StringBuffer(a);
     
            sb.delete(5,6);
        
        //sb.reverse();
        //String s=sb.toString();
        System.out.println(sb);

        */ 

        String a= "nalan";
        String b="";

        
            for(int i=a.length()-1;i>=0;i--){
                b=b + a.charAt(i);
            }
                if(a.equalsIgnoreCase(b)){
                    System.out.println("palidrome");

                }else{
                    System.out.println("not palidrome");

                }

    }
}