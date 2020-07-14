package com.tinnova.veiculos;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



@SpringBootTest
public class TinnovaApiApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private  MockMvc mockMvc;
	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void veiculos() throws Exception {
		mockMvc.perform(get("http://localhost:8080/veiculos")).andExpect(status().isOk());
	}
	@Test
	public void veiculosEmpty() throws Exception {
	    mockMvc.perform(get("http://localhost:8080/veiculos").contentType("application/json")
	            .content("[]"))
	            .andExpect(status().isOk());
	}
	

}
