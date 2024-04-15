package com.example.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UniverseMeaningControllerTests {
    private MockMvc mockMvc;
    private UniverseMeaningService universeMeaningService;

    @BeforeEach
    public void setup() {
        universeMeaningService = mock(UniverseMeaningService.class);

        this.mockMvc = MockMvcBuilders.standaloneSetup(new UniverseMeaningController(universeMeaningService))
                .setControllerAdvice()
                .build();
    }

    @Test
    public void should_invoke_service_with_universe_meaning_parameter() throws Exception {

        this.mockMvc.perform(get("/universe-meaning/42"));

        verify(universeMeaningService).getUniverseMeaning("42");
    }

    @Test
    public void should_return_universe_meaning_from_service() throws Exception {
        when(universeMeaningService.getUniverseMeaning(any())).thenReturn("Meaning of the universe is 42!");

        this.mockMvc
                .perform(get("/universe-meaning/42"))
                .andExpect(status().isOk())
                .andExpect(content().string("Meaning of the universe is 42!"));
    }
}