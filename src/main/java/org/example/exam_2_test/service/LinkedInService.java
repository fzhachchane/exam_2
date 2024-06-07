package org.example.exam_2_test.service;

import org.springframework.stereotype.Service;

@Service
public class LinkedInService {
    private final LinkedIn linkedIn;

    public LinkedInService(LinkedIn linkedIn) {
        this.linkedIn = linkedIn;
    }

    public LinkedInProfile getProfile() {
        return linkedIn.profileOperations().getUserProfile();
    }
}
