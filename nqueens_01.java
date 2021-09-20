import java.util.*;
import java.io.*;
public class Main
{
     public static void main(String[] args)
     {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        
        printNQueens(0,0,"",0,N);
     }
     
     public static void printNQueens(int r,int c,String psf,int qpsf,int n)//qpsf -> queen placed do far || psf -> print so far
     {
         if(c == n)
         {
             r = r+1;
             c = 0;
         }
         
         if(r == n)
         {
             if(qpsf == n)
             {
                 System.out.println(psf);
             }
             return;
         }
         
         //choice -> yes 
         printNQueens(r,c+1,psf+r+c+"-",qpsf+1,n);
         
         //choice -> no
         printNQueens(r,c+1,psf,qpsf,n);
     }
     
} 