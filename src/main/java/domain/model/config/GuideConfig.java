package domain.model.config;

import domain.model.Item;
import domain.model.Spell;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lelental on 11.02.2017
 */
@Configuration
@Import(ChampionConfig.class)
@ComponentScan(basePackages = "domain.model")
public class GuideConfig {

    @Bean
    public List<Item> itemList() {
        return new ArrayList<Item>();
    }

    @Bean
    public Spell spell(){
        return new Spell();
    }


}