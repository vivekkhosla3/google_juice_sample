package com.drawingapp.main;

import com.drawingapp.requests.SquareRequest;
import com.drawingapp.requests.SquareRequestSubClass;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    protected void configure() {
    bind(DrawShape.class).to(DrawSquare.class);
    bind(SquareRequest.class).to(SquareRequestSubClass.class);
    }
}
