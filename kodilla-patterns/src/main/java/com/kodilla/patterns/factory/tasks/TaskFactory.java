package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final static String DRIVINGTASK = "DRIVING";
    public final static String PAINTINGTASK = "PAINTING";
    public final static String SHOPPINGTASK = "SHOPPING";

    public final Task doTask (final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "Kielce", "Seat");
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "Black", "Boy");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task", "Food", 15.0);
            default:
                return null;
        }
    }
}