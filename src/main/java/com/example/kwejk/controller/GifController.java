package com.example.kwejk.controller;

import com.example.kwejk.data.GifRepository;
import model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {


    @Autowired
    GifRepository gifRepository;


    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        //1 wyciąganie gifów
        List<Gif> gifs = gifRepository.getAllGifs();
        //2 przekazanie gifa do view
        modelMap.put("gifs",gifs);
        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavorites (ModelMap modelMap){
        List<Gif> gifs = new ArrayList<>();
        gifs = gifRepository.getFavs();
        modelMap.put("gifs", gifs);
        return "favorites";
    }


}
