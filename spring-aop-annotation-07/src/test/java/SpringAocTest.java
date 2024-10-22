import com.wang.config.JavaConfig;
import com.wang.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * projectName: PACKAGE_NAME
 *
 * @Author: 王玉豪
 * @Date: 2024/10/18 12:33
 * descriptions:
 */

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAocTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void test_01() {

        int result = calculator.add(1, 2);

    }
}
