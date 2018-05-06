import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    @org.junit.Test
    public void server() {
        UDPServerFactory.getInstance().createServer(new UDPServerHandler(), 8080);
    }

    @org.junit.Test
    public void client() {
        UDPClientFactory.getInstance().createConnect(new UDPClientHandler(), "255.255.255.255", 8080);
    }
}
