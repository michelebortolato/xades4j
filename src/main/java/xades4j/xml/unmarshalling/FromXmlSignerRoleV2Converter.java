/*
 * XAdES4j - A Java library for generation and verification of XAdES signatures.
 * Copyright (C) 2010 Luis Goncalves.
 *
 * XAdES4j is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or any later version.
 *
 * XAdES4j is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with XAdES4j. If not, see <http://www.gnu.org/licenses/>.
 */
package xades4j.xml.unmarshalling;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import xades4j.properties.SignerRoleV2Property;
import xades4j.properties.data.SignerRoleV2Data;
import xades4j.xml.bind.xades.XmlAnyType;
import xades4j.xml.bind.xades.XmlSignedSignaturePropertiesType;
import xades4j.xml.bind.xades.XmlSignerRoleV2Type;

/**
 *
 * @author Luís
 */
class FromXmlSignerRoleV2Converter implements SignedSigPropFromXmlConv
{
    @Override
    public void convertFromObjectTree(
            XmlSignedSignaturePropertiesType xmlProps,
            QualifyingPropertiesDataCollector propertyDataCollector) throws PropertyUnmarshalException
    {
        XmlSignerRoleV2Type xmlSignerRole = xmlProps.getSignerRoleV2();
        if (null == xmlSignerRole)
            return;

        if(xmlSignerRole.getCertifiedRolesV2() != null) {        	
        	throw new PropertyUnmarshalException("certified roles not supported", SignerRoleV2Property.PROP_NAME);
        }
        if(xmlSignerRole.getSignedAssertions() != null) {        	
        	throw new PropertyUnmarshalException("signer assertions not supported", SignerRoleV2Property.PROP_NAME);
        }

        Set<String> claimedRoles = new HashSet<String>();

        for (XmlAnyType xmlRole : xmlSignerRole.getClaimedRoles().getClaimedRole())
        {
            List contents = xmlRole.getContent();
            if(contents.size() != 1 || !(contents.get(0) instanceof String))
                throw new PropertyUnmarshalException("unsupported claimed role. Only one string is supported", SignerRoleV2Property.PROP_NAME);
            claimedRoles.add((String)contents.get(0));
        }

        propertyDataCollector.setSignerRoleV2(new SignerRoleV2Data(claimedRoles));
    }
}
