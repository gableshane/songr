package com.example.Songr;


import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word, Model m){
        String result = word.toUpperCase();
        m.addAttribute("word",result);
        System.out.println(result);
        return "hello";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/albums")
    public String albums(Model m){
        Album[] result = new Album[3];
        result[0] = new Album(
                "Look What the Cat Dragged In",
                "Poison",
                10,
                2004,
                "1.jpg");
        result[1] = new Album("Open Up and Say... Ahh!",
                "Poison",
                10,
                2171,
                "2.png");
        result[2] = new Album("Flesh and Blood",
                "Poison",
                14,
                3458,
                "3.jpg");
        m.addAttribute("albums",result);
        return "albums";
    }

}
