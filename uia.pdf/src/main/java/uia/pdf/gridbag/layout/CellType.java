
package uia.pdf.gridbag.layout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="borderSize" type="{http://www.w3.org/2001/XMLSchema}float" default="0.5" />
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="background" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="alignment" type="{http://www.w3.org/2001/XMLSchema}string" default="CENTER" />
 *       &lt;attribute name="valignment" type="{http://www.w3.org/2001/XMLSchema}string" default="CENTER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellType")
@XmlSeeAlso({
    ImageCellType.class,
    BindCellType.class,
    TextCellType.class
})
public abstract class CellType {

    @XmlAttribute
    protected Integer rowspan;
    @XmlAttribute
    protected Integer colspan;
    @XmlAttribute
    protected Float borderSize;
    @XmlAttribute
    protected String borderColor;
    @XmlAttribute
    protected String background;
    @XmlAttribute
    protected Integer fontSize;
    @XmlAttribute
    protected String alignment;
    @XmlAttribute
    protected String valignment;

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRowspan() {
        if (rowspan == null) {
            return  1;
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowspan(Integer value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getColspan() {
        if (colspan == null) {
            return  1;
        } else {
            return colspan;
        }
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColspan(Integer value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the borderSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getBorderSize() {
        if (borderSize == null) {
            return  0.5F;
        } else {
            return borderSize;
        }
    }

    /**
     * Sets the value of the borderSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBorderSize(Float value) {
        this.borderSize = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackground(String value) {
        this.background = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        if (alignment == null) {
            return "CENTER";
        } else {
            return alignment;
        }
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the valignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValignment() {
        if (valignment == null) {
            return "CENTER";
        } else {
            return valignment;
        }
    }

    /**
     * Sets the value of the valignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValignment(String value) {
        this.valignment = value;
    }

}
