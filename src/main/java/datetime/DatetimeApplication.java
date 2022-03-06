package datetime;

import datetime.model.SchedulingSlot;
import datetime.repository.SchedulingSlotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.*;

@SpringBootApplication
public class DatetimeApplication {

    public static void main(String[] args) {
        new SpringApplication().run(DatetimeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(SchedulingSlotRepository repository) {
        return args -> {
            SchedulingSlot slot = new SchedulingSlot();
            slot.id(1L);
            slot.cityCode("BCN");
            slot.startTime(ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2022,3,22), LocalTime.of(10,00)), ZoneId.of("UTC")));
            slot.endTime(ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2022,3,22), LocalTime.of(10,30)), ZoneId.of("UTC")));
            repository.save(slot);
        };
    }
}
