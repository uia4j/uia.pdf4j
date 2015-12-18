
package uia.pdf.grid.layout;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uia.pdf.grid.layout package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Layout_QNAME = new QName("http://grid.pdf.uia/layout", "layout");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uia.pdf.grid.layout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ColumnType }
     * 
     */
    public ColumnType createColumnType() {
        return new ColumnType();
    }

    /**
     * Create an instance of {@link LayoutType }
     * 
     */
    public LayoutType createLayoutType() {
        return new LayoutType();
    }

    /**
     * Create an instance of {@link GridType.Columns }
     * 
     */
    public GridType.Columns createGridTypeColumns() {
        return new GridType.Columns();
    }

    /**
     * Create an instance of {@link GridType }
     * 
     */
    public GridType createGridType() {
        return new GridType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grid.pdf.uia/layout", name = "layout")
    public JAXBElement<LayoutType> createLayout(LayoutType value) {
        return new JAXBElement<LayoutType>(_Layout_QNAME, LayoutType.class, null, value);
    }

}
