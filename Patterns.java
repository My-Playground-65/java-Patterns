public class Patterns {
    public static void main(String[] args) {
        
        pattern1(5);
        System.out.println();
        pattern2(5,10);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);


    }

    static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    static void pattern2(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<= (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" "); 
            }
            for(int k = 1; k <= 2*i -1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = n-1; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }














    


}
