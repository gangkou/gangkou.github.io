package xiaomifan.maven.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xiaomifan.maven.mapper.BookMapper;
import xiaomifan.maven.pojo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小米饭
 * @date 2020/6/4
 * @descrition：xiaomifan.maven.test.maven
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class test2 {

    @Autowired
    SqlSessionFactoryBean SqlSessionFactoryBean;

    @Autowired
    BookMapper bookMapper;
    @Test
    public void resultmapTest() throws Exception {

        SqlSessionFactory sqlSessionFactory=SqlSessionFactoryBean.getObject();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Book book=sqlSession.getMapper(BookMapper.class).selectResultmap(1);
        System.out.println("sqlSession的方式调用resultmaptest:");
        System.out.println(book);
        System.out.println("---------------------------------");
        System.out.println("实例化映射接口的方式调用resultmaptest:");
        System.out.println(this.bookMapper.selectResultmap(1));
    }

    @Test
    public void resultmapjiliantest(){
//        System.out.println(this.bookMapper.selectResultmapjilian(2));

       //关联测试
//        System.out.println(this.bookMapper.selectassociation(1));
       //关联分步测试
//        System.out.println(this.bookMapper.selectassociationfenbu(1));

//        System.out.println(this.bookMapper.selectcollection(1));
        System.out.println(this.bookMapper.selectcollectionfenbu(1));
    }

    @Test
    public void selectDynamicsql(){
        Book book=new Book();
        book.setBookId(4);
        book.setName("沉默的大多数");
        book.setPublisher("西北重工业出版社");
        book.setAuthor("王小波");
        book.setPrice(33.4);
//        System.out.println(this.bookMapper.selectDynamicsql(book));
//        this.bookMapper.updateDynamicsql(book);
        System.out.println(this.bookMapper.selectDynamicsqlchoose(book));

    }
    @Test
    public void piliang(){
        // 批量查询
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        System.out.println(this.bookMapper.selectDynamicsqlforeach(list));
//        System.out.println(this.bookMapper.selectDynamicsqlforeachwhere(list));


        //批量插入
        List<Book> listbook=new ArrayList<Book>();
        Book book1=new Book("围城",36.8,"新华出版社","沈从文");
        Book book2=new Book("呐喊",45,"南京出版社","鲁迅");
        listbook.add(book1);
        listbook.add(book2);
        //方式一
//        this.bookMapper.insertmore(listbook);
        //方式二
        this.bookMapper.insertmoremore(listbook);
    }



    @Test
    public void testXmlConf() {
        DOMConfigurator.configure("src/main/resources/spring/log4j.xml");
        Logger log = Logger.getLogger("cd.itcast.log");
        log.debug("log debug..");
        log.info("log info..");
    }
    @Test
    public void testLoger(){

        final Logger logger = Logger.getLogger("TestErrOut");
        logger.debug(" This is debug!!!");
        logger.info(" This is info!!!");
        logger.warn(" This is warn!!!");
        logger.error(" This is error!!!");
        logger.fatal(" This is fatal!!!");
    }
}
