import com.sun.tools.javac.Main;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.jar.JarEntry;

public class Window {


    public static Scanner scan = new Scanner(System.in);
    public static char[][] signs = new char[3][3];

    public Window() {

        while (!draw()  ) {     //!win()
            char sign = sign();
            int rowNumber = rowNumber();
            int colNumber = colNumber();
            paintBord(sign, rowNumber, colNumber);
        }

    }

    public static char sign() {
        System.out.println("Enter a sign: ");
        char c = scan.next().charAt(0);
        if (c != 'X' && c != 'x' && c != 'O' && c != 'o') {
            System.out.println("You can enter x / o only!");
            sign();
        }
        return c;
    }

    public static int rowNumber() {
        System.out.println("Enter a row number: ");
        int rowNum = scan.nextInt();
        if (rowNum < 0 || rowNum >= 3) {
            System.out.println("You have to enter number between 0-2 only!");
            rowNumber();
        }
        return rowNum;
    }

    public static int colNumber() {
        System.out.println("Enter a column number: ");
        int colNum = scan.nextInt();
        if (colNum < 0 || colNum >= 3) {
            System.out.println("You have to enter number between 0-2 only!");
            rowNumber();
        }
        return colNum;
    }

    public static boolean isEmpty(int r, int c) {
        return signs[r][c] != 'X' && signs[r][c] != 'x' && signs[r][c] != 'C' && signs[r][c] != 'c';
    }

    public static void paintBord(char s, int r, int c) {
        if (!isEmpty(r, c)){
            System.out.println("This place is already taken, choose another place.");
            rowNumber();
            colNumber();
        }
        signs[r][c] = s;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (r == i && c == j && (j == 2)) {
                    System.out.print("  " + signs[i][j] + " ");
                    continue;
                }
                if (r == i && c == j) {
                    System.out.print("  " + signs[i][j] + " ");
                    System.out.print("|"+"    ");
                    continue;
                }
                if (r == i && c == j+1) {
                    System.out.print("    "+"|");
                    continue;
                }
                if (j == 0 || j == 1) {
                    System.out.print("  " + "" + "  ");
                    System.out.print("|");
                }
                if (j == 2)
                    System.out.print("  " + "" +"  ");
            }
            System.out.println();
            if (i == 2) break;
            System.out.println("--------------");
        }
    }

    public static boolean draw() {
        return !isEmpty(0, 0) && !isEmpty(0, 1) && !isEmpty(0, 2) &&
                 !isEmpty(1, 0) &&!isEmpty(1, 1) &&!isEmpty(1, 2) &&
                !isEmpty(2, 0) &&!isEmpty(2, 1) &&!isEmpty(2, 2);//!win();
    }

//    public static boolean win() {
//        if ((signs[0][0] == signs[0][1] && signs[0][0] == signs[0][2]))
//        return false;
//    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int numToReturn = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if ((haystack.charAt(i)) == needle.charAt(0)) {
                if ((haystack.substring(i, i+needle.length())).equals(needle)) {
                    numToReturn = i+1;
                    break;
                }
            }
        }
        return numToReturn;
    }

    public static int search(int[] nums, int target) {
        int middle = nums.length/2, first = 0, last = nums.length-1;
        while(last >= first ) {
            if (nums[middle] == target) {
                return middle;
            } else if(target <  nums[middle]) {
                last = middle-1;
                middle = (first+last)/2;
            } else {
                first = middle+1;
                middle = (first+last)/2;
            }
        }
        return -1;
    }
        public static void main (String[]args){
        Window mainWindow = new Window();

//            int num = strStr("aaa", "a");
//            System.out.println(num);
//            int[] arr = new int[] {7};
//            System.out.println(search(arr, 7));
        }

}
