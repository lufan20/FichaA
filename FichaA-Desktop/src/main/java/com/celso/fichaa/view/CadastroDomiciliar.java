/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.view;

import com.celso.fichaa.resources.Assets;
import com.celso.fichaa.resources.Core;
import fxml.CadastroDomiciliarController;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author Celso Bomfim
 */
public class CadastroDomiciliar extends Core{
    
    private CadastroDomiciliarController control;

    @Override
    public void initComponents() throws IOException {
        super.initComponents(); 
        
        this.control = (CadastroDomiciliarController) this.getController();
    }
    
    

    @Override
    public URL inserirAsset() {
        return Assets.CADASTRO_DOMICILIAR;
    }
    
}
