class Library{
    String [] books;
    int no_of_books;
    Library(){
        
        this.books=new String[100];
        int no_of_books=0;

    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ "  has been added ");
    }
    void showAvailableBooks(){

        System.out.println("<=====XXXXXXXXXXXXXXXXX========>");
        System.out.println("Available Books are:");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* " +book);

        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            
            if(this.books[i].equals(book)){
                System.out.println("The book has been Issued are:  "+book);
                this.books[i]=null;
                return;
            }
            

        }
        System.out.println("This Book does not exist");

    }

    void returnBook(String book){
        addBook(book);
    }


}

public class library_management_system {
public static void main(String[] args) {
    // you have to implements a library using java class "Library"
    // methods:addBook,issueBook,returnBook,showAvailableBooks
    // properties :Array to store the available books,Array to store the issued books

    Library L=new Library();
    L.addBook("rich dad poor dad");
    L.addBook("DSA");
    L.addBook("PYTHON");
    L.addBook("JAVA");
    L.showAvailableBooks();
    L.issueBook("JAVA");
    L.showAvailableBooks();
    L.returnBook("JAVA");
    L.showAvailableBooks();
}
    
}