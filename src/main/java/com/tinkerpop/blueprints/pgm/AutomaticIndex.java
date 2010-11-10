package com.tinkerpop.blueprints.pgm;

import java.util.Set;

/**
 * An automatic index will automatically maintain an index of element properties as the element properties mutate.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public interface AutomaticIndex<T extends Element> extends Index<T> {

    /**
     * Add an element property key that should be indexed.
     *
     * @param key the element property key to be indexed
     */
    public void addAutoIndexKey(String key);

    /**
     * Remove an element property key from being indexed.
     *
     * @param key the element property to key to not be indexed
     */
    public void removeAutoIndexKey(String key);

    /**
     * Get all the element property keys currently being indexed
     *
     * @return the set of element property keys being indexed
     */
    public Set<String> getAutoIndexKeys();

}