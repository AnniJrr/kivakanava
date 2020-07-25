# kivakanava
Kivakanava – keskustelufoorumi mukaville tyypeille. Sovellus on tehty syksyllä 2019 Helsingin yliopiston kurssilla "Web-palvelinohjelmointi Java”. Kivakanava on Twitterin kaltainen sosiaalinen media, jossa palveluun kirjautunut käyttäjä voi lukea saamiaan viestejä sekä lähettää itse viestejä muille käyttäjille.

**Tekniikat:** Java, Spring Framework, Thymeleaf, HTML

**In English:** A project for a course in Helsingin yliopisto (University of Helsinki). The course was about web development in Java. Kivakanava is a full-stack web application, in which users interact with each other - similar to Twitter. The project is under construction.

# Käyttöohje
- Rekisteröidy käyttäjäksi luomalla itsellesi käyttäjätunnukset: lomakkeella vaaditaan käyttäjätunnus, salasana, oma nimi ja profiilissa näkyvä käyttäjänimi.  Voit myös ohittaa tämän käyttämällä valmiita tunnuksia (”user”, ”password”). 
- Kirjaudu sovellukseen käyttäjätunnuksella ja salasanalla (joko omilla tai valmiilla tunnuksilla). Kirjaudu-painike vie käyttäjän oman tilinsä sivulle. 
- Palveluun kirjautuneena käyttäjä näkee omalla profiilisivullaan itselleen lähetetyt viestit tai voi lähettää viestejä muille käyttäjille. Lisäksi voi etsiä muita käyttäjiä nimihaulla.

# Lisätietoja sovelluksesta
Sovellus rakentuu tietokannan ja tietoja lähettävien lomakkeiden varaan. Sovelluksen lähdekoodissa on käytetty Spring Boot -projektia (versio 2.1.3), joka sisältää oletuksena myös web-palvelimen. Sovelluksen kääntämiseen käytetään Mavenia, ja ohjelmointikielenä on Java. Selaimen näkymät muodostuvat HTML-muotoisista templateista, ja niiden luomisessa on hyödynnetty Thymeleaf-kirjastoa.

Tietokantatoiminnallisuus syntyy H2-tietokannanhallintajärjestelmällä ja Spring Bootilla (Javan rajapinnat). Oliot (palvelun käyttäjät) tallennetaan relaatiotietokantoihin JPA (Java Persistence API) -standardilla. Tietokannan käsittelyssä Spring-sovelluskehys ja JPA-rajapinta tuovat ohjelman käyttöön CRUD-toiminnallisuuden eli metodeja, joilla tietokantaa voi hallinnoida. Tietoja lähetetään tietokantaan lomakkeilla. 

Sovelluksen etusivulla (index) on kaksi lomaketta. Kirjautumislomakkeella palveluun kirjaudutaan käyttäjätunnuksella ja salasanalla. Rekisteröitymislomakkeella pääsee palvelun käyttäjäksi luomalla itselleen tunnukset. Tällä hetkellä tunnistautumis- ja kirjautumistoiminnallisuus puuttuu sovelluksesta, eli kaikilla käyttäjillä on pääsy etusivulle riippumatta tunnuksista.

Kivakanava on keskeneräinen projekti. Sovellukseen on tarkoitus tehdä vielä seuraavia toimintoja:
- uloskirjautuminen
- haku: mahdollisuus toisten käyttäjien löytämiseen
- seinä: omat ja toisten käyttäjien viestit aikajärjestyksessä
- kommentointi: toisten käyttäjien kommentit viesteihin näkyvät käyttäjän seinällä
- profiilikuva: käyttäjä voi ladata sovellukseen kuvansa, joka näkyy etusivulla ja kommenttien yhteydessä
- autentikaatio ja autorisaatio: käyttäjän tunnistaminen ennen etusivulle pääsyä kirjautumisen yhteydessä sekä käyttäjän oikeuksien määrittely
-validointi: lomakkeen syötteiden oikeellisuuden tarkistaminen
-yksikkötestit (luokille ja metodeille) ja poikkeusten käsittely mahdollisia virhetilanteita varten.

Lisäksi sovellukseen voisi tehdä kuva-albumin, jonka kuvia muut käyttäjät voivat kommentoida, sekä tykkäämistoiminnallisuuden kuvia ja viestejä varten. 


