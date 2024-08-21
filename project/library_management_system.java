class Library{
    String [] books;
    int no_of_books;
    Library(){
        System.out.println("---->>>>>>We are come into the Library Management System<------");
        System.out.println("<=====XXXXXXXXXXXXXXXXX========>");
        System.out.println("Added  Books are:");
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
         System.out.println("<=====XXXXXXXXXXXXXXXXX========>");
         System.out.println("Issued book Are:");

        for(int i=0;i<this.books.length;i++){
            
           if(this.books[i]==book){
                System.out.println("the book has been issued are :"+book);
                this.books[i]=null;
                return;
            }
            

        }
        System.out.println("This Book does not exist");

    }

    void returnBook(String book){
        System.out.println("<=====XXXXXXXXXXXXXXXXX========>");
        System.out.println("Return Book Are:");
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
