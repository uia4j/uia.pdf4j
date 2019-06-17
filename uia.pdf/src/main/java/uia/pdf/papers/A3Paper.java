/*
 * Copyright 2015 uia.pdf
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uia.pdf.papers;

import org.apache.pdfbox.pdmodel.common.PDRectangle;

/**
 * Paper of A3 size.
 *
 * @author Kan Lin
 *
 */
public class A3Paper extends Paper {


    public static final int WIDTH = (int) PDRectangle.A3.getWidth();

    public static final int HEIGTH = (int) PDRectangle.A3.getHeight();

    public static A3Paper landscape() {
        return new A3Paper(true);
    }
    
    public static A3Paper portrait() {
        return new A3Paper(false);
    }

    /**
     * Constructor.
     */
    public A3Paper() {
        this(false);
    }

    /**
     * Constructor.
     * @param landscape Landscape or not.
     */
    public A3Paper(boolean landscape) {
        super(landscape ? new PDRectangle(PDRectangle.A3.getHeight(), PDRectangle.A3.getWidth()) : PDRectangle.A3);
    }
}
