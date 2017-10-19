package com.example.chinegua.sqlite.models;

import android.provider.BaseColumns;

/**
 * Created by chinegua on 19/10/17.
 */

final public class ClientContract {

    private ClientContract() {}

    public static abstract class tablaClient implements BaseColumns{
        static final String TABLE_NAME = "clientes";
        static final String COL_ID = _ID;
        static final String COL_NAME = "name";
        static final String COL_DNI = "dni";
        static final String COL_TELEFONO = "telefono";
        static final String COL_EMAIL = "email";
        static final String COL_VERIFICADO = "verificado";

    }

}
