public class diamondPattern {
    public static void main(String[] args) {
        int n=4;
        // Upper half
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
        }
        for(int k=1; k<=(2*i)-1; k++){
            System.out.print(" *");
        }
        System.out.println();
    }
    // Lower half
    for(int i=n; i>=1; i--){
        for(int j=(n-i); j>=1; j--){
            System.out.print("  ");
        }
        for(int k=(2*i)-1; k>=1; k--){
            System.out.print(" *");
        }
        System.out.println();
    }
    }
}
