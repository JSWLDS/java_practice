import java.util.Scanner;

public class BookManager {

    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >> ");
        String name = scan.next();
        System.out.println(name + "님 안녕하세요.");
        
        Book b1 = new Book("이것이 자바다", "신용권", 100);
        Book b2 = new Book("정보보안개론", "양대일", 200);
        Book b3 = new Book("모의해킹이란 무엇인가", "조정원", 300);
        //Book b4 = new Book("인생의 태도", "웨인 다이어", 400);
        Book b4 = new Book();
        b4.title = "인생의 태도";
        b4.writer = "웨인 다이어";
        b4.number = 400;
        
        System.out.println
        ("현재 대여 가능한 책은 " + Book.book_count + " 권 입니다.");
    
        b1.rantal();
        b2.rantal();
        b3.rantal();
        b1.back();
        b3.back();
        b2.check();
        b3.check();
        
        System.out.println
        ("현재 대여 가능한 책은 " + Book.book_count + " 권 입니다.");
    
    }
}

class Book{
    String title;
    String writer;
    int number;
    boolean pos;
    static int book_count; // 변수 5 개
    
    public Book() { book_count++; }
    public Book(String t, String w, int n ) {
        title = t;
        writer = w;
        number = n;
    } // 생성자 2개

    public void rantal() {
        book_count--;
        System.out.println(number + "번 대여 완료");
        pos = false;
    }
     public void back() {
         book_count++;
         System.out.println(number + "번 반납 완료");
         pos = true;
     }
    public void check() {
        if(this.pos == true)
        System.out.println(this.title + "책은 대여 가능합니다.");
        else
            System.out.println(this.title + "책은 이미 대여중입니다.");
    } //  메소드 3개
}