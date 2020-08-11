package com.tk.service.impl;

import com.tk.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Menu 1");
        menus.add("Menu 2");
        menus.add("Menu 3");
        menus.add("Menu Bốn");
        return menus;
    }
}
