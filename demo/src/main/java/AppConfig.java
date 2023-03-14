import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Scope
    @Bean(name="helloworld")

    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();

        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }


        @Scope("prototype")
        @Bean(name = "cat")
        public Cat getCate() {
        return    new Cat();
        }


}
