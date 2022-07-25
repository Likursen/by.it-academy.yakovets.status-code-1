import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;

public abstract class AbstractTest {
    public static final String URL = "https://4pda.to/";
    protected CloseableHttpClient client;
    protected HttpGet httpGet;

    @Before
    public void openConnection() {
        client = HttpClients.createDefault();
        httpGet = new HttpGet(URL);
    }
}