package com.meuapp;

public class TiposPrimitivos {
  public static void main(String[] args) {
    // tipos primitivos em java

    // widening casting
    // int meuInteiro = 100;
    // double meuDouble = meuInteiro;

    // System.out.println(meuInteiro); // 100
    // System.out.println(meuDouble); // 100.0

    // narrowing casting sem estouro de valor
    double meuDouble = 9.78;
    int meuInteiro = (int) meuDouble;

    System.out.println(meuDouble); // 9.78
    System.out.println(meuInteiro); // 9

    // narrowing cast com estouro de valor
    int inteiroGrande = 300;
    byte meuByte = (byte) inteiroGrande;

    System.out.println(inteiroGrande); // 300
    System.out.println(meuByte); // 44
  }
}
