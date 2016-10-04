package com.example.teacher.pizza;

/**
 * Created by teacher on 9/30/2016.
 */
import android.provider.BaseColumns;

public interface Constants extends BaseColumns {
    String TABLE_NAME = "pizza";

    // Columns in the Events database
    String SIZE = "size";
    String CRUST = "crust";
    String TOPPINGS_WHOLE = "toppingsWhole";
    String TOPPINGS_LEFT = "toppingsLeft";
    String TOPPINGS_RIGHT = "toppingsRight";
}
