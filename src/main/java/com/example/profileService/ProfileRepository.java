package com.example.profileService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
