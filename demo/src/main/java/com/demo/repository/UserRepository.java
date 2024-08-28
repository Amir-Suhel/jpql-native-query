package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.User;
import com.demo.entity.UserCityResponse;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u  WHERE u.name = :name")
	List<User> findAllByName(@Param("name") String name);

//	@Query(value = "SELECT * FROM users WHERE city = :city", nativeQuery = true)
//	List<User> findAllByCity(@Param("city") String city);
	@Query(value = "SELECT * FROM users WHERE city = ?1", nativeQuery = true)
	List<User> findAllByCity(String city);

	@Query(value = "SELECT * FROM users WHERE dept = :department", nativeQuery = true)
	List<User> findAllByDepartment(@Param("department") String department);

	// @Query(value = "SELECT dept, COUNT(*) AS dept_count FROM users GROUP BY dept
	// ORDER BY dept", nativeQuery = true)
//	@Query("SELECT NEW com.demo.entity.UserResponse(u.department, COUNT(u)) FROM User u GROUP BY u.department")
//	List<UserResponse> findTotalUserByDepartment();
//
//	@Query(value="SELECT dept, COUNT(*) AS dept_count FROM users GROUP BY dept", nativeQuery = true)
//	List<UserResponseProjection> findTotalUserByDeparmentByProjection();

	@Query("SELECT NEW com.demo.entity.UserCityResponse(u.city, COUNT(u)) FROM User u GROUP BY u.city")
	List<UserCityResponse> findTotalUserByCity();
}
