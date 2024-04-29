package Concepts.SingleInheritance;

public class ProgrammingLanguage {

    int version;
    String author;

    public ProgrammingLanguage(int version, String author) {
        this.version = version;
        this.author = author;
    }

    public void Car(){
        System.out.println("Maruti");
    }


    //Object is now represented in String format.
    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "version=" + version +
                ", author='" + author + '\'' +
                '}';
    }
}
