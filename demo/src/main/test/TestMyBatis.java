import com.alibaba.fastjson.JSON;
import com.wdq.model.User;
import com.wdq.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestMyBatis
 * Author:   kinbridge
 * Date:     2018/7/29 20:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = LoggerFactory.getLogger(TestMyBatis.class);
    //private ApplicationContext ac = null;
    @Resource
    private IUserService userService;

    @Test
    public void test1() {
        List<User> users = userService.findAll();
        logger.info(JSON.toJSONString(users));
    }
}