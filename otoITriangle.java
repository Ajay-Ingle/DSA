public class otoITriangle {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++){
            for(int j=0; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0){
                    System.err.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    
}
