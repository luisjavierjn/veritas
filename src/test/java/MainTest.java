import org.junit.Test;

public class MainTest {
    String[] users = {"john", "mike", "carson"};
    String[] permissions = {"dev train", "dev qa", "qa prod"}; //(note that they are space delimited)
    String[] resources = {"qa", "prod"};
    String[] resourcesNotCompliance = {"dev", "prod"};

    @Test
    public void findAuthorizedusersValid() {
        String[] result = Main.findAuthorizedusers(users,permissions,resources);
        assert(result[0].equals("carson"));
    }

    @Test
    public void findAuthorizedusersEmpty() {
        String[] result = Main.findAuthorizedusers(users,permissions,resourcesNotCompliance);
        assert(result[0] == null);
    }
}
