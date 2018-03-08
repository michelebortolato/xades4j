//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.11 at 01:48:06 PM CET 
//


package xades4j.xml.bind.xades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerRoleV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerRoleV2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRoles" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesV2" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedAssertions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleV2Type", propOrder = {
    "claimedRoles",
    "certifiedRolesV2",
    "signedAssertions"
})
public class XmlSignerRoleV2Type {

    @XmlElement(name = "ClaimedRoles")
    protected XmlClaimedRolesListType claimedRoles;
    @XmlElement(name = "CertifiedRolesV2")
    protected XmlCertifiedRolesListTypeV2 certifiedRolesV2;
    @XmlElement(name = "SignedAssertions")
    protected XmlSignedAssertionsListType signedAssertions;

    /**
     * Gets the value of the claimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link XmlClaimedRolesListType }
     *     
     */
    public XmlClaimedRolesListType getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Sets the value of the claimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlClaimedRolesListType }
     *     
     */
    public void setClaimedRoles(XmlClaimedRolesListType value) {
        this.claimedRoles = value;
    }

    /**
     * Gets the value of the certifiedRolesV2 property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCertifiedRolesListTypeV2 }
     *     
     */
    public XmlCertifiedRolesListTypeV2 getCertifiedRolesV2() {
        return certifiedRolesV2;
    }

    /**
     * Sets the value of the certifiedRolesV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCertifiedRolesListTypeV2 }
     *     
     */
    public void setCertifiedRolesV2(XmlCertifiedRolesListTypeV2 value) {
        this.certifiedRolesV2 = value;
    }

    /**
     * Gets the value of the signedAssertions property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignedAssertionsListType }
     *     
     */
    public XmlSignedAssertionsListType getSignedAssertions() {
        return signedAssertions;
    }

    /**
     * Sets the value of the signedAssertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignedAssertionsListType }
     *     
     */
    public void setSignedAssertions(XmlSignedAssertionsListType value) {
        this.signedAssertions = value;
    }

}
