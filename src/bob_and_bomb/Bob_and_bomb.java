/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob_and_bomb;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Bob_and_bomb {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
        char c;
        int W=0,B=0;
         
         for(int i1=0;i1<t;i1++)
         {
         String s=br.readLine();
         int l=s.length();
          for(int i=0;i<l;i++)
          {
              c=s.charAt(i);
              if(c=='W')
              W++;
              else
                  B++;
                  
          }
          if(W<=2*B)
           System.out.println(W);
          else
               System.out.println(2*B);
             }
        // TODO code application logic here
    }
    
}
