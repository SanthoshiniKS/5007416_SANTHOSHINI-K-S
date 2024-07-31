package digital.nurtures;
import java.util.*;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Library lib=new Library(new ArrayList<>());
        while(true){
            System.out.println("1.Add Book\n2.Search Book\n3.Exit");
            int ch=obj.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Book Id: ");
                    int id=obj.nextInt();
                    System.out.println("Enter Book Name: ");
                    String n=obj.next();
                    System.out.println("Enter Author name: ");
                    String a=obj.next();
                    Book b=new Book(id,n,a);
                    lib.addBook(b);
                    break;
                case 2:
                    System.out.println("Enter Book Name to Search: ");
                    String bn=obj.next();
                    System.out.println("1.Linear Search\n2.Binary Search");
                    int c=obj.nextInt();
                    if(c==1){
                        lib.searchBookByLinearSearch(bn);
                    }
                    if(c==2){
                        lib.searchBookByBinarySearch(bn);
                    }
                    break;
                case 3:
                    return;
            }
        }
    }   
}

//Book Class
class Book{
    int bookId;
    String title;
    String author;
    Book(int id,String t,String a){
        bookId=id;
        title=t;
        author=a;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return "Book Id: "+bookId+"\nBook Name: "+title+"\nAuthor Name: "+author;
    }
}

//Library Class
class Library{
    ArrayList<Book> books;
    Library(ArrayList<Book> b){
        books=b;
    }
    public void addBook(Book b){
        books.add(b);
    }
    public void searchBookByLinearSearch(String n){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getTitle().equals(n)){
                System.out.println(books.get(i));
                return;
            }
        }
        System.out.println("Book Not Found");
    }
    public void searchBookByBinarySearch(String n){
        sort(books);
        int l=0,r=books.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if((books.get(mid).getTitle().compareTo(n))<0){
                l=mid+1;
            }
            else if(books.get(mid).getTitle().equals(n)){
                System.out.println(books.get(mid));
                return;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println("Book Not Found");
    }
    public void sort(ArrayList<Book> books){
        int min=0;
        for(int i=0;i<books.size();i++){
            min=i;
            for(int j=i+1;j<books.size();j++){
                if((books.get(j).getTitle().compareTo(books.get(min).getTitle()))<0){
                    min=j;
                }
            }
            Book b=books.get(i);
            books.set(i,books.get(min));
            books.set(min,b);
        }
    }
}
