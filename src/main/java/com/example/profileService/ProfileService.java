package com.example.profileService;

import com.example.profileService.Profile;
import com.example.profileService.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ResponseEntity getProfileById(long id){
        try {
            Profile potentialProfile = this.profileRepository.findById(id).orElseThrow();
            return new ResponseEntity<>(potentialProfile, HttpStatus.FOUND);
        } catch (Exception e){
            return new ResponseEntity(String.format("Profile with ID: %d does not exist", id), HttpStatus.BAD_REQUEST);
        }
    }
}
