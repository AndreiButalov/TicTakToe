import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[][] feld = new char[3][3];
    static int[][] arr = new int[3][3];
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(feld));
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        playerOne(2,0);
        playerOne(1,1);
        playerOne(0,2);

        System.out.println(Arrays.deepToString(feld));
        System.out.println(Arrays.deepToString(arr));

        controle();
    }
    public static void controle(){
        diogonalControle();
        verticalControle();
        horisontalControle();
    }
    public static void playerOne(int horisontal, int vertikale){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if(feld[horisontal][vertikale] == 0){
                    feld[horisontal][vertikale] = 'X';
                    arr[horisontal][vertikale] = 1;
                    return;
                }else{
                    System.out.println("Die werte ist schon eingetragen!");
                    return;
                }
            }
        }
    }

    public static void playerTwo(int horisontal, int vertikale){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if(feld[horisontal][vertikale] == 0){
                    feld[horisontal][vertikale] = '0';
                    arr[horisontal][vertikale] = -1;
                    return;
                }else{
                    System.out.println("Die werte ist schon eingetragen!");
                    return;
                }
            }
        }
    }
    public static void diogonalControle(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[0][0] + arr[1][1] + arr[2][2] == 3 || arr[2][0] + arr[1][1] + arr[0][2] == 3){
                    System.out.println("Player One ist gewonnen");
                    return;
                }
                if (arr[0][0] + arr[1][1] + arr[2][2] == -3 || arr[2][0] + arr[1][1] + arr[0][2] == -3) {
                    System.out.println("Player Two ist gewonnen");
                    return;
                }
            }
        }
    }
    public static void verticalControle(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[0][0] + arr[1][0] + arr[2][0] == 3 || arr[0][1] + arr[1][1] + arr[0][1] == 3 || arr[0][2] + arr[1][2] + arr[2][2] == 3) {
                    System.out.println("Player One ist gewonnen");
                    return;
                }
                if (arr[0][0] + arr[1][0] + arr[2][0] == -3 || arr[0][1] + arr[1][1] + arr[2][1] == -3 || arr[0][2] + arr[1][2] + arr[2][2] == -3){
                    System.out.println("Player Two ist gewonnen");
                    return;
                }
            }
        }
    }
    public static void horisontalControle(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[0][0] + arr[0][1] + arr[0][2] == 3 || arr[1][0] + arr[1][1] + arr[1][2] == 3|| arr[2][0] + arr[2][1] + arr[2][2] == 3){
                    System.out.println("Player One ist gewonnen");
                    return;
                }
                if (arr[0][0] + arr[0][1] + arr[0][2] == -3 || arr[1][0] + arr[1][1] + arr[1][2] == -3|| arr[2][0] + arr[2][1] + arr[2][2] == -3) {
                    System.out.println("Player Two ist gewonnen");
                    return;
                }
            }
        }
    }
}
