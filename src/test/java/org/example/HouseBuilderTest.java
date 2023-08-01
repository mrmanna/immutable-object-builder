package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class HouseBuilderTest {

    @Test
    public void testImmutableMainDoor() throws Exception {
        MainDoor mainDoor = new MainDoor.Builder().doorType("Wooden Door").doorMaterial("Wood").doorColor("Metal").build();

        // Direct modification - should fail as there is no setter
        assertThrows(NoSuchMethodException.class, () -> {
            mainDoor.getClass().getMethod("setDoorType", String.class);
        });
    }

}
