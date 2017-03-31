package com.nymisha.main;
// Created a class InvalidCountryException as 
//public class InvalidCountryException extends Exception {}

//And below is the main class 

import java.util.ArrayList;
import java.util.List;
 
public class CountryMain {
 
 public static void main(String args[]) {
  List<Country> countries = new ArrayList<Country>();
  Country indiaCountry = new Country("India");
  Country chinaCountry = new Country("China");
  
  countries.add(indiaCountry);
  countries.add(chinaCountry);
  
  boolean safe;
  try {
   safe = checkListOfCountries(countries);
   if (safe)
    System.out.println("We don't have USA in list of Countries");
   Country USACountry = new Country("USA");
   countries.add(USACountry);
   checkListOfCountries(countries);
  } catch (InvalidCountryException e) {
   e.printStackTrace();
  }
 
 }
 
