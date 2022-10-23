import java.util.Arrays;
import java.util.List;

public class Main {
    public static String[] findAuthorizedusers(String[] userList, String[] permissions, String[] resources) {
        List<String> res = Arrays.asList(resources);
        String[] result = new String[1];

        for(int i=0; i<userList.length; i++) {
            String[] permission = permissions[i].split(" ");
            if(res.contains(permission[0]) && res.contains(permission[1])) {
                result[0] = userList[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] users = {"john", "mike", "carson"};
        String[] permissions = {"dev train", "dev qa", "qa prod"}; //(note that they are space delimited)
        String[] resources = {"qa", "prod"};

        String[] result = findAuthorizedusers(users, permissions, resources);
        System.out.println(result[0]);
    }
}