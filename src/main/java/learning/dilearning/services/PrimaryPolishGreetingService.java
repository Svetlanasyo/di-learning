package learning.dilearning.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pl")
@Primary
public class PrimaryPolishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Dzien Dobry - Pierwszy serwis zycieniowy";
    }
}
