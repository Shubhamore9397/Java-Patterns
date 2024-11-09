public class patterns {
    // Star pattern
    // *
    // **
    // ***
    // ****
    public static void star_pattern(int line) {
        for (int i = 1; i <= line; i ++) {
            //one line 
            for (int j = 1; j <= i ;j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     star_pattern(4);
    // }

    //inverted star pattern
    // ****
    // ***
    // **
    // *
    public static void inverted_star_pattern(int n) {
        for (int i = 1; i <= n; i ++) {
            //one line 
            for (int j = 1; j <= n-i+1; j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    // }
    // public static void main(String[] args) {
    //     inverted_star_pattern(4);
    // }
    }

    //Half-Pyramid Pattern
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5
    public static void half_pyramid(int n) {
        for (int i = 1; i <= n; i ++) {
            //print numbers 
            for (int j = 1; j <= i; j ++) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     half_pyramid(5);
    // }

    //Print Character pattern
    // A
    // BC
    // DEF
    // GHIJ
    // KLMNO
    public static void char_pattern(int n) {
        char ch = 'A';
        //for outer loop
        for (int i = 1; i <= n; i ++) {
            //for inner loop
            for (int chars = 1; chars <= i; chars ++) {
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    }
    //  public static void main(String[] args) {
    //     char_pattern(5);
    // }

    
         //Advance patterns
    //print hollow rectangle pattern

    // *****
    // *   *
    // *   *
    // *   *
    // *****

    public static void hollow_rectangle(int rows, int cols) {
        //outer loop
        for (int i = 1; i <= rows; i ++) {
            //inner loop
            for (int j = 1; j <= cols; j ++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     hollow_rectangle(5, 5);
    // }

    //Mirror image of half-pyramid

//      *
//     **
//    ***
//   ****
//  *****
    public static void mirror_pyramid(int n){
        //outer loop
        for (int i = 1; i <= n; i ++) {
            //spaces loop
            for (int j = 1; j <= n- i; j ++) {
                System.out.print( " ");
            }
            //stars loop
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     mirror_pyramid(5);
    // }

    //Square number pattern

    // 1 2 3 4 5 
    // 2 3 4 5 6 
    // 3 4 5 6 7 
    // 4 5 6 7 8 
    // 5 6 7 8 9
    
    public static void SqNo_Pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+j-1 + " ");
            }
            System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     SqNo_Pattern(5);
    // }

    //Inverted Half-Pyramid with numbers

 // 1 2 3 4 5 
 // 1 2 3 4 
 // 1 2 3 
 // 1 2 
 // 1 
    public static void inverted_pyramid(int n){
        //outer loop
        for (int i = 1; i <= n; i ++) {
            //inner loop
            for (int j = 1; j <=n-i+1; j ++) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     inverted_pyramid(5);
    // }

    //Floyd's Triangle

    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15

    public static void floyd_triangle(int n){
        int counter = 1;
        //outer loop
        for (int i = 1; i <= n; i ++) {
            //inner loop
            for (int j = 1; j <= i; j ++) {
                System.out.print(counter + " ");
                counter++;
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     floyd_triangle(5);
    // }

    // Zero-one Triangle

    // 1 
    // 0 1 
    // 1 0 1 
    // 0 1 0 1 
    // 1 0 1 0 1

    public static void zero_one(int n){
        //outer loop
        for (int i = 1; i <= n; i ++) {
            //inner loop
            for (int j = 1; j <= i; j ++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
        System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     zero_one(5);
    // }

    //Butterfly pattern

    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *

    public static void butterfly(int n){
        //1st Half
        for (int i = 1; i <= n; i ++) {
            //stars
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(n-i); j ++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
        System.out.println();
        }

        //2nd Half
        for (int i = n; i >= 1; i --) {
            //stars
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(n-i); j ++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    // public static void main(String[] args) {
    //     butterfly(5);
    // }
            //Rhombus

//     *****
//    *****
//   *****
//  *****
// *****

public static void rhombus(int n){
    for (int i = 1; i<= n; i++){
        //spaces
        for (int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
// public static void main(String[] args) {
//     rhombus(5);
// }

// Hollow Rhombus

//      *****
//     *   *
//    *   *
//   *   *
//  *****

public static void hollow_rhombus(int n){
    for (int i = 1; i<= n; i++){
        //spaces
        for (int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= n; j++){
            if (i == 1 || i == n || j == 1 || j == n){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
// public static void main(String[] args) {
//     hollow_rhombus(5);
// }

// Diamond pattern

//      *
//     ***
//    *****
//   *******
//  *********
//  *********
//   *******
//    *****
//     ***
//      *

public static void diamond(int n){
    //1st Half
    for (int i = 1; i <= n; i ++) {
        //spaces
        for (int j = 1; j <= n-i; j ++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= 2*i-1; j ++) {
            System.out.print("*");
        }
    System.out.println();
    }
    //2nd half
    for (int i = n; i >= 1; i --) {
        //spaces
        for (int j = 1; j <= n-i; j ++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= 2*i-1; j ++) {
            System.out.print("*");
        }
    System.out.println();
    }
}
// public static void main(String[] args) {
//     diamond(5);
// }

//Number pyramid

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5

public static void num_pyramid(int n){

    for (int i = 1; i <= n; i ++) {
        //spaces
        for (int j = 1; j <= n-i; j ++) {
            System.out.print(" ");
        }
        //numbers
        for (int j = 1; j <= i; j ++) {
            System.out.print(i + " ");
        }
    System.out.println();
    }
}
// public static void main(String[] args) {
//     num_pyramid(5);
// }

//Palindromic pattern with numbers

//      1
//     212
//    32123
//   4321234
//  543212345

public static void palindrome(int n){
    for (int i = 1; i <= n; i ++) {
        //spaces
        for (int j = 1; j <= n-i; j ++) {
            System.out.print(" ");
        }
        //Descending
        for (int j = i; j >= 1; j --) {
            System.out.print(j);
        }
        //Ascending
        for (int j = 2; j <= i; j ++) {
            System.out.print(j);
        }
    System.out.println();
    }
}
// public static void main(String[] args) {  
//     palindrome(5);
// }
}       