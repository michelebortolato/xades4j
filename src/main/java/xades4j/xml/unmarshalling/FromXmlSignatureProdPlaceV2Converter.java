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

import xades4j.xml.bind.xades.XmlSignatureProductionPlaceV2Type;
import xades4j.xml.bind.xades.XmlSignedSignaturePropertiesType;
import xades4j.properties.data.SignatureProdPlaceV2Data;

/**
 *
 * @author Luís
 */
class FromXmlSignatureProdPlaceV2Converter implements SignedSigPropFromXmlConv
{
    @Override
    public void convertFromObjectTree(
            XmlSignedSignaturePropertiesType xmlProps,
            QualifyingPropertiesDataCollector propertyDataCollector) throws PropertyUnmarshalException
    {
        XmlSignatureProductionPlaceV2Type xmlSigProdPlace = xmlProps.getSignatureProductionPlaceV2();
        if (null == xmlSigProdPlace)
            return;

        propertyDataCollector.setSignatureProdPlaceV2(new SignatureProdPlaceV2Data(
                xmlSigProdPlace.getCity(),
                xmlSigProdPlace.getStateOrProvince(),
                xmlSigProdPlace.getPostalCode(),
                xmlSigProdPlace.getCountryName(),
                xmlSigProdPlace.getStreetAddress()));
    }
}
