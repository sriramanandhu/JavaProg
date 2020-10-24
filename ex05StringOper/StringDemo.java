import java.io.*;
import java.util.*; 
class StringOper {
    Scanner scan=new Scanner(System.in); 
    int n;
    String name;

    ArrayList <String> al=new ArrayList <String>(); 
    
    void createList(){
        System.out.print("Enter the number of strings in the list: "); 
        n=scan.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter a string: ");
            name=scan.next();
            al.add(name);
        }
    }

    void showList(){
        System.out.println("\nList elments"); 
        for(String s1:al){
            System.out.println(s1);
        }
    }

    void appendList(){
        System.out.print("\nEnter a string to append: "); 
        name=scan.next();
        al.add(name);
    }

    void insertList(){
        System.out.print("\nEnter the string to insert: ");
        name=scan.next();
        System.out.print("Enter the location to insert: ");
        int index = scan.nextInt();
        al.add(index-1, name);
    }

    void searchString(){
        System.out.print("Enter a string to search: "); 
        name = scan.next();
        int index = al.indexOf(name);
        if (index > 0)
            System.out.println(name+" is present in the list at "+(index+1)+" location");
        else
            System.out.println(name+" is not available in the list");
    }

    void printList(){
        System.out.print("\nEnter the first character of the name to print: "); 
        char ch=scan.next().charAt(0);
        System.out.println("\nList elements"); 
        for(String s1:al){
            if(s1.charAt(0)==ch){
                System.out.println(s1);
            }
        }
    }
}

class StringDemo{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in); 
        StringOper so=new StringOper();
        int choice;

        so.createList();
        so.showList(); 
        
        while(true){
            System.out.println("\n1.Append");
            System.out.println("2.Insert");
            System.out.println("3.Search");
            System.out.println("4.Print with starting letter"); 
            System.out.println("5.Exit");
            System.out.print("\nEnter your choice: "); 
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    so.appendList();
                    so.showList();
                    break;
                case 2:
                    so.insertList();
                    so.showList(); 
                    break;
                case 3:
                    so.searchString();
                    break;
                case 4:
                    so.printList();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}