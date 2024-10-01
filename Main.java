import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[][] mat=new int[n][n]; 
      
      magicMatrix(mat,n);
  }
  static void magicMatrix(int[][] mat,int n){
    int pi=0;
    int pj=n/2;
    int pl=0;
    while(pl<n*n){
        if(mat[pi][pj]==0){
        mat[pi][pj]=++pl;
        
        if(pi==0&&pj==n-1){
          pi=n-1;
          pj=0;
        }
        else if(pi==0){
          pi=n-1;
          pj+=1;
        }
        else if(pj==n-1){
          pj=0;
          pi-=1;
        }
        else
        {
        pi-=1;
        pj+=1;
      }
          
        }
        else{
          //pj-=1;
          //pi+=2;
          if(pi==n-1&&pj==0){
            pj=n-1;
            pi=1;
          }
          else if(pi==n-2&&pj==0){
            pj=n-1;
            pi=0;
          }
          else if(pj==0){
            pj=n-1;
            pi+=2;
          }
          else if(pi==n-1){
            pi=1;
            pj-=1;
            
          }
          else if(pi==n-2){
            pi=0;
            pj-=1;
          }
          else {
            pi+=2;
            pj-=1;
          }
        }
        
        
        print(mat,n);
      }
    }
    
  
  static void print(int[][] mat,int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println();
  }
}
