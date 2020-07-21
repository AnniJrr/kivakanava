/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

import javax.persistence.Entity;
import static javax.swing.text.StyleConstants.Size;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author Anni
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kayttaja extends AbstractPersistable<Long> {

    private String nimi;          //käyttäjän nimi
    private String tunnus;       //käyttäjätunnus
    private String salasana;     //salasana
    private String profiili;     //profiilin näyttämisessä käytettävä merkkijono
}
