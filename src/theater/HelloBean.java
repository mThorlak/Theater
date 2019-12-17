package theater;

public class HelloBean implements HelloRemote {
    public HelloBean(){}
    @Override
    public String sayHello() {
        return "Hello world";
    }
}
