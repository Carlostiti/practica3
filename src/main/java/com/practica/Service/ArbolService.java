/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.Service;

import com.practica.Domain1.Arbol;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface ArbolService {
 
    public List<Arbol> getArboles(boolean activos);
    
   
    public Arbol getArbol(Arbol arbol);
    
    
    public void save(Arbol arbol);
    
   
    public void delete(Arbol arbol);
}
