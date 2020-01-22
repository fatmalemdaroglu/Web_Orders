package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import io.cucumber.java.After;

public class Hook {



    @After
    public void teardown(){
        Driver.close();
    }
}
