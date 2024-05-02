public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();
        
        LibraryResource book = new Book("Book Title");
        LibraryResource journal = new Journal("Journal Title");
        
        student.borrowResource(book);
        student.borrowResource(journal);
    }
}