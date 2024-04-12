/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproject;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author estudiantelis
 */
public class ModelProductInvTable extends AbstractTableModel{
    
    List<Product> product;
    String[] columnNames = {"Product name", "Price", "Stock"};
    
    public ModelProductInvTable(List<Product> product){
        this.product = product;
    }
    
     public void AddProduct(Product product){
        this.product.add(product);
        this.fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
        return this.product.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var product = this.product.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                product.getProductName();
            case 1 ->
                product.getPrice();
            case 2 ->
                product.getStock();
            default ->
                product;
        };
    }
    
    
    
}
