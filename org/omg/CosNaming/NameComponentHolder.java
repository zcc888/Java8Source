package org.omg.CosNaming;

/**
* org/omg/CosNaming/NameComponentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u161/10277/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, December 19, 2017 4:13:18 PM PST
*/

public final class NameComponentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NameComponent value = null;

  public NameComponentHolder ()
  {
  }

  public NameComponentHolder (org.omg.CosNaming.NameComponent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NameComponentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NameComponentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NameComponentHelper.type ();
  }

}
