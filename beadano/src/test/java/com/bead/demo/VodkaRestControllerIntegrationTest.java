package com.bead.demo;


import com.bead.demo.controller.VodkaController;
import com.bead.demo.model.Vodka;
import com.bead.demo.service.VodkaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VodkaController.class)
public class VodkaRestControllerIntegrationTest {



        @Autowired
        private MockMvc mvc;

        @MockBean
        private VodkaService service;

    /*@Test
    public void givenEmployees_whenGetEmployees_thenReturnJsonArray()throws Exception {

        Vodka v = new Vodka("Absolut", "Vodka",40, 70);

        List<Vodka> allEmployees = Arrays.asList(v);

        given(service.getAllVodka()).willReturn(allEmployees);

        mvc.perform( MockMvcRequestBuilders.get("/vodka")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.vodkalist").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.vodkalist[*].id").isNotEmpty());
                //.andExpect((ResultMatcher) jsonPath("$", hasSize(1)))
                //.andExpect((ResultMatcher) jsonPath("$[0].name", is(v.getName())));
    }*/

    @Test
    public void getVodkaByIdAPI() throws Exception{
        service.createVodka(new Vodka( "Vodka", "Absolute",40, 70));

        mvc.perform( MockMvcRequestBuilders
                .get("/vodka", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1));
    }

}
