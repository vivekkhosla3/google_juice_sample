package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequestSubClass extends SquareRequest {

    @Inject
    public SquareRequestSubClass(DrawShape d) {
        super(d);
    }

    System.out.println("myvar   ddd");

    public void makeRequest() {
        System.out.println("this is draw from subclass");
        d.draw();
    }
}
