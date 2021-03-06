package info.jab.microservices;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostalCodeServiceImpl implements PostalCodeService{

    //https://en.wikipedia.org/wiki/List_of_postal_codes_in_Spain#28000%E2%80%9328999:_Madrid
    @Override
    public List<String> getCodes() {
        return List.of(
                "28000 through 28052 – Madrid",
                "28100, 28109 – Alcobendas",
                "28120, 28700, 28701, 28707 through 28709 – San Sebastián de los Reyes",
                "28120, 28707, 28770, 28780 – Colmenar Viejo",
                "28220 – Majadahonda",
                "28223, 28224 – Pozuelo de Alarcón",
                "28230, 28232, 28290 – Las Rozas de Madrid",
                "28300 – Aranjuez",
                "28320 – Pinto",
                "28340 – Valdemoro",
                "28400, 28409 – Collado Villalba",
                "28410 – Manzanares el Real",
                "28500, 28529 – Arganda del Rey",
                "28520 through 28523, 28529 – Rivas-Vaciamadrid",
                "28600, 28608 – Navalcarnero",
                "28660, 28668, 28669 – Boadilla del Monte",
                "28670, 28679 – Villaviciosa de Odón",
                "28690 through 28692 – Villanueva de la Cañada",
                "28760, 28761, 28790 – Tres Cantos",
                "28800 through 28809 – Alcalá de Henares",
                "28820 – Coslada",
                "28830, 28831, 28850 – San Fernando de Henares",
                "28850 – Torrejón de Ardoz",
                "28860 – Paracuellos de Jarama",
                "28900 through 28909 – Getafe",
                "28910 through 28919 – Leganés",
                "28920 through 28929 – Alcorcón",
                "28930 through 28939 – Móstoles",
                "28940 through 28949 – Fuenlabrada",
                "28940, 28970 – Humanes de Madrid",
                "28980, 28981 – Parla");
    }

}
