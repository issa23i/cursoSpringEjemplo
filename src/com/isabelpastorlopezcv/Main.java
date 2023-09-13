package com.isabelpastorlopezcv;

import com.isabelpastorlopezcv.entidades.Entidad;
import com.isabelpastorlopezcv.services.EntidadService;
import com.isabelpastorlopezcv.services.EntidadServiceImpl;

public class Main {

    public static void main(String[] args) {

        EntidadService service = new EntidadServiceImpl();
        service.altaEntidad(new Entidad());
    }
}
