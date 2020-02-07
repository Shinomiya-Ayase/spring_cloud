import org.java.ProviderApplication;
import org.java.dao.DeptDao;
import org.java.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ProviderApplication.class)
@RunWith(SpringRunner.class)
@SuppressWarnings("all")
public class DeptTest {
    @Autowired
    DeptDao deptDao;
    @Test
    public void test(){
        for (Dept dept : deptDao.findAll()) {
            System.out.println(dept);
        }
    }
}
