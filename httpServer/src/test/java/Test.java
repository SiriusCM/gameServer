public class Test {

    @org.junit.Test
    public void program() {
        HttpServerFactory.getInstance().createServer(new HttpProgramHandler(), 8080);
    }

    @org.junit.Test
    public void client() {
        HttpClientFactory.getInstance().createConnect(new HttpClientHandler(), "127.0.0.1", 8080);
    }

    @org.junit.Test
    public void explorer() {
        HttpServerFactory.getInstance().createServer(new HttpExplorerHandler(), 8080);
    }
}
