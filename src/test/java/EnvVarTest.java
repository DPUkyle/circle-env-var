import org.junit.Test;

public class EnvVarTest {

    @Test
    public void printsEnvVar() {
        System.out.println("Your super-secret env var $FOO is: " + System.getenv("FOO"));
    }

}
