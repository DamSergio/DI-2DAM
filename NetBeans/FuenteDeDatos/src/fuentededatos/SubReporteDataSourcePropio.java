/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentededatos;

import java.util.ArrayList;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author Sergio
 */
public class SubReporteDataSourcePropio {
    public static void main(String[] args) {
        ArrayList listaAlumnos = new ArrayList();
        for(int i =1; i<=5;i++) {
            Alumno alumno = new Alumno (i, "0000"+i,"Alumno"+i);
            listaAlumnos.add(alumno);

            for (int j=1; j<=3;j++) {
                alumno.addMateria(new Materia(j,"Materia"+j));
            }
        }
        
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport("informe/FuenteDeDatosAlumnosMateria.jasper",null,new JRBeanCollectionDataSource(listaAlumnos));
            JasperExportManager.exportReportToPdfFile(jasperPrint,"informe/reporteMaestrosDS.pdf");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
