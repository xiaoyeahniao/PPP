package com.objectmentor.library.web.framework.mocks;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.util.*;

/**
 * @noinspection deprecation
 */
public class MockHttpSession implements HttpSession {
  private Map attributes = new HashMap();

  public long getCreationTime() {
    return 0;
  }

  public String getId() {
    return null;
  }

  public long getLastAccessedTime() {
    return 0;
  }

  public ServletContext getServletContext() {
    return null;
  }

  public void setMaxInactiveInterval(int i) {
  }

  public int getMaxInactiveInterval() {
    return 0;
  }

  public HttpSessionContext getSessionContext() {
    return null;
  }

  public Object getAttribute(String string) {
    return attributes.get(string);
  }

  public Object getValue(String string) {
    return null;
  }

  public Enumeration getAttributeNames() {
    return null;
  }

  public String[] getValueNames() {
    return new String[0];
  }

  public void setAttribute(String string, Object object) {
    attributes.put(string, object);
  }

  public void putValue(String string, Object object) {
  }

  public void removeAttribute(String string) {
  }

  public void removeValue(String string) {
  }

  public void invalidate() {
  }

  public boolean isNew() {
    return false;
  }
}
