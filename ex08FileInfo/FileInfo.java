import java.io.*; 
import java.util.*; 

class FileInfo{
    public static void main(String[] args) throws IOException{ 
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter a file name: ");
        String fname=scan.next(); 
        File f1=new File(fname); 

        if (f1.exists()) {
            System.out.println("file "+fname+" is exists");
        }
        else {
            System.out.println("Sorry "+fname+" does not exists"); 
            System.exit(0);
        }

        if (f1.canRead()) {
            System.out.println(fname+" is readable");
        }
        else {
            System.out.println(fname+" is not readable");
        }

        if (f1.canWrite()) {
            System.out.println(fname+" is writadable");
        }
        else {
            System.out.println(fname+" is not writable");
        }
        
        if (fname.endsWith(".java")){ 
            System.out.println(fname+" is a java file");
        }
        else if (fname.endsWith(".txt")) { 
            System.out.println(fname+" is a text file");
        }
        else if (fname.endsWith(".class")){ 
            System.out.println(fname+" is a class file");
        }
        else if (fname.endsWith(".doc")){ 
            System.out.println(fname+" is a document file");
        }
        else {
            System.out.println("Unknown type");
        }
        System.out.println("File size is: "+f1.length()+" bytes");
    }
}
    