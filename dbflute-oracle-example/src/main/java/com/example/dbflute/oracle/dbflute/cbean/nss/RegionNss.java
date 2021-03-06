package com.example.dbflute.oracle.dbflute.cbean.nss;

import com.example.dbflute.oracle.dbflute.cbean.cq.RegionCQ;

/**
 * The nest select set-upper of REGION.
 * @author oracleman
 */
public class RegionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RegionCQ _query;
    public RegionNss(RegionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
