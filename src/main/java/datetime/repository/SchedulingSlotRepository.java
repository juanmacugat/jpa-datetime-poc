package datetime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import datetime.model.SchedulingSlot;

@Repository
public interface SchedulingSlotRepository extends JpaRepository<SchedulingSlot, String> {
}
