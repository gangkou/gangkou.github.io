package xiaomifan.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xiaomifan.maven.mapper.BookMapper;

/**
 * @author 小米饭
 * @date 2020/6/4
 * @descrition：xiaomifan.maven.test.maven
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class test1 {

    @Autowired
    public BookMapper bookMapper;


    @Test
    public void allTest(){
        //插入测试
//        Book book=new Book();
//        book.setName("爱你就像爱生命");
//        book.setPrice(34.8);
//        book.setPublisher("机械工业出版社");
//        book.setAuthor("王小波");
//        this.bookMapper.insert(book);
        //更新测试
//        Book book=bookMapper.selectbyid(2);
//        book.setPrice(46.6);
//        book.setPublisher("清华大学出版社");
//        this.bookMapper.update(book);
        //删除测试
//        this.bookMapper.delete(2);
        //查询测试
        //byid
//        System.out.println(this.bookMapper.selectbyid(1));
//        System.out.println(this.bookMapper.selectAll());
        //以map返回结果
//         System.out.println(this.bookMapper.selectbymap(1));
//         System.out.println(this.bookMapper.selectbymapall());

    }

}
