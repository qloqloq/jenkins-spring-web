package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsSpringWebApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Should return \"Hello world\" when GET request on \"/\"")
	void shouldReturnHelloWorldWhenGetRequest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Hello world"));
	}

	@Test
	@DisplayName("Should return \"Hello Michael\" when GET request on \"/\"")
	void shouldReturnHelloMichaelWhenGetRequest() throws Exception {
		String name = "Michael";
		mockMvc.perform(MockMvcRequestBuilders.get("/" + name))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Michael"));
	}

}
