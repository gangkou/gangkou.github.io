package xiaomifan.maven.mapper;


import org.apache.ibatis.annotations.MapKey;
import xiaomifan.maven.pojo.Book;
import xiaomifan.maven.pojo.Books;

import java.util.List;
import java.util.Map;

/**
 * @author 小米饭
 * @date 2020/6/5
 * @descrition：xiaomifan.maven.mapper
 **/
public interface BookMapper {
    void insert(Book book);
    void delete(int bookId);
    void update(Book book);
    Book selectbyid(int bookId);
    List<Book> selectAll();
    Map<String,Object> selectbymap(int bookId);
    @MapKey("bookId")
    Map<Integer,Book> selectbymapall();
    Book selectResultmap(int bookId);
    Book selectResultmapjilian(int bookId);

    //    关联自定义映射测试
    Books selectassociation(int bookId);
    Books selectassociationfenbu(int bookId);
    Books selectcollection(int bookId);
    Books selectcollectionfenbu(int bookId);
}
