package com.example.profileService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/profiles")
@CrossOrigin(origins = "http://localhost:8080", methods = {RequestMethod.GET})
@AllArgsConstructor
public class ProfileController {

        private final ProfileService profileService;

        @GetMapping("")
        public String testEndpoint(){
            return "Hey, you're hitting me!";
        }

        @GetMapping("/{id}")
        public Object getProfileById(@PathVariable Long id) {
            return this.profileService.getProfileById(id);
        }

}
