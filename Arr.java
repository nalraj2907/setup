import java.util.*;
public class Arr {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][][] = new int[3][n][m];
        for(int k=0;k<3; k++){
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n; j++){
                    arr[k][i][j]=sc.nextInt();
                }   
            }
        }
        int even=0,odd=0;
        for(int k=0;k<3; k++){
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n; j++){
                    //System.out.print(arr[k][i][j] + " ");
                    if(arr[k][i][j] %2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }   
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println();
        System.out.println("The even count is: "+ even);
        System.out.print("The odd count is: "+ odd);

        //for(int i=0 ; i<n ; i++){
        //    System.out.print(arr[i][i] + " ");          // printing diagonal elements.    
        //}

        /* 
        int sum=0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n; j++){
                if(i==j){
                    System.out.print(arr[i][j] + " ");          // printing diagonal elements.

                }
                
            }
        }
        */

         /* 
        int sum=0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n; j++){
                
                sum += arr[i][j];               
            }
        }
        System.out.print(sum);
        */
    }  
}
