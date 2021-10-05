import java.util.*;
import java.Scanner;
public class Books {
    public static void main(String args[]){
        System.out.println("Enter numbr of books that you want to enter:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String publisher[n];
        String title[n];
        String author[n];
        int cost[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter details of book "+ (i+1) + " :");
            System.out.println("publisher:");
            publisher[i]=sc.nextString();
            System.out.println("title:");
            title[i]=sc.nextString();
            System.out.println("author:");
            author[i]=sc.nextString();
            System.out.println("publisher:");
            publisher[i]=sc.nextString();
        }

    }
    Books(){

    }
    getdata(){

    }
    
}
