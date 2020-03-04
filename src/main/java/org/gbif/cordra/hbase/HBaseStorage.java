package org.gbif.cordra.hbase;

import net.cnri.cordra.api.CordraException;
import net.cnri.cordra.api.CordraObject;
import net.cnri.cordra.api.SearchResults;
import net.cnri.cordra.storage.CordraStorage;
import java.io.IOException;
import java.io.InputStream;


/**
 * An HBase Storage handler for Cordra.
 */
public class HBaseStorage implements CordraStorage {

  @Override
  public CordraObject get(String s) throws CordraException {
    return null;
  }

  @Override
  public InputStream getPayload(String s, String s1) throws CordraException {
    return null;
  }

  @Override
  public InputStream getPartialPayload(String s, String s1, Long aLong, Long aLong1) throws CordraException {
    return null;
  }

  @Override
  public CordraObject create(CordraObject cordraObject) throws CordraException {
    return null;
  }

  @Override
  public CordraObject update(CordraObject cordraObject) throws CordraException {
    return null;
  }

  @Override
  public void delete(String s) throws CordraException {

  }

  @Override
  public SearchResults<CordraObject> list() throws CordraException {
    return null;
  }

  @Override
  public SearchResults<String> listHandles() throws CordraException {
    return null;
  }

  @Override
  public void close() throws IOException, CordraException {

  }
}
