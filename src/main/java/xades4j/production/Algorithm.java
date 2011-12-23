/*
 * XAdES4j - A Java library for generation and verification of XAdES signatures.
 * Copyright (C) 2011 Luis Goncalves.
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

package xades4j.production;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import xades4j.utils.DOMHelper;

/**
 * Represents algorithms used on the signature, such as data object transforms,
 * signature algorithms or canonicalization algorithms.
 *
 * @see xades4j.providers.AlgorithmsProviderEx
 * @see xades4j.properties.DataObjectDesc#withTransform(Algorithm)
 *
 * @author Luís
 */
public class Algorithm
{
    private final String uri;
    private final NodeList params;

    /**
     * Creates a new instance. If any parameter nodes are supplied, they must
     * belong to the signature document.
     * @param uri the algorithm's URI
     * @param params the list of algorithm parameter nodes (can be {@code null} but not empty)
     */
    public Algorithm(String uri, NodeList params)
    {
        if (uri == null)
        {
            throw new NullPointerException("Algorithm URI cannot be null");
        }

        if(params != null && params.getLength() == 0)
        {
            throw new IllegalArgumentException("Algorithm parameters list cannt be empty");
        }
        
        this.uri = uri;
        this.params = params;
    }

    /**
     * Creates a new instance. If any parameter nodes are supplied, they must
     * belong to the signature document.
     * @param uri the algorithm's URI
     * @param params the algorithm parameter nodes(optional)
     */
    public Algorithm(String uri, Node... params)
    {       
        this(uri, params.length == 0 ? null : DOMHelper.nodeList(params));
    }

    public String getUri()
    {
        return this.uri;
    }

    /**
     * Gets the algorithm parameters. The signature document is passed because
     * it may allow a simpler public API on subclasses. The base implementation
     * simply returns the parameters supplied on the constructor (possibly {@code
     * null}), but subclasses may override this method and use the {@code Document}
     * to produce the XML nodes for the parameters at this point.
     * @param signatureDocument the document that owns the signature
     * @return a node list with the algorithm paramters or {@code null} if none
     */
    protected NodeList getParams(Document signatureDocument)
    {
        return this.params;
    }
}