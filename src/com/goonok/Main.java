package com.goonok;

import com.goonok.SUV;

public class Main {
    public static void main(String[] args) {
        SUV fortunate = new SUV("Fortunate", false);

        fortunate.move(40, 5);
        fortunate.accelerator(20);
        fortunate.accelerator(-55);
        fortunate.accelerator(-5);
        ///https://www.youtube.com/watch?v=NmL3Gev4tSw
        
    }
}