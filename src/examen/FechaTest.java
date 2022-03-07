package examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FechaTest {

    @Test
    public void CP1(){
        assertFalse(Fecha.validarFecha(100, 100, -2));
    }

    @Test
    public void CP2(){
        assertFalse(Fecha.validarFecha(100, -1, 10));
    }
    @Test
    public void CP3(){
        assertFalse(Fecha.validarFecha(-1, 10, 10));
    }
    @Test
    public void CP4(){
        assertFalse(Fecha.validarFecha(10, 13, 10));
    }
    @Test
    public void CP5(){
        assertFalse(Fecha.validarFecha(10, 10, 50));
    }

}