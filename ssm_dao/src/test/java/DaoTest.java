

import com.zw.dao.ItemsDao;
import com.zw.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author: zw
 * @Data: Created in 18:31 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
public class DaoTest {
    @Test
    public void itemDaoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
        System.out.println("商品列表：：："+itemsDao.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
