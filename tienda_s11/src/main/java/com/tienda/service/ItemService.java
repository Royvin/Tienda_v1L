/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author royam
 */
public interface ItemService {
    List <Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    //Recuperar el registro que tiene el ID Item pasado por parametro
    //vamos a optenerlo por medio del item = idItem
    public Item get (Item item);
    
    //aqui eliminamos los items por medio de sus ids
    public void delete (Item item);
    
    public void save (Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
    
    
}
