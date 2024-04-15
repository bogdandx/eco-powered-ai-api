package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniverseMeaningController {
    private final UniverseMeaningService universeMeaningService;

    public UniverseMeaningController(UniverseMeaningService universeMeaningService) {

        this.universeMeaningService = universeMeaningService;
    }

    @GetMapping("/universe-meaning/{meaning}")
    public String getUniverseMeaning(@PathVariable String meaning){
        return universeMeaningService.getUniverseMeaning(meaning);
    }
}
