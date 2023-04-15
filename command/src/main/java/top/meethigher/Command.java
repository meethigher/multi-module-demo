package top.meethigher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class Command implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        while (true) {
            log.info("日志");
            TimeUnit.SECONDS.sleep(2L);
        }
    }
}
