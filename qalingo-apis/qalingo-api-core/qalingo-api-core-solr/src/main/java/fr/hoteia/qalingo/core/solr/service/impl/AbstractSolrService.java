/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.solr.service.impl;

import org.apache.solr.client.solrj.SolrServer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class AbstractSolrService.
 */
public abstract class AbstractSolrService {

    /** The product solr server. */
    @Autowired
    public SolrServer productSolrServer;

    /** The customer solr server. */
    @Autowired
    public SolrServer customerSolrServer;

    /** The category solr server. */
    @Autowired
    public SolrServer categorySolrServer;

    /** The store solr server. */
    @Autowired
    public SolrServer storeSolrServer;

}