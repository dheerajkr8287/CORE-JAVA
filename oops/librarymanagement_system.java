
class library{
    String books[];
    int no_of_books;

    library(){
        this.books=new String[100];
        no_of_books=0;
    }


    public void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ "  has been added ");


    }

    public void showAvailableBook(){
        System.out.println("Available book are:");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    public void issueBook(String book){
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
        addBook(book);
    }

}

public class librarymanagement_system {
    public static void main(String[] args) {
        library L=new library();
        L.addBook("math");
        L.addBook("Science");
        L.addBook("sst");
        L.addBook("hindi");
        L.addBook("gk");
        L.addBook("english");
        L.showAvailableBook();
        L.issueBook("gk");
        L.showAvailableBook();
        L.returnBook("gk");
        L.showAvailableBook();

    }
}
