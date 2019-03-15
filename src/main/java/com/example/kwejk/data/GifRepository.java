package com.example.kwejk.data;

import com.example.kwejk.controller.GifController;
import model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component // adnotacja Component pozwala nam na wykorzystanie adnotacji Autowired, czyli wstrzykniecie zaleznosci do controllera
public class GifRepository {



    public static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(1, "android-explosion", "molw", true),
            new Gif(1, "infinite-andrew", "anrew", true),
            new Gif(2, "cowboy-coder", "coder", false),
            new Gif(2, "compiler-bot", "bot", true),
            new Gif(3, "book-dominos", "mem", false),
            new Gif(3, "ben-and-mike", "mika", true)
    );


    public static List<Gif> getFavs() {
        List<Gif> favs = new ArrayList<>();
        for (int i = 0; i < ALL_GIFS.size(); i++) {
            if (ALL_GIFS.get(i).getFavorite() == true) {
                favs.add(ALL_GIFS.get(i));
            }

        }
        return favs;
    }


    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


    public static List<Gif> getGifsByCategoryId(int id) {
        List<Gif> categoryGifs = new ArrayList<>();
        for (Gif value : ALL_GIFS) {
            if (value.getId() == id){
                categoryGifs.add(value);
            }
        }return categoryGifs;
    }
}
