package guru.springframework.sfgdi.repositories;

public class SpanishGreetingRepositoryImpl implements SpanishGreetingRepository {

    @Override
    public String addGreeting() {
        return "Hola Mundo - ES";
    }

}
