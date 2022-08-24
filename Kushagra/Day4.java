Print the pattern which is pascals triangle and have many logics to implement this.
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
  
  sample input = 6
  
  
  formulae to remember for future and important = 
    
    N C R+1 = (N-R) / (R+1) * N C R
    
code and implementation

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int row=0;
        int star=1;
        while(row<n){
            int i=0;
            int val=1;
            while(i<star){
                System.out.println(val + " ");
                val = (val*(row-i))/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }

    }
}
