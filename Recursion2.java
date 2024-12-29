public class Recursion2 {
    public static void towerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transferd disk"+n+"from "+src+"to "+dest);

            return ;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transferd disk "+ n +" from "+ src +" to "+ dest);
        towerOfHanoi(-1, help, src, dest );
    }
    public static void main(String[] args) {
        int n =2;
        towerOfHanoi(n, "src", "help", "dest");
    }
}
