package datetime.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
public class SchedulingSlot {

    @Id
    private Long id;
    @Column(name = "start_time_utc", nullable = false)
    private Instant startTime;
    @Column(name = "end_time_utc", nullable = false)
    private Instant endTime;
    @Embedded
    private CityCode cityCode;

    public CityCode cityCode() {
        return cityCode;
    }

    public SchedulingSlot(){
    }

    public void startTime(final Instant startTime) {
        this.startTime = startTime;
    }

    public void endTime(final Instant endTime){
        this.endTime = endTime;
    }

    public void cityCode(final String code) {
        this.cityCode = CityCode.of(code);
    }

    public void id(final Long id) {
        this.id = id;
    }
}
