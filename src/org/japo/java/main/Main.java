/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - joanpon@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constantes
//        final double CAMINO = 980;
        final double CAMINO = 100;

        // Variables
        double traslado;
        double jornadas;

        try {
            // Recorrido diario
            System.out.print("Desplazamiento diario (km) ...: ");
            traslado = SCN.nextDouble();

            // Jornadas
            jornadas = CAMINO / traslado;

            // Mensaje
            System.out.printf(Locale.ENGLISH,
                    "Días de Clases/Camino ........: %d%n",
                    (int) jornadas < jornadas ? (int) jornadas + 1 : (int) jornadas);
        } catch (Exception e) {
            System.out.println("Error de entrada");
        } finally {
            SCN.nextLine();
        }
    }
}
