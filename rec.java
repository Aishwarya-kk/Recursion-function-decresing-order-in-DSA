public class rec{

    public static void print(int n){
        if(n==1){
            System.out.println();
            return;
        }
    //    else if(n==10){
            
    //         System.out.println("10th position is reached");
    //         return;
    //     }
        System.out.println(n+" ");
        print(n-1);
    }
    public static void main(String args[]){
        int n=15;
        print(n);
    }
}