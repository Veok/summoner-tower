package summonerTower.web;

import org.junit.Ignore;
import summonerTower.model.Champion;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import summonerTower.service.ChampionService;
import summonerTower.web.controllers.ChampionController;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author Lelental on 16.02.2017.
 */
public class ChampionControllerTest {


    @Test
    public void shouldShowRecentChampions() throws Exception {

        List<Champion> expectedChampion = createChampionList();
        ChampionService mockRepository = mock(ChampionService.class);
        when(mockRepository.findAll())
                .thenReturn(expectedChampion);

        ChampionController championController = new ChampionController(mockRepository);
        MockMvc mockMvc = standaloneSetup(championController)
                .setSingleView(new InternalResourceView("WEB-INF/views/champions.jsp"))
                .build();

        mockMvc.perform(get("/champions"))
                .andExpect(view().name("champions"));
    }

    private List<Champion> createChampionList() {
        List<Champion> champion = new ArrayList<Champion>();
        for (int i = 0; i < 20; i++) {
            champion.add(new Champion());

        }
        return champion;
    }
}