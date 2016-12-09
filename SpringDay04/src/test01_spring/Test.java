package test01_spring;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import test01_spring.vo.BookVO;
 
public class Test {
    public static void main(String[] args) {
//      BookDAO DAO = new BookDAO();
        ApplicationContext context = new
            ClassPathXmlApplicationContext
            ("test01_spring/applicationContext.xml");
         
        BookDAO DAO = 
                context.getBean("DAO", BookDAO.class);
         
        // insert
        BookVO book =
                new BookVO("Spring","yangyu",35000,"sds");
        System.out.println("insert 결과:"+DAO.insert(book));
         
        // selectAll
        System.out.println("--모든 책 목록--");
        for(BookVO b: DAO.selectAll()){
            System.out.println(b);
        }
         
        // selectOne
        System.out.println("--4번 책 정보--");
        System.out.println(DAO.select(4));
    }
}