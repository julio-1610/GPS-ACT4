/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textdetection;

/**
 *
 * @author User
 */
import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TextDetectionSimple {

    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {

            tesseract.setDatapath("src\\main\\resources\\tessdata");

            // the path of your tess data folder 
            // inside the extracted file 
            String text
                    = tesseract.doOCR(new File("src\\main\\resources\\images\\ruido3.jpeg"));

            // path of your image file 
            System.out.print("DNI Identificado: " + text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}

