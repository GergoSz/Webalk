package com.bead.demo;

import com.bead.demo.model.Vodka;
import com.bead.demo.persist.VodkaRepo;
import com.bead.demo.service.VodkaService;
import com.bead.demo.service.VodkaServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class VodkaServiceImplIntegrationTest {

    @TestConfiguration
    static class VodkaServiceImplTestContextConfiguration {

       /* @Bean
        public VodkaService vodkaService() {
            return new VodkaServiceImpl();
        }*/
    }

    @Autowired
    private VodkaService vodkaService;

    @MockBean
    private VodkaRepo vodkaRepository;

    @Before
    public void setUp() {
        Vodka v = new Vodka("Name", "Brand" , 40, 75);

        Mockito.when(vodkaRepository.findByName(v.getName()))
                .thenReturn(v);
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        String name = "Name";
        Vodka found = vodkaService.getVodkaByName(name);

        assertThat(found.getName())
                .isEqualTo(name);
    }

}
