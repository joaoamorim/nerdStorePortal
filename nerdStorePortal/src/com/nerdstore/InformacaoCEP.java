
package com.nerdstore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InformacaoCEP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InformacaoCEP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewElement3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewElement2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewElement1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BrRobotic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BrRobotic1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BrRobotic2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacaoCEP", propOrder = {
    "cep",
    "endereco",
    "estado",
    "newElement3",
    "newElement2",
    "newElement1",
    "newElement",
    "brRobotic",
    "brRobotic1",
    "brRobotic2"
})
public class InformacaoCEP {

    @XmlElement(required = true)
    protected String cep;
    @XmlElement(required = true)
    protected String endereco;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "NewElement3", required = true)
    protected String newElement3;
    @XmlElement(name = "NewElement2", required = true)
    protected String newElement2;
    @XmlElement(name = "NewElement1", required = true)
    protected String newElement1;
    @XmlElement(name = "NewElement", required = true)
    protected String newElement;
    @XmlElement(name = "BrRobotic", required = true)
    protected String brRobotic;
    @XmlElement(name = "BrRobotic1", required = true)
    protected String brRobotic1;
    @XmlElement(name = "BrRobotic2", required = true)
    protected String brRobotic2;

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtém o valor da propriedade newElement3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewElement3() {
        return newElement3;
    }

    /**
     * Define o valor da propriedade newElement3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewElement3(String value) {
        this.newElement3 = value;
    }

    /**
     * Obtém o valor da propriedade newElement2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewElement2() {
        return newElement2;
    }

    /**
     * Define o valor da propriedade newElement2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewElement2(String value) {
        this.newElement2 = value;
    }

    /**
     * Obtém o valor da propriedade newElement1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewElement1() {
        return newElement1;
    }

    /**
     * Define o valor da propriedade newElement1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewElement1(String value) {
        this.newElement1 = value;
    }

    /**
     * Obtém o valor da propriedade newElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewElement() {
        return newElement;
    }

    /**
     * Define o valor da propriedade newElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewElement(String value) {
        this.newElement = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrRobotic() {
        return brRobotic;
    }

    /**
     * Define o valor da propriedade brRobotic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrRobotic(String value) {
        this.brRobotic = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrRobotic1() {
        return brRobotic1;
    }

    /**
     * Define o valor da propriedade brRobotic1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrRobotic1(String value) {
        this.brRobotic1 = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrRobotic2() {
        return brRobotic2;
    }

    /**
     * Define o valor da propriedade brRobotic2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrRobotic2(String value) {
        this.brRobotic2 = value;
    }

}
