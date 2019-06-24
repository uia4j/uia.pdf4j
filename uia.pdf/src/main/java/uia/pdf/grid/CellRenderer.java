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

package uia.pdf.grid;

import java.awt.Point;

import org.apache.pdfbox.pdmodel.PDPageContentStream;

/**
 * Cell renderer.
 *
 * @author Kan Lin
 *
 */
public interface CellRenderer {

    /**
     *
     * @param contentStream Content stream of page.
     * @param topLeft Axis of top-left.
     * @param view Abstract grid view.
     * @param cm Column model.
     * @param value Data used to display.
     * @param row Row index.
     * @param col Column index.
     * @return height of cell.
     */
    public int paint(PDPageContentStream contentStream, Point topLeft, GridView view, ColumnModel cm, Object value, int row, int col);
}
