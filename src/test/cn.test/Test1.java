import com.learnbyheart.rocketmqtest1.producer.Producer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class Test1 {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    @Test
    public void testSend() throws MQBrokerException, RemotingException, InterruptedException, MQClientException {
        rocketMQTemplate.convertAndSend("springboot-rocketmq","hello mq");

    }
}
