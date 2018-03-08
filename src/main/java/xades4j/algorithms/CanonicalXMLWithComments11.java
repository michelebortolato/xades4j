package xades4j.algorithms;

import org.apache.xml.security.c14n.Canonicalizer;

/**
 *
 * @author michele
 */


public class CanonicalXMLWithComments11 extends Algorithm {
    
    public CanonicalXMLWithComments11(){
	super(Canonicalizer.ALGO_ID_C14N11_WITH_COMMENTS);
    }
    
}
