package com.org.questions.providers;

import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.provider.FacetValueDisplayNameProvider;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;

public class QuestionCountFacetDisplayNameProvider implements FacetValueDisplayNameProvider {
    @Override
    public String getDisplayName(SearchQuery searchQuery, IndexedProperty indexedProperty, String s) {
        return s;
    }
}
