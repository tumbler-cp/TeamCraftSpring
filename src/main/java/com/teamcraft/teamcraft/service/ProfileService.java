package com.teamcraft.teamcraft.service;

import com.teamcraft.teamcraft.dto.ProfileDTO;
import com.teamcraft.teamcraft.entity.Profile;
import com.teamcraft.teamcraft.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public Profile create(ProfileDTO profile) {
        Profile profileEntity = Profile
                .builder()
                .nickname(profile.getNickname())
                .build();
        return profileRepository.save(profileEntity);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public Profile update(Profile profile) {
        return profileRepository.save(profile);
    }

    public void delete(Long id) {
        profileRepository.deleteById(id);
    }
}
