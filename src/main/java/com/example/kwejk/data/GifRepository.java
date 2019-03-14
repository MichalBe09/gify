package com.example.kwejk.data;

import model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class GifRepository {

    public static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(1,"android-explosion","molw",true),
            new Gif(1,"infinite-andrew","anrew",true),
            new Gif(1,"cowboy-coder","coder",true),
            new Gif(1,"compiler-bot","bot",true),
            new Gif(1,"book-dominos","mem",true),
            new Gif(1,"ben-and-mike","mika",true)
    );


    public static List<Gif> getAllGifs(){
        return ALL_GIFS;
    }
}
