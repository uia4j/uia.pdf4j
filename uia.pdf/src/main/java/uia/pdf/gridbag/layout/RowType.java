
package uia.pdf.gridbag.layout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="textCell" type="{http://gridbag.pdf.uia/layout}TextCellType"/>
 *           &lt;element name="bindCell" type="{http://gridbag.pdf.uia/layout}BindCellType"/>
 *           &lt;element name="imageCell" type="{http://gridbag.pdf.uia/layout}ImageCellType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "RowType", propOrder = {
    "textCellOrBindCellOrImageCell"
})
public class RowType {

    @XmlElements({
        @XmlElement(name = "bindCell", type = BindCellType.class),
        @XmlElement(name = "textCell", type = TextCellType.class),
        @XmlElement(name = "imageCell", type = ImageCellType.class)
    })
    protected List<CellType> textCellOrBindCellOrImageCell;
    @XmlAttribute(required = true)
    protected String height;
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
     * Gets the value of the textCellOrBindCellOrImageCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textCellOrBindCellOrImageCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextCellOrBindCellOrImageCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindCellType }
     * {@link TextCellType }
     * {@link ImageCellType }
     * 
     * 
     */
    public List<CellType> getTextCellOrBindCellOrImageCell() {
        if (textCellOrBindCellOrImageCell == null) {
            textCellOrBindCellOrImageCell = new ArrayList<CellType>();
        }
        return this.textCellOrBindCellOrImageCell;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
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
