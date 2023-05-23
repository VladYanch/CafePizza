package com.example.cafepizza.dao;

import com.example.cafepizza.model.Cafe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CafeDAO {
    private static int CAFE_COUNT;
    private List<Cafe> cafeList;

    {
        cafeList = new ArrayList<>();
        cafeList.add(new Cafe(++CAFE_COUNT,"Pomodoro"));
        cafeList.add(new Cafe(++CAFE_COUNT,"Limonchelo"));
        cafeList.add(new Cafe(++CAFE_COUNT,"Olio"));
    }

    public List<Cafe> index() {
        return cafeList;
    }

    public Cafe cafeId(int id) {
        return cafeList.stream().filter(cafe -> cafe.getId()==id).findAny().orElse(null);
    }

}
