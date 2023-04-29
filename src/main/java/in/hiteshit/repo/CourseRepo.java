package in.hiteshit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hiteshit.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
