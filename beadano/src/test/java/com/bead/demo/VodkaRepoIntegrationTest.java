package com.bead.demo;

import com.bead.demo.model.Vodka;
import com.bead.demo.persist.VodkaRepo;
import com.bead.demo.service.VodkaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class VodkaRepoIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private VodkaRepo vodkaRepo;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Vodka v = new Vodka("Name", "Brand" , 40, 75);
        entityManager.persist(v);
        entityManager.flush();

        // when
        Vodka found = vodkaRepo.findByName(v.getName());

        // then
        assertThat(found.getName()).isEqualTo(v.getName());
    }



}
