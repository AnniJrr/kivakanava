package projekti;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DefaultController {

    @Autowired
    private KayttajaRepository kayttajaRepository;

    private Map<String, Kayttaja> kayttajat;   //lista rekisteröityneistä käyttäjistä (profiilinnimi, käyttaja)

    //näyttää index-sivun (etusivun)
    @GetMapping("/index")
    public String home(Model model) {
        return "index";
    }

    //näyttää käyttäjän profiilisivun
    //toistaiseksi ei rajausta käyttäjätunnuksille
    @GetMapping("/etusivu")
    public String etusivu(Model model) {
        return "etusivu";
    }

    //luo uuden käyttäjän
    @PostMapping("/etusivu")
    public String create(@ModelAttribute Kayttaja kayttaja) {
        kayttajaRepository.save(kayttaja);                      //tallentaa käyttäjän tietokantaan
        this.kayttajat.put(kayttaja.getProfiili(), kayttaja);   //lisää uuden käyttäjän käyttäjien listaan   
        return "/";
    }

    //käyttäjä kirjautuu profiilisivulle käyttäjätunnuksella ja salasanalla
    @GetMapping("/etusivu/{id}")
    public String haeKayttaja(Model model, @PathVariable Long id) {
        Kayttaja k = kayttajaRepository.getOne(id);    //etsitään käyttäjä 
        String p = k.getProfiili();   //etsii käyttäjän profiilinnimen
        if (!this.kayttajat.containsKey(p)) {  //vertailee profiilia listaan
            return "index";

        } else {
            return "redirect:/etusivu";
        }
    }

}
