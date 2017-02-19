package domain.model.config;

import domain.model.User;
import domain.model.guide.BuildOfChampion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Lelental on 13.02.2017.
 */
@Configuration
@Import(BuildOfChampionConfig.class)
@ComponentScan(basePackageClasses = User.class)
public class UserConfig {

}