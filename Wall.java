package com.company;

import java.util.*;

public class Wall implements Main.Structure {

    private List blocks;
    private List<String> colors = new ArrayList<String>();
    private Set<String> materials = new HashSet<>();

    public void findBlockByColors(String color)
    {
        if (colors.equals(color)){
            System.out.println(color);
        }
    }
    public void findBlocksByMaterials()
    {
        for (String material : materials) {
            System.out.println(material);
        }

    }
    public void displayElements () {
        for (String color: colors) {
            System.out.println(color);
        }
        for (String material : materials){            {
            System.out.println(material);
        }

        }
    }
    @Override
    public Optional findBlockByColor(String color) {
        return Optional.empty();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}

