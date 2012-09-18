package org.apache.solr.search;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.lucene.index.IndexReader;

public interface SolrCacheWithReader<T> {
	public void setReader(IndexReader reader);
	
	  public Object put(Object key, Object value, Set<T> terms);

	  public Object get(Object key, Set<T> terms);

	  public void acquireLock(Set<T> terms);

	  public void releaseLock(Set<T> terms);
	  
	  public void flushThreadLocalCache() throws IOException;
}
