public class butterFly {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
                
                for(int star1=1; star1<=i; star1++){
                    System.out.print("*");
                }

                for(int space=1; space<= 2*(n-i); space++){
                    System.out.print(" ");
                }

                for(int star1=1; star1<=i; star1++){
                    System.out.print("*");
                }

            
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int star1=1; star1<=i; star1++){
                System.out.print("*");
            }
            for(int space=1; space<= 2*(n-i); space++){
                System.out.print(" ");
            }
            for(int star1=1; star1<=i; star1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
       
}
