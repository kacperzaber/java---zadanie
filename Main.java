package com.company;;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Main {

    interface Structure {
        // zwraca dowolny element o podanym kolorze
        Optional findBlockByColor(String color);

        // zwraca wszystkie elementy z danego materiału
        List findBlocksByMaterial(String material);

        //zwraca liczbę wszystkich elementów tworzących strukturę
        int count();
    }

    interface Block {
        String getColor();
        String getMaterial();
    }

    interface CompositeBlock extends Block {
        List getBlocks();
    }

}

