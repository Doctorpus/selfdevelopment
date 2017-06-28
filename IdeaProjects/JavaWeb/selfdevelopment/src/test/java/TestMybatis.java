import com.alibaba.fastjson.JSON;
import com.leishaw.forjob.DO.FuckDO;
import com.leishaw.forjob.service.FuckService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by leishaw on 27/06/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {

        private static Logger logger = Logger.getLogger(TestMybatis.class);
        //  private ApplicationContext ac = null;
        @Resource
        private FuckService userService;

    //  @BeforeR
    //  public void before() {
    //      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    //      userService = (IUserService) ac.getBean("userService");
    //  }

        @Test
        public void test1() {
            System.out.println(userService);
            FuckDO fuck = userService.getFuckById(1);
            // System.out.println(user.getUserName());
            // logger.info("值："+user.getUserName());
            logger.info(JSON.toJSONString(fuck));
        }

}
