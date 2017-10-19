package com.example.chinegua.sqlite.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chinegua on 19/10/17.
 */

public class ClientEntity implements Parcelable {

    private int id;
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String verificado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerificado() {
        return verificado;
    }

    public ClientEntity(int id, String nombre, String dni, String telefono, String email, String verificado) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.verificado = verificado;
    }

    public void setVerificado(String verificado) {
        this.verificado = verificado;
    }

    protected ClientEntity(Parcel in) {
        nombre = in.readString();
        dni = in.readString();
        telefono = in.readString();
        email = in.readString();
        verificado = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(dni);
        dest.writeString(telefono);
        dest.writeString(email);
        dest.writeString(verificado);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ClientEntity> CREATOR = new Parcelable.Creator<ClientEntity>() {
        @Override
        public ClientEntity createFromParcel(Parcel in) {
            return new ClientEntity(in);
        }

        @Override
        public ClientEntity[] newArray(int size) {
            return new ClientEntity[size];
        }
    };
}
