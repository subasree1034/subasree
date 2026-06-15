/*public class Day8{
    record CourseRecord(String name, String dept) {

    }

    void main() {
        CourseRecord courserecord = new CourseRecord("java programming", "artificial intelligence");
        System.out.println(courserecord.name());
        System.out.println(courserecord.dept());

    }
}
*/
/*
public class Day8 {
    enum LANGUAGE {
        EN("English"),
        GN("German"),
        JP("Japanese"),
        TN("Tamil");


        String description;

        LANGUAGE(String description) {
            this.description = description;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.EN.description);
        System.out.println(LANGUAGE.GN.description);
        System.out.println(LANGUAGE.JP.description);
        System.out.println(LANGUAGE.TN.description);
    }
}
*/
public class Day8_P2 {


    sealed interface LoginResult
            permits LoginSuccess, LoginFailure, LoginLoading {
    }

    record LoginSuccess(String username) implements LoginResult {
    }

    record LoginFailure(String reason) implements LoginResult {
    }

    record LoginLoading(String message) implements LoginResult {
    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success ->
                    System.out.println("Login Successful : " + success.username());

            case LoginFailure failure ->
                    System.out.println("Login Failed because of " + failure.reason());

            case LoginLoading loading ->
                    System.out.println("Login Loading... " + loading.message());
        }
    }

    public static void main(String[] args) {

        LoginResult loginSuccess =
                new LoginSuccess("Joseph");

        LoginResult loginFailure =
                new LoginFailure("Invalid Password");

        LoginResult loginLoading =
                new LoginLoading("Please wait...");

        handleLogin(loginSuccess);
        handleLogin(loginFailure);
        handleLogin(loginLoading);
    }
}



