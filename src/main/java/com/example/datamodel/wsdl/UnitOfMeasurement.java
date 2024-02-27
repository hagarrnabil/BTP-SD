
package com.example.datamodel.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitOfMeasurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://sap.com/xi/FNDEI}UnitOfMeasurementCode"/&gt;
 *         &lt;element name="ISOCode" type="{http://sap.com/xi/FNDEI}UnitOfMeasurementCode" minOccurs="0"/&gt;
 *         &lt;element name="CommercialDescription" type="{http://sap.com/xi/FNDEI}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDescription" type="{http://sap.com/xi/FNDEI}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LongDescription" type="{http://sap.com/xi/FNDEI}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllownonwholeIndicator" type="{http://sap.com/xi/FNDEI}Indicator"/&gt;
 *         &lt;element name="PreferredMappingIndicator" type="{http://sap.com/xi/FNDEI}Indicator"/&gt;
 *         &lt;element name="Category" type="{http://sap.com/xi/FNDEI}NumberValue"/&gt;
 *         &lt;element name="NumberOfDecimalPlaces" type="{http://sap.com/xi/FNDEI}NumberValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasurement", propOrder = {
    "code",
    "isoCode",
    "commercialDescription",
    "technicalDescription",
    "longDescription",
    "allownonwholeIndicator",
    "preferredMappingIndicator",
    "category",
    "numberOfDecimalPlaces"
})
public class UnitOfMeasurement {

    @XmlElement(name = "Code", required = true)
    protected UnitOfMeasurementCode code;
    @XmlElement(name = "ISOCode")
    protected UnitOfMeasurementCode isoCode;
    @XmlElement(name = "CommercialDescription")
    protected List<Description> commercialDescription;
    @XmlElement(name = "TechnicalDescription")
    protected List<Description> technicalDescription;
    @XmlElement(name = "LongDescription")
    protected List<Description> longDescription;
    @XmlElement(name = "AllownonwholeIndicator")
    protected boolean allownonwholeIndicator;
    @XmlElement(name = "PreferredMappingIndicator")
    protected boolean preferredMappingIndicator;
    @XmlElement(name = "Category")
    protected int category;
    @XmlElement(name = "NumberOfDecimalPlaces")
    protected int numberOfDecimalPlaces;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurementCode }
     *     
     */
    public UnitOfMeasurementCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurementCode }
     *     
     */
    public void setCode(UnitOfMeasurementCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurementCode }
     *     
     */
    public UnitOfMeasurementCode getISOCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurementCode }
     *     
     */
    public void setISOCode(UnitOfMeasurementCode value) {
        this.isoCode = value;
    }

    /**
     * Gets the value of the commercialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commercialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getCommercialDescription() {
        if (commercialDescription == null) {
            commercialDescription = new ArrayList<Description>();
        }
        return this.commercialDescription;
    }

    /**
     * Gets the value of the technicalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the technicalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getTechnicalDescription() {
        if (technicalDescription == null) {
            technicalDescription = new ArrayList<Description>();
        }
        return this.technicalDescription;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the longDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getLongDescription() {
        if (longDescription == null) {
            longDescription = new ArrayList<Description>();
        }
        return this.longDescription;
    }

    /**
     * Gets the value of the allownonwholeIndicator property.
     * 
     */
    public boolean isAllownonwholeIndicator() {
        return allownonwholeIndicator;
    }

    /**
     * Sets the value of the allownonwholeIndicator property.
     * 
     */
    public void setAllownonwholeIndicator(boolean value) {
        this.allownonwholeIndicator = value;
    }

    /**
     * Gets the value of the preferredMappingIndicator property.
     * 
     */
    public boolean isPreferredMappingIndicator() {
        return preferredMappingIndicator;
    }

    /**
     * Sets the value of the preferredMappingIndicator property.
     * 
     */
    public void setPreferredMappingIndicator(boolean value) {
        this.preferredMappingIndicator = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Gets the value of the numberOfDecimalPlaces property.
     * 
     */
    public int getNumberOfDecimalPlaces() {
        return numberOfDecimalPlaces;
    }

    /**
     * Sets the value of the numberOfDecimalPlaces property.
     * 
     */
    public void setNumberOfDecimalPlaces(int value) {
        this.numberOfDecimalPlaces = value;
    }

}