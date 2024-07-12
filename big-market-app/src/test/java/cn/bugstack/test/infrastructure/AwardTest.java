package cn.bugstack.test.infrastructure;

import cn.bugstack.infrastructure.persistent.dao.IAWardDao;
import cn.bugstack.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardTest {

    @Autowired
    private IAWardDao aWardDao;

    @Test
    public void testQueryAwardList() {
        List<Award> list = aWardDao.queryAwardList();
        for (Award award : list) {
            System.out.println(award);
        }
    }

}