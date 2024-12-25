public class palindromicPattern {
    public static void main(String[] args) {
        int n=5 ;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
        }
        int x=i;
        for(int k=1; k<=i; k++){
            System.out.print(" "+x);
            x--;
        }
        if(i==1){
            System.out.println();
        }
        else{
            
            for(int m=2; m<=i; m++){
                System.out.print(" "+m);
                
            }
            System.out.println();
        }
    }
    }
}
