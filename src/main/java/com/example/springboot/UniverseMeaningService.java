package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class UniverseMeaningService {
    public String getUniverseMeaning(String meaning) {
        if (meaning == null){
            return "Unable to determine the meaning of the universe. The value provided was null";
        }

        return String.format("This AI is super green eco-powered and sustainable. The meaning of the universe is %s.", meaning);
    }
}
