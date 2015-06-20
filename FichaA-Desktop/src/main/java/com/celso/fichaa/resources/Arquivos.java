/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.resources;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import tools.devnull.trugger.scan.ClassScan;
import static tools.devnull.trugger.scan.ClassScan.scan;

/**
 *
 * @author Celso Bomfim
 */
public class Arquivos {

    public static void criarArquivoDAO() throws IOException {
        Reflections r = new Reflections(
                "com.celso.fichaa.model",
                new SubTypesScanner(false)
                //ClasspathHelper.forClassLoader()
        );
        Set<Class<?>> classes = r.getSubTypesOf(Object.class);

        
        for (Class c : classes) {
            System.out.println(c.getName());
            File file = new File("D:/Classes/"+c.getSimpleName()+"DAOImpl.java");
            FileWriter writer = new FileWriter(file);
            PrintWriter saida = new PrintWriter(writer, true);

            saida.println("package com.celso.fichaa.model.dao.impl;");

            saida.println();
            saida.println();
            saida.println();
            
            String nome = c.getSimpleName();
            saida.println("import com.celso.fichaa.model."+nome+";");
            saida.println("import com.celso.fichaa.model.dao."+nome+"DAO;");
            saida.println("import com.celso.fichaa.model.dao.TOBaseHibernateDao;");
            
            saida.println();
            saida.println();
            saida.println();
            
            saida.println("public class "+nome+"DAOImpl extends "
                    + "TOBaseHibernateDao implements "+nome+"DAO {");
            saida.println();
            saida.println();
            saida.println(" public "+nome+"DAOImpl() {");
            saida.println("super("+nome+".class);");
            saida.println("}");
            saida.println();
            
            saida.println("}");
            
            saida.close();
            writer.close();
        }
    }

}
