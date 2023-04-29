package in.hiteshit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hiteshit.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
