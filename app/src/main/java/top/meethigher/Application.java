package top.meethigher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author chenchuancheng github.com/meethigher
 * @since 2023/4/15 12:11
 */
@SpringBootApplication(scanBasePackages = {"top.meethigher"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
