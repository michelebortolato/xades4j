package xades4j.algorithms;

import org.apache.xml.security.c14n.Canonicalizer;

/**
 *
 * @author michele
 */


public class CanonicalXMLWithoutComments11 extends Algorithm{
    public CanonicalXMLWithoutComments11(){
	super(Canonicalizer.ALGO_ID_C14N11_OMIT_COMMENTS);
    }
}
