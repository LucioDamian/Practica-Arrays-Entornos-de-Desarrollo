package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class Prueba {

	static ArrayList<Integer> notasValidas;
    static ArrayList<Integer> notasInvalidas;

    @BeforeAll
    static void setUpBeforeClass() {
        notasValidas = new ArrayList<>(Arrays.asList(5, 6, 8));
        notasInvalidas = new ArrayList<>(Arrays.asList(5, 11, -1));
    }

    @Test
    void testMediaNotasValidas() {
        assertEquals(6.33, MisArrays.mediaNotas(notasValidas), 0.01);
    }

    @Test
    void testMediaNotasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.mediaNotas(notasInvalidas);
        });
    }}


