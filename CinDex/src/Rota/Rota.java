package Rota;

import erros.*;

public class Rota {

    //Atributos exclusivos classe Rota;
    private String tipo;
    private String periculosidade;
    private String codigo;
    private double distancia;

    public Rota(String periculosidade, String tipo, String codigo, double distancia)
            throws PericulosidadeInvalidaException, TipoInvalidoException, CodigoInvalidoException {

        //Verifica se a periculosidade é uma string valida;
        if (periculosidade.equalsIgnoreCase("Perigosa") || periculosidade.equalsIgnoreCase("Segura")) {
            this.periculosidade = periculosidade;
        } else {
            PericulosidadeInvalidaException e;
            e = new PericulosidadeInvalidaException();
            throw e;
        }

        //Verifica se o tipo e uma string valida;
        if (tipo.equalsIgnoreCase("Urbana") || tipo.equalsIgnoreCase("Rural")) {
            this.tipo = tipo;
        } else {
            TipoInvalidoException e;
            e = new TipoInvalidoException();
            throw e;
        }

        //Verifica se o codigo e uma string valida;
        if (codigo.length() == 5) {
            this.codigo = codigo;
        } else {
            CodigoInvalidoException e;
            e = new CodigoInvalidoException();
            throw e;
        }

        this.distancia = distancia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPericulosidade() {
        return this.periculosidade;
    }

    public void setPericulosidade(String periculosidade) {
        this.periculosidade = periculosidade;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}