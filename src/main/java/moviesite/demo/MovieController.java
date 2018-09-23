package moviesite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class MovieController {
    Logger log = Logger.getLogger(MovieController.class.getName());

    private String HOME = "home";
    private String MOVIE = "movie";
    private String NO = "no";
    private String ABOUT_US = "About_us";

    @GetMapping("")
    public String home(){

        log.info("index called");

        return HOME;
    }

    @GetMapping("/no")
    public String no(){

        log.info("no called");

        return NO;
    }

    @GetMapping("/Movie")
    public String Movie(){

        log.info("Movie called");

        return MOVIE;
    }

    @GetMapping("/About_us")
    public String About_us(){

        log.info("About_us called");

        return ABOUT_US;
    }


}