package guru.springframework.sfgdi.repositories;


public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String addGreeting() {
        return "Hello World - EN";
    }
}
