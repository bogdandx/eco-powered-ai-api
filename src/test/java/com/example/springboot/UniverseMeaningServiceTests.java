package com.example.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniverseMeaningServiceTests {

    private UniverseMeaningService service;

    @BeforeEach
    public void setup(){
        service = new UniverseMeaningService();
    }

    @Test
    public void should_format_the_meaning_of_the_universe_correctly(){
        String meaning = service.getUniverseMeaning("42");

        assertEquals("This AI is super green eco-powered and sustainable. The meaning of the universe is 42.", meaning);
    }

    @Test
    public void should_return_error_message_for_null_parameter(){
        String meaning = service.getUniverseMeaning(null);

        assertEquals("Unable to determine the meaning of the universe. The value provided was null", meaning);
    }
}
