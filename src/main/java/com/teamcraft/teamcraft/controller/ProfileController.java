package com.teamcraft.teamcraft.controller;

import com.teamcraft.teamcraft.dto.ProfileDTO;
import com.teamcraft.teamcraft.entity.Profile;
import com.teamcraft.teamcraft.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody ProfileDTO profileDTO) {
        return new ResponseEntity<>(profileService.create(profileDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Profile>> findAll() {
        return new ResponseEntity<>(profileService.findAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Profile> update(@RequestBody Profile profile) {
        return new ResponseEntity<>(profileService.update(profile), HttpStatus.OK);
    }

    @DeleteMapping
    public HttpStatus delete(@PathVariable Long id) {
        profileService.delete(id);
        return HttpStatus.OK;
    }
}
