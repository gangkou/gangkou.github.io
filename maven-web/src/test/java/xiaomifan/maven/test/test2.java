package xiaomifan.maven.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xiaomifan.maven.mapper.BookMapper;
import xiaomifan.maven.mapper.UserMapper;
import xiaomifan.maven.pojo.Book;
import xiaomifan.maven.pojo.User;

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
       //关联分布测试
//        System.out.println(this.bookMapper.selectassociationfenbu(1));

//        System.out.println(this.bookMapper.selectcollection(1));
        System.out.println(this.bookMapper.selectcollectionfenbu(1));
    }
}
