/* 
 * Copyright 2019 Elísabet Palomino .
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

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {            //System es una clase,out es un recurso de la clase System. el punto indica el recurso. 

        //Manera 1
        System.out.println("ARTÍCULO 1. El jefe tiene la razón.");
        System.out.println("ARTÍCULO 2. El jefe SIEMPRE tiene la razón.");
        System.out.println("ARTÍCULO 3. En caso de duda se aplicará el artículo 2.");

        //Manera 2     
        System.out.println(" ");

        final String REGLA1 = "ARTÍCULO %d.";
        final String REGLA2 = "El jefe %s tiene la razón.";
        final String REGLA3 = "En caso de duda se aplicará el artículo 2.";

        System.out.printf(REGLA1 + REGLA2 + "%n", 1, "");
        System.out.printf(REGLA1 + REGLA2 + "%n", 2, "SIEMPRE");
        System.out.printf(REGLA1 + REGLA3 + "%n", 3);

    }//main

}//class
