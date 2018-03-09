# https://github.com/michelebortolato/xades4j

This project is a fork of https://github.com/luisgoncalves/xades4j 

The major modifies applied are made in order to made the original librare compliant to the latest ETSI xades specification (http://www.etsi.org/deliver/etsi_ts%5C101900_101999%5C101903%5C01.04.02_60%5Cts_101903v010402p.pdf)



_XAdES4j_ is an high-level, configurable and extensible Java implementation of XML Advanced Electronic Signatures (XAdES 1.3.2 and 1.4.1). It enables producing, verifying and extending signatures in the main XAdES forms: XAdES-BES, XAdES-EPES, XAdES-T and XAdES-C. Also, extended forms are supported through the enrichment of an existing signature.

The API provides an high level of abstraction, handling all the structural details of XAdES. The library relies on Apache XML Security for the core XML-DSIG processing and uses Guice to assemble the different configurable components.

There are multiple implementations of XML-DSIG, namely the one bundled with the Java platform and the one in Apache XML Security. However, Java doesn't have support for XAdES and solid/complete/public implementations are hard to find. The motivation for this project emerges directly  from those facts.

