/* 15. Implement multiple inheritance in java with one class 
and one interface (use your own class and interface)
Ref.: https://www.programiz.com/java-programming/examples/implement-multiple-inheritance */

interface Backend {
    // abstract class
    public void connectServer();
}

class Frontend {
    public void responsive(String str) {
        System.out.println(str + " can also be used as frontend.");
    }
}

// Language extends Frontend class
// Language implemnts Backend interface
public class Language extends Frontend implements Backend {
    String language = "java";
    
    // implement method of interface
    public void connectServer() {
        System.out.println(language + " can be uesd as backend.");
    }

    public static void main(String[] args) {
        // create object of Language class
        Language java = new Language();

        java.connectServer();

        // all the inherited method of Frontend class
        java.responsive(java.language);
    }
}
